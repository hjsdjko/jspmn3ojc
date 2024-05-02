package com.dao;

import com.entity.GerenxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GerenxinxiVO;
import com.entity.view.GerenxinxiView;


/**
 * 个人信息
 * 
 * @author 
 * @email 
 * @date 2022-03-18 10:53:24
 */
public interface GerenxinxiDao extends BaseMapper<GerenxinxiEntity> {
	
	List<GerenxinxiVO> selectListVO(@Param("ew") Wrapper<GerenxinxiEntity> wrapper);
	
	GerenxinxiVO selectVO(@Param("ew") Wrapper<GerenxinxiEntity> wrapper);
	
	List<GerenxinxiView> selectListView(@Param("ew") Wrapper<GerenxinxiEntity> wrapper);

	List<GerenxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<GerenxinxiEntity> wrapper);
	
	GerenxinxiView selectView(@Param("ew") Wrapper<GerenxinxiEntity> wrapper);
	

}
