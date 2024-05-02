package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueyuantongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueyuantongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueyuantongjiView;


/**
 * 学院统计
 *
 * @author 
 * @email 
 * @date 2022-03-18 10:53:24
 */
public interface XueyuantongjiService extends IService<XueyuantongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueyuantongjiVO> selectListVO(Wrapper<XueyuantongjiEntity> wrapper);
   	
   	XueyuantongjiVO selectVO(@Param("ew") Wrapper<XueyuantongjiEntity> wrapper);
   	
   	List<XueyuantongjiView> selectListView(Wrapper<XueyuantongjiEntity> wrapper);
   	
   	XueyuantongjiView selectView(@Param("ew") Wrapper<XueyuantongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueyuantongjiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<XueyuantongjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<XueyuantongjiEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<XueyuantongjiEntity> wrapper);
}

