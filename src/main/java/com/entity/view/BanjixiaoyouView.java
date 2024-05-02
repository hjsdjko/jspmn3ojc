package com.entity.view;

import com.entity.BanjixiaoyouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 班级校友
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-18 10:53:24
 */
@TableName("banjixiaoyou")
public class BanjixiaoyouView  extends BanjixiaoyouEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BanjixiaoyouView(){
	}
 
 	public BanjixiaoyouView(BanjixiaoyouEntity banjixiaoyouEntity){
 	try {
			BeanUtils.copyProperties(this, banjixiaoyouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
