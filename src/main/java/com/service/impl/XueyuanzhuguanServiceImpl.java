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


import com.dao.XueyuanzhuguanDao;
import com.entity.XueyuanzhuguanEntity;
import com.service.XueyuanzhuguanService;
import com.entity.vo.XueyuanzhuguanVO;
import com.entity.view.XueyuanzhuguanView;

@Service("xueyuanzhuguanService")
public class XueyuanzhuguanServiceImpl extends ServiceImpl<XueyuanzhuguanDao, XueyuanzhuguanEntity> implements XueyuanzhuguanService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueyuanzhuguanEntity> page = this.selectPage(
                new Query<XueyuanzhuguanEntity>(params).getPage(),
                new EntityWrapper<XueyuanzhuguanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueyuanzhuguanEntity> wrapper) {
		  Page<XueyuanzhuguanView> page =new Query<XueyuanzhuguanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueyuanzhuguanVO> selectListVO(Wrapper<XueyuanzhuguanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueyuanzhuguanVO selectVO(Wrapper<XueyuanzhuguanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueyuanzhuguanView> selectListView(Wrapper<XueyuanzhuguanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueyuanzhuguanView selectView(Wrapper<XueyuanzhuguanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
