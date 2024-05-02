package com.entity.model;

import com.entity.TongzhixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 通知信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-18 10:53:24
 */
public class TongzhixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 通知封面
	 */
	
	private String tongzhifengmian;
		
	/**
	 * 通知内容
	 */
	
	private String tongzhineirong;
		
	/**
	 * 班级账号
	 */
	
	private String banjizhanghao;
		
	/**
	 * 班级名称
	 */
	
	private String banjimingcheng;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
				
	
	/**
	 * 设置：通知封面
	 */
	 
	public void setTongzhifengmian(String tongzhifengmian) {
		this.tongzhifengmian = tongzhifengmian;
	}
	
	/**
	 * 获取：通知封面
	 */
	public String getTongzhifengmian() {
		return tongzhifengmian;
	}
				
	
	/**
	 * 设置：通知内容
	 */
	 
	public void setTongzhineirong(String tongzhineirong) {
		this.tongzhineirong = tongzhineirong;
	}
	
	/**
	 * 获取：通知内容
	 */
	public String getTongzhineirong() {
		return tongzhineirong;
	}
				
	
	/**
	 * 设置：班级账号
	 */
	 
	public void setBanjizhanghao(String banjizhanghao) {
		this.banjizhanghao = banjizhanghao;
	}
	
	/**
	 * 获取：班级账号
	 */
	public String getBanjizhanghao() {
		return banjizhanghao;
	}
				
	
	/**
	 * 设置：班级名称
	 */
	 
	public void setBanjimingcheng(String banjimingcheng) {
		this.banjimingcheng = banjimingcheng;
	}
	
	/**
	 * 获取：班级名称
	 */
	public String getBanjimingcheng() {
		return banjimingcheng;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
			
}
