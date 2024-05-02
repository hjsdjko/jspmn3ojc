package com.entity.model;

import com.entity.XuexiaotongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 学校统计
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-18 10:53:24
 */
public class XuexiaotongjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 统计数量
	 */
	
	private Integer tongjishuliang;
		
	/**
	 * 统计日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tongjiriqi;
		
	/**
	 * 统计备注
	 */
	
	private String tongjibeizhu;
		
	/**
	 * 学校账号
	 */
	
	private String xuexiaozhanghao;
		
	/**
	 * 学校名称
	 */
	
	private String xuexiaomingcheng;
				
	
	/**
	 * 设置：统计数量
	 */
	 
	public void setTongjishuliang(Integer tongjishuliang) {
		this.tongjishuliang = tongjishuliang;
	}
	
	/**
	 * 获取：统计数量
	 */
	public Integer getTongjishuliang() {
		return tongjishuliang;
	}
				
	
	/**
	 * 设置：统计日期
	 */
	 
	public void setTongjiriqi(Date tongjiriqi) {
		this.tongjiriqi = tongjiriqi;
	}
	
	/**
	 * 获取：统计日期
	 */
	public Date getTongjiriqi() {
		return tongjiriqi;
	}
				
	
	/**
	 * 设置：统计备注
	 */
	 
	public void setTongjibeizhu(String tongjibeizhu) {
		this.tongjibeizhu = tongjibeizhu;
	}
	
	/**
	 * 获取：统计备注
	 */
	public String getTongjibeizhu() {
		return tongjibeizhu;
	}
				
	
	/**
	 * 设置：学校账号
	 */
	 
	public void setXuexiaozhanghao(String xuexiaozhanghao) {
		this.xuexiaozhanghao = xuexiaozhanghao;
	}
	
	/**
	 * 获取：学校账号
	 */
	public String getXuexiaozhanghao() {
		return xuexiaozhanghao;
	}
				
	
	/**
	 * 设置：学校名称
	 */
	 
	public void setXuexiaomingcheng(String xuexiaomingcheng) {
		this.xuexiaomingcheng = xuexiaomingcheng;
	}
	
	/**
	 * 获取：学校名称
	 */
	public String getXuexiaomingcheng() {
		return xuexiaomingcheng;
	}
			
}
