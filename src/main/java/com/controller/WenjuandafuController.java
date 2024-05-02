package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.WenjuandafuEntity;
import com.entity.view.WenjuandafuView;

import com.service.WenjuandafuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 问卷答复
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-18 10:53:24
 */
@RestController
@RequestMapping("/wenjuandafu")
public class WenjuandafuController {
    @Autowired
    private WenjuandafuService wenjuandafuService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WenjuandafuEntity wenjuandafu, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xiaoyou")) {
			wenjuandafu.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<WenjuandafuEntity> ew = new EntityWrapper<WenjuandafuEntity>();
    	PageUtils page = wenjuandafuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wenjuandafu), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WenjuandafuEntity wenjuandafu, 
		HttpServletRequest request){
        EntityWrapper<WenjuandafuEntity> ew = new EntityWrapper<WenjuandafuEntity>();
    	PageUtils page = wenjuandafuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wenjuandafu), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WenjuandafuEntity wenjuandafu){
       	EntityWrapper<WenjuandafuEntity> ew = new EntityWrapper<WenjuandafuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wenjuandafu, "wenjuandafu")); 
        return R.ok().put("data", wenjuandafuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WenjuandafuEntity wenjuandafu){
        EntityWrapper< WenjuandafuEntity> ew = new EntityWrapper< WenjuandafuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wenjuandafu, "wenjuandafu")); 
		WenjuandafuView wenjuandafuView =  wenjuandafuService.selectView(ew);
		return R.ok("查询问卷答复成功").put("data", wenjuandafuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WenjuandafuEntity wenjuandafu = wenjuandafuService.selectById(id);
        return R.ok().put("data", wenjuandafu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WenjuandafuEntity wenjuandafu = wenjuandafuService.selectById(id);
        return R.ok().put("data", wenjuandafu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WenjuandafuEntity wenjuandafu, HttpServletRequest request){
    	wenjuandafu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wenjuandafu);

        wenjuandafuService.insert(wenjuandafu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WenjuandafuEntity wenjuandafu, HttpServletRequest request){
    	wenjuandafu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wenjuandafu);

        wenjuandafuService.insert(wenjuandafu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody WenjuandafuEntity wenjuandafu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wenjuandafu);
        wenjuandafuService.updateById(wenjuandafu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wenjuandafuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<WenjuandafuEntity> wrapper = new EntityWrapper<WenjuandafuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xiaoyou")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = wenjuandafuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	





}
