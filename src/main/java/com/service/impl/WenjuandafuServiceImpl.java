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


import com.dao.WenjuandafuDao;
import com.entity.WenjuandafuEntity;
import com.service.WenjuandafuService;
import com.entity.vo.WenjuandafuVO;
import com.entity.view.WenjuandafuView;

@Service("wenjuandafuService")
public class WenjuandafuServiceImpl extends ServiceImpl<WenjuandafuDao, WenjuandafuEntity> implements WenjuandafuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenjuandafuEntity> page = this.selectPage(
                new Query<WenjuandafuEntity>(params).getPage(),
                new EntityWrapper<WenjuandafuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenjuandafuEntity> wrapper) {
		  Page<WenjuandafuView> page =new Query<WenjuandafuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WenjuandafuVO> selectListVO(Wrapper<WenjuandafuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenjuandafuVO selectVO(Wrapper<WenjuandafuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenjuandafuView> selectListView(Wrapper<WenjuandafuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenjuandafuView selectView(Wrapper<WenjuandafuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
