package com.entity.view;

import com.entity.XuexiaozhuguanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学校主管
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-18 10:53:24
 */
@TableName("xuexiaozhuguan")
public class XuexiaozhuguanView  extends XuexiaozhuguanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XuexiaozhuguanView(){
	}
 
 	public XuexiaozhuguanView(XuexiaozhuguanEntity xuexiaozhuguanEntity){
 	try {
			BeanUtils.copyProperties(this, xuexiaozhuguanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
