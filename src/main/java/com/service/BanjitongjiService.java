package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BanjitongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BanjitongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BanjitongjiView;


/**
 * 班级统计
 *
 * @author 
 * @email 
 * @date 2022-03-18 10:53:24
 */
public interface BanjitongjiService extends IService<BanjitongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BanjitongjiVO> selectListVO(Wrapper<BanjitongjiEntity> wrapper);
   	
   	BanjitongjiVO selectVO(@Param("ew") Wrapper<BanjitongjiEntity> wrapper);
   	
   	List<BanjitongjiView> selectListView(Wrapper<BanjitongjiEntity> wrapper);
   	
   	BanjitongjiView selectView(@Param("ew") Wrapper<BanjitongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BanjitongjiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<BanjitongjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<BanjitongjiEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<BanjitongjiEntity> wrapper);
}

