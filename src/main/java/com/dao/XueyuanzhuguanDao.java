package com.dao;

import com.entity.XueyuanzhuguanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueyuanzhuguanVO;
import com.entity.view.XueyuanzhuguanView;


/**
 * 学院主管
 * 
 * @author 
 * @email 
 * @date 2022-03-18 10:53:24
 */
public interface XueyuanzhuguanDao extends BaseMapper<XueyuanzhuguanEntity> {
	
	List<XueyuanzhuguanVO> selectListVO(@Param("ew") Wrapper<XueyuanzhuguanEntity> wrapper);
	
	XueyuanzhuguanVO selectVO(@Param("ew") Wrapper<XueyuanzhuguanEntity> wrapper);
	
	List<XueyuanzhuguanView> selectListView(@Param("ew") Wrapper<XueyuanzhuguanEntity> wrapper);

	List<XueyuanzhuguanView> selectListView(Pagination page,@Param("ew") Wrapper<XueyuanzhuguanEntity> wrapper);
	
	XueyuanzhuguanView selectView(@Param("ew") Wrapper<XueyuanzhuguanEntity> wrapper);
	

}
