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


import com.dao.BanjitongjiDao;
import com.entity.BanjitongjiEntity;
import com.service.BanjitongjiService;
import com.entity.vo.BanjitongjiVO;
import com.entity.view.BanjitongjiView;

@Service("banjitongjiService")
public class BanjitongjiServiceImpl extends ServiceImpl<BanjitongjiDao, BanjitongjiEntity> implements BanjitongjiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BanjitongjiEntity> page = this.selectPage(
                new Query<BanjitongjiEntity>(params).getPage(),
                new EntityWrapper<BanjitongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BanjitongjiEntity> wrapper) {
		  Page<BanjitongjiView> page =new Query<BanjitongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BanjitongjiVO> selectListVO(Wrapper<BanjitongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BanjitongjiVO selectVO(Wrapper<BanjitongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BanjitongjiView> selectListView(Wrapper<BanjitongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BanjitongjiView selectView(Wrapper<BanjitongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<BanjitongjiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<BanjitongjiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }
    
    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<BanjitongjiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
