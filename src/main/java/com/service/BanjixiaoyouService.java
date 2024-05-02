package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BanjixiaoyouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BanjixiaoyouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BanjixiaoyouView;


/**
 * 班级校友
 *
 * @author 
 * @email 
 * @date 2022-03-18 10:53:24
 */
public interface BanjixiaoyouService extends IService<BanjixiaoyouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BanjixiaoyouVO> selectListVO(Wrapper<BanjixiaoyouEntity> wrapper);
   	
   	BanjixiaoyouVO selectVO(@Param("ew") Wrapper<BanjixiaoyouEntity> wrapper);
   	
   	List<BanjixiaoyouView> selectListView(Wrapper<BanjixiaoyouEntity> wrapper);
   	
   	BanjixiaoyouView selectView(@Param("ew") Wrapper<BanjixiaoyouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BanjixiaoyouEntity> wrapper);
   	

}

