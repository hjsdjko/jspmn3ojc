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


import com.dao.GerenxinxiDao;
import com.entity.GerenxinxiEntity;
import com.service.GerenxinxiService;
import com.entity.vo.GerenxinxiVO;
import com.entity.view.GerenxinxiView;

@Service("gerenxinxiService")
public class GerenxinxiServiceImpl extends ServiceImpl<GerenxinxiDao, GerenxinxiEntity> implements GerenxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GerenxinxiEntity> page = this.selectPage(
                new Query<GerenxinxiEntity>(params).getPage(),
                new EntityWrapper<GerenxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GerenxinxiEntity> wrapper) {
		  Page<GerenxinxiView> page =new Query<GerenxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GerenxinxiVO> selectListVO(Wrapper<GerenxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GerenxinxiVO selectVO(Wrapper<GerenxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GerenxinxiView> selectListView(Wrapper<GerenxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GerenxinxiView selectView(Wrapper<GerenxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
