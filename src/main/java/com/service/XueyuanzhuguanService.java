package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueyuanzhuguanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueyuanzhuguanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueyuanzhuguanView;


/**
 * 学院主管
 *
 * @author 
 * @email 
 * @date 2022-03-18 10:53:24
 */
public interface XueyuanzhuguanService extends IService<XueyuanzhuguanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueyuanzhuguanVO> selectListVO(Wrapper<XueyuanzhuguanEntity> wrapper);
   	
   	XueyuanzhuguanVO selectVO(@Param("ew") Wrapper<XueyuanzhuguanEntity> wrapper);
   	
   	List<XueyuanzhuguanView> selectListView(Wrapper<XueyuanzhuguanEntity> wrapper);
   	
   	XueyuanzhuguanView selectView(@Param("ew") Wrapper<XueyuanzhuguanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueyuanzhuguanEntity> wrapper);
   	

}

