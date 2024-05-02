package com.dao;

import com.entity.BanjitongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BanjitongjiVO;
import com.entity.view.BanjitongjiView;


/**
 * 班级统计
 * 
 * @author 
 * @email 
 * @date 2022-03-18 10:53:24
 */
public interface BanjitongjiDao extends BaseMapper<BanjitongjiEntity> {
	
	List<BanjitongjiVO> selectListVO(@Param("ew") Wrapper<BanjitongjiEntity> wrapper);
	
	BanjitongjiVO selectVO(@Param("ew") Wrapper<BanjitongjiEntity> wrapper);
	
	List<BanjitongjiView> selectListView(@Param("ew") Wrapper<BanjitongjiEntity> wrapper);

	List<BanjitongjiView> selectListView(Pagination page,@Param("ew") Wrapper<BanjitongjiEntity> wrapper);
	
	BanjitongjiView selectView(@Param("ew") Wrapper<BanjitongjiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<BanjitongjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<BanjitongjiEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<BanjitongjiEntity> wrapper);
}
