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
 * 职位信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-01-07 10:29:19
 */
@TableName("zhiweixinxi")
public class ZhiweixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhiweixinxiEntity() {
		
	}
	
	public ZhiweixinxiEntity(T t) {
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
	 * 职位名称
	 */
					
	private String zhiweimingcheng;
	
	/**
	 * 职位薪酬
	 */
					
	private Integer zhiweixinchou;
	
	/**
	 * 职位职责
	 */
					
	private String zhiweizhize;
	
	
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
	 * 设置：职位名称
	 */
	public void setZhiweimingcheng(String zhiweimingcheng) {
		this.zhiweimingcheng = zhiweimingcheng;
	}
	/**
	 * 获取：职位名称
	 */
	public String getZhiweimingcheng() {
		return zhiweimingcheng;
	}
	/**
	 * 设置：职位薪酬
	 */
	public void setZhiweixinchou(Integer zhiweixinchou) {
		this.zhiweixinchou = zhiweixinchou;
	}
	/**
	 * 获取：职位薪酬
	 */
	public Integer getZhiweixinchou() {
		return zhiweixinchou;
	}
	/**
	 * 设置：职位职责
	 */
	public void setZhiweizhize(String zhiweizhize) {
		this.zhiweizhize = zhiweizhize;
	}
	/**
	 * 获取：职位职责
	 */
	public String getZhiweizhize() {
		return zhiweizhize;
	}

}
