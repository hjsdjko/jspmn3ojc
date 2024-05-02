package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 学校统计
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-18 10:53:24
 */
@TableName("xuexiaotongji")
public class XuexiaotongjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XuexiaotongjiEntity() {
		
	}
	
	public XuexiaotongjiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 统计名称
	 */
					
	private String tongjimingcheng;
	
	/**
	 * 统计数量
	 */
					
	private Integer tongjishuliang;
	
	/**
	 * 统计日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：统计名称
	 */
	public void setTongjimingcheng(String tongjimingcheng) {
		this.tongjimingcheng = tongjimingcheng;
	}
	/**
	 * 获取：统计名称
	 */
	public String getTongjimingcheng() {
		return tongjimingcheng;
	}
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
