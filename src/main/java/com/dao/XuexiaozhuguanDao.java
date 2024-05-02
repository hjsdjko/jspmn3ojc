package com.dao;

import com.entity.XuexiaozhuguanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuexiaozhuguanVO;
import com.entity.view.XuexiaozhuguanView;


/**
 * 学校主管
 * 
 * @author 
 * @email 
 * @date 2022-03-18 10:53:24
 */
public interface XuexiaozhuguanDao extends BaseMapper<XuexiaozhuguanEntity> {
	
	List<XuexiaozhuguanVO> selectListVO(@Param("ew") Wrapper<XuexiaozhuguanEntity> wrapper);
	
	XuexiaozhuguanVO selectVO(@Param("ew") Wrapper<XuexiaozhuguanEntity> wrapper);
	
	List<XuexiaozhuguanView> selectListView(@Param("ew") Wrapper<XuexiaozhuguanEntity> wrapper);

	List<XuexiaozhuguanView> selectListView(Pagination page,@Param("ew") Wrapper<XuexiaozhuguanEntity> wrapper);
	
	XuexiaozhuguanView selectView(@Param("ew") Wrapper<XuexiaozhuguanEntity> wrapper);
	

}
