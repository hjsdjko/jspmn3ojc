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


import com.dao.XiaoyouDao;
import com.entity.XiaoyouEntity;
import com.service.XiaoyouService;
import com.entity.vo.XiaoyouVO;
import com.entity.view.XiaoyouView;

@Service("xiaoyouService")
public class XiaoyouServiceImpl extends ServiceImpl<XiaoyouDao, XiaoyouEntity> implements XiaoyouService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoyouEntity> page = this.selectPage(
                new Query<XiaoyouEntity>(params).getPage(),
                new EntityWrapper<XiaoyouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoyouEntity> wrapper) {
		  Page<XiaoyouView> page =new Query<XiaoyouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoyouVO> selectListVO(Wrapper<XiaoyouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoyouVO selectVO(Wrapper<XiaoyouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoyouView> selectListView(Wrapper<XiaoyouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoyouView selectView(Wrapper<XiaoyouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
