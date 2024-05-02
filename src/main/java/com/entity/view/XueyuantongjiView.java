package com.entity.view;

import com.entity.XueyuantongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学院统计
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-18 10:53:24
 */
@TableName("xueyuantongji")
public class XueyuantongjiView  extends XueyuantongjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueyuantongjiView(){
	}
 
 	public XueyuantongjiView(XueyuantongjiEntity xueyuantongjiEntity){
 	try {
			BeanUtils.copyProperties(this, xueyuantongjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
