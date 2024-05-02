package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GerenxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GerenxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GerenxinxiView;


/**
 * 个人信息
 *
 * @author 
 * @email 
 * @date 2022-03-18 10:53:24
 */
public interface GerenxinxiService extends IService<GerenxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GerenxinxiVO> selectListVO(Wrapper<GerenxinxiEntity> wrapper);
   	
   	GerenxinxiVO selectVO(@Param("ew") Wrapper<GerenxinxiEntity> wrapper);
   	
   	List<GerenxinxiView> selectListView(Wrapper<GerenxinxiEntity> wrapper);
   	
   	GerenxinxiView selectView(@Param("ew") Wrapper<GerenxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GerenxinxiEntity> wrapper);
   	

}

