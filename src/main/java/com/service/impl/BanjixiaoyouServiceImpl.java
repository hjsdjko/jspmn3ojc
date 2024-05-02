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


import com.dao.BanjixiaoyouDao;
import com.entity.BanjixiaoyouEntity;
import com.service.BanjixiaoyouService;
import com.entity.vo.BanjixiaoyouVO;
import com.entity.view.BanjixiaoyouView;

@Service("banjixiaoyouService")
public class BanjixiaoyouServiceImpl extends ServiceImpl<BanjixiaoyouDao, BanjixiaoyouEntity> implements BanjixiaoyouService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BanjixiaoyouEntity> page = this.selectPage(
                new Query<BanjixiaoyouEntity>(params).getPage(),
                new EntityWrapper<BanjixiaoyouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BanjixiaoyouEntity> wrapper) {
		  Page<BanjixiaoyouView> page =new Query<BanjixiaoyouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BanjixiaoyouVO> selectListVO(Wrapper<BanjixiaoyouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BanjixiaoyouVO selectVO(Wrapper<BanjixiaoyouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BanjixiaoyouView> selectListView(Wrapper<BanjixiaoyouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BanjixiaoyouView selectView(Wrapper<BanjixiaoyouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
