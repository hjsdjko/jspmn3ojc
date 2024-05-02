package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XuexiaozhuguanDao;
import com.entity.XuexiaozhuguanEntity;
import com.service.XuexiaozhuguanService;
import com.entity.vo.XuexiaozhuguanVO;
import com.entity.view.XuexiaozhuguanView;

@Service("xuexiaozhuguanService")
public class XuexiaozhuguanServiceImpl extends ServiceImpl<XuexiaozhuguanDao, XuexiaozhuguanEntity> implements XuexiaozhuguanService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuexiaozhuguanEntity> page = this.selectPage(
                new Query<XuexiaozhuguanEntity>(params).getPage(),
                new EntityWrapper<XuexiaozhuguanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuexiaozhuguanEntity> wrapper) {
		  Page<XuexiaozhuguanView> page =new Query<XuexiaozhuguanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuexiaozhuguanVO> selectListVO(Wrapper<XuexiaozhuguanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuexiaozhuguanVO selectVO(Wrapper<XuexiaozhuguanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuexiaozhuguanView> selectListView(Wrapper<XuexiaozhuguanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuexiaozhuguanView selectView(Wrapper<XuexiaozhuguanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
