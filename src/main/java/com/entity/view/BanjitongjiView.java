package com.entity.view;

import com.entity.BanjitongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 班级统计
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-18 10:53:24
 */
@TableName("banjitongji")
public class BanjitongjiView  extends BanjitongjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BanjitongjiView(){
	}
 
 	public BanjitongjiView(BanjitongjiEntity banjitongjiEntity){
 	try {
			BeanUtils.copyProperties(this, banjitongjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
