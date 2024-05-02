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


import com.dao.XueyuantongjiDao;
import com.entity.XueyuantongjiEntity;
import com.service.XueyuantongjiService;
import com.entity.vo.XueyuantongjiVO;
import com.entity.view.XueyuantongjiView;

@Service("xueyuantongjiService")
public class XueyuantongjiServiceImpl extends ServiceImpl<XueyuantongjiDao, XueyuantongjiEntity> implements XueyuantongjiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueyuantongjiEntity> page = this.selectPage(
                new Query<XueyuantongjiEntity>(params).getPage(),
                new EntityWrapper<XueyuantongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueyuantongjiEntity> wrapper) {
		  Page<XueyuantongjiView> page =new Query<XueyuantongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueyuantongjiVO> selectListVO(Wrapper<XueyuantongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueyuantongjiVO selectVO(Wrapper<XueyuantongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueyuantongjiView> selectListView(Wrapper<XueyuantongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueyuantongjiView selectView(Wrapper<XueyuantongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<XueyuantongjiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<XueyuantongjiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }
    
    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<XueyuantongjiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
