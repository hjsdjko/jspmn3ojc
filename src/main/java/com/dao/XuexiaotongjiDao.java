package com.dao;

import com.entity.XuexiaotongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuexiaotongjiVO;
import com.entity.view.XuexiaotongjiView;


/**
 * 学校统计
 * 
 * @author 
 * @email 
 * @date 2022-03-18 10:53:24
 */
public interface XuexiaotongjiDao extends BaseMapper<XuexiaotongjiEntity> {
	
	List<XuexiaotongjiVO> selectListVO(@Param("ew") Wrapper<XuexiaotongjiEntity> wrapper);
	
	XuexiaotongjiVO selectVO(@Param("ew") Wrapper<XuexiaotongjiEntity> wrapper);
	
	List<XuexiaotongjiView> selectListView(@Param("ew") Wrapper<XuexiaotongjiEntity> wrapper);

	List<XuexiaotongjiView> selectListView(Pagination page,@Param("ew") Wrapper<XuexiaotongjiEntity> wrapper);
	
	XuexiaotongjiView selectView(@Param("ew") Wrapper<XuexiaotongjiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XuexiaotongjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XuexiaotongjiEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XuexiaotongjiEntity> wrapper);
}
