package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuexiaotongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuexiaotongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexiaotongjiView;


/**
 * 学校统计
 *
 * @author 
 * @email 
 * @date 2022-03-18 10:53:24
 */
public interface XuexiaotongjiService extends IService<XuexiaotongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuexiaotongjiVO> selectListVO(Wrapper<XuexiaotongjiEntity> wrapper);
   	
   	XuexiaotongjiVO selectVO(@Param("ew") Wrapper<XuexiaotongjiEntity> wrapper);
   	
   	List<XuexiaotongjiView> selectListView(Wrapper<XuexiaotongjiEntity> wrapper);
   	
   	XuexiaotongjiView selectView(@Param("ew") Wrapper<XuexiaotongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuexiaotongjiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<XuexiaotongjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<XuexiaotongjiEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<XuexiaotongjiEntity> wrapper);
}

