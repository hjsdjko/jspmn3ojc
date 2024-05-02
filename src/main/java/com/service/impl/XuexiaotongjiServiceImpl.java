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


import com.dao.XuexiaotongjiDao;
import com.entity.XuexiaotongjiEntity;
import com.service.XuexiaotongjiService;
import com.entity.vo.XuexiaotongjiVO;
import com.entity.view.XuexiaotongjiView;

@Service("xuexiaotongjiService")
public class XuexiaotongjiServiceImpl extends ServiceImpl<XuexiaotongjiDao, XuexiaotongjiEntity> implements XuexiaotongjiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuexiaotongjiEntity> page = this.selectPage(
                new Query<XuexiaotongjiEntity>(params).getPage(),
                new EntityWrapper<XuexiaotongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuexiaotongjiEntity> wrapper) {
		  Page<XuexiaotongjiView> page =new Query<XuexiaotongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuexiaotongjiVO> selectListVO(Wrapper<XuexiaotongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuexiaotongjiVO selectVO(Wrapper<XuexiaotongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuexiaotongjiView> selectListView(Wrapper<XuexiaotongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuexiaotongjiView selectView(Wrapper<XuexiaotongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<XuexiaotongjiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<XuexiaotongjiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }
    
    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<XuexiaotongjiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
