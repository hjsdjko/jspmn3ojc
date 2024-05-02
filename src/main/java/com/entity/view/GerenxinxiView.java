package com.entity.view;

import com.entity.GerenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 个人信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-18 10:53:24
 */
@TableName("gerenxinxi")
public class GerenxinxiView  extends GerenxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GerenxinxiView(){
	}
 
 	public GerenxinxiView(GerenxinxiEntity gerenxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, gerenxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
