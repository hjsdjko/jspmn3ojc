package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuexiaozhuguanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuexiaozhuguanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexiaozhuguanView;


/**
 * 学校主管
 *
 * @author 
 * @email 
 * @date 2022-03-18 10:53:24
 */
public interface XuexiaozhuguanService extends IService<XuexiaozhuguanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuexiaozhuguanVO> selectListVO(Wrapper<XuexiaozhuguanEntity> wrapper);
   	
   	XuexiaozhuguanVO selectVO(@Param("ew") Wrapper<XuexiaozhuguanEntity> wrapper);
   	
   	List<XuexiaozhuguanView> selectListView(Wrapper<XuexiaozhuguanEntity> wrapper);
   	
   	XuexiaozhuguanView selectView(@Param("ew") Wrapper<XuexiaozhuguanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuexiaozhuguanEntity> wrapper);
   	

}

