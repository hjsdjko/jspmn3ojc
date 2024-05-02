package com.entity.model;

import com.entity.WenjuandiaochaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 问卷调查
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-18 10:53:24
 */
public class WenjuandiaochaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 相关图片
	 */
	
	private String xiangguantupian;
		
	/**
	 * 调查题目
	 */
	
	private String diaochatimu;
		
	/**
	 * 调查目的
	 */
	
	private String diaochamude;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
				
	
	/**
	 * 设置：相关图片
	 */
	 
	public void setXiangguantupian(String xiangguantupian) {
		this.xiangguantupian = xiangguantupian;
	}
	
	/**
	 * 获取：相关图片
	 */
	public String getXiangguantupian() {
		return xiangguantupian;
	}
				
	
	/**
	 * 设置：调查题目
	 */
	 
	public void setDiaochatimu(String diaochatimu) {
		this.diaochatimu = diaochatimu;
	}
	
	/**
	 * 获取：调查题目
	 */
	public String getDiaochatimu() {
		return diaochatimu;
	}
				
	
	/**
	 * 设置：调查目的
	 */
	 
	public void setDiaochamude(String diaochamude) {
		this.diaochamude = diaochamude;
	}
	
	/**
	 * 获取：调查目的
	 */
	public String getDiaochamude() {
		return diaochamude;
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
