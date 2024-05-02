package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoyouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoyouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoyouView;


/**
 * 校友
 *
 * @author 
 * @email 
 * @date 2022-03-18 10:53:24
 */
public interface XiaoyouService extends IService<XiaoyouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoyouVO> selectListVO(Wrapper<XiaoyouEntity> wrapper);
   	
   	XiaoyouVO selectVO(@Param("ew") Wrapper<XiaoyouEntity> wrapper);
   	
   	List<XiaoyouView> selectListView(Wrapper<XiaoyouEntity> wrapper);
   	
   	XiaoyouView selectView(@Param("ew") Wrapper<XiaoyouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoyouEntity> wrapper);
   	

}

