package com.entity.model;

import com.entity.BanjixiangceEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 班级相册
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-18 10:53:24
 */
public class BanjixiangceModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 相册图片
	 */
	
	private String xiangcetupian;
		
	/**
	 * 类型
	 */
	
	private String leixing;
		
	/**
	 * 相册内容
	 */
	
	private String xiangceneirong;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 班级账号
	 */
	
	private String banjizhanghao;
		
	/**
	 * 班级名称
	 */
	
	private String banjimingcheng;
				
	
	/**
	 * 设置：相册图片
	 */
	 
	public void setXiangcetupian(String xiangcetupian) {
		this.xiangcetupian = xiangcetupian;
	}
	
	/**
	 * 获取：相册图片
	 */
	public String getXiangcetupian() {
		return xiangcetupian;
	}
				
	
	/**
	 * 设置：类型
	 */
	 
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
				
	
	/**
	 * 设置：相册内容
	 */
	 
	public void setXiangceneirong(String xiangceneirong) {
		this.xiangceneirong = xiangceneirong;
	}
	
	/**
	 * 获取：相册内容
	 */
	public String getXiangceneirong() {
		return xiangceneirong;
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
			
}
