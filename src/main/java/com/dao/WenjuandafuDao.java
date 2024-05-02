package com.dao;

import com.entity.WenjuandafuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenjuandafuVO;
import com.entity.view.WenjuandafuView;


/**
 * 问卷答复
 * 
 * @author 
 * @email 
 * @date 2022-03-18 10:53:24
 */
public interface WenjuandafuDao extends BaseMapper<WenjuandafuEntity> {
	
	List<WenjuandafuVO> selectListVO(@Param("ew") Wrapper<WenjuandafuEntity> wrapper);
	
	WenjuandafuVO selectVO(@Param("ew") Wrapper<WenjuandafuEntity> wrapper);
	
	List<WenjuandafuView> selectListView(@Param("ew") Wrapper<WenjuandafuEntity> wrapper);

	List<WenjuandafuView> selectListView(Pagination page,@Param("ew") Wrapper<WenjuandafuEntity> wrapper);
	
	WenjuandafuView selectView(@Param("ew") Wrapper<WenjuandafuEntity> wrapper);
	

}
