package com.dao;

import com.entity.XueyuantongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueyuantongjiVO;
import com.entity.view.XueyuantongjiView;


/**
 * 学院统计
 * 
 * @author 
 * @email 
 * @date 2022-03-18 10:53:24
 */
public interface XueyuantongjiDao extends BaseMapper<XueyuantongjiEntity> {
	
	List<XueyuantongjiVO> selectListVO(@Param("ew") Wrapper<XueyuantongjiEntity> wrapper);
	
	XueyuantongjiVO selectVO(@Param("ew") Wrapper<XueyuantongjiEntity> wrapper);
	
	List<XueyuantongjiView> selectListView(@Param("ew") Wrapper<XueyuantongjiEntity> wrapper);

	List<XueyuantongjiView> selectListView(Pagination page,@Param("ew") Wrapper<XueyuantongjiEntity> wrapper);
	
	XueyuantongjiView selectView(@Param("ew") Wrapper<XueyuantongjiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XueyuantongjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XueyuantongjiEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XueyuantongjiEntity> wrapper);
}
