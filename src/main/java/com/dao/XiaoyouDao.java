package com.dao;

import com.entity.XiaoyouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoyouVO;
import com.entity.view.XiaoyouView;


/**
 * 校友
 * 
 * @author 
 * @email 
 * @date 2022-03-18 10:53:24
 */
public interface XiaoyouDao extends BaseMapper<XiaoyouEntity> {
	
	List<XiaoyouVO> selectListVO(@Param("ew") Wrapper<XiaoyouEntity> wrapper);
	
	XiaoyouVO selectVO(@Param("ew") Wrapper<XiaoyouEntity> wrapper);
	
	List<XiaoyouView> selectListView(@Param("ew") Wrapper<XiaoyouEntity> wrapper);

	List<XiaoyouView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoyouEntity> wrapper);
	
	XiaoyouView selectView(@Param("ew") Wrapper<XiaoyouEntity> wrapper);
	

}
