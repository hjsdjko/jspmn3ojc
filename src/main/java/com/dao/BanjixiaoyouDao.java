package com.dao;

import com.entity.BanjixiaoyouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BanjixiaoyouVO;
import com.entity.view.BanjixiaoyouView;


/**
 * 班级校友
 * 
 * @author 
 * @email 
 * @date 2022-03-18 10:53:24
 */
public interface BanjixiaoyouDao extends BaseMapper<BanjixiaoyouEntity> {
	
	List<BanjixiaoyouVO> selectListVO(@Param("ew") Wrapper<BanjixiaoyouEntity> wrapper);
	
	BanjixiaoyouVO selectVO(@Param("ew") Wrapper<BanjixiaoyouEntity> wrapper);
	
	List<BanjixiaoyouView> selectListView(@Param("ew") Wrapper<BanjixiaoyouEntity> wrapper);

	List<BanjixiaoyouView> selectListView(Pagination page,@Param("ew") Wrapper<BanjixiaoyouEntity> wrapper);
	
	BanjixiaoyouView selectView(@Param("ew") Wrapper<BanjixiaoyouEntity> wrapper);
	

}
