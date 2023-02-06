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
 * 工资信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-01-07 10:29:19
 */
@TableName("gongzixinxi")
public class GongzixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GongzixinxiEntity() {
		
	}
	
	public GongzixinxiEntity(T t) {
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
	 * 信息编号
	 */
					
	private String xinxibianhao;
	
	/**
	 * 工资名称
	 */
					
	private String gongzimingcheng;
	
	/**
	 * 工号
	 */
					
	private String gonghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 个人卡号
	 */
					
	private String gerenkahao;
	
	/**
	 * 开户行
	 */
					
	private String kaihuxing;
	
	/**
	 * 基本工资
	 */
					
	private Integer jibengongzi;
	
	/**
	 * 加班补助
	 */
					
	private Integer jiabanbuzhu;
	
	/**
	 * 应扣金额
	 */
					
	private Integer yingkoujine;
	
	/**
	 * 实际工资
	 */
					
	private Integer shijigongzi;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 发布日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date faburiqi;
	
	
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
	 * 设置：信息编号
	 */
	public void setXinxibianhao(String xinxibianhao) {
		this.xinxibianhao = xinxibianhao;
	}
	/**
	 * 获取：信息编号
	 */
	public String getXinxibianhao() {
		return xinxibianhao;
	}
	/**
	 * 设置：工资名称
	 */
	public void setGongzimingcheng(String gongzimingcheng) {
		this.gongzimingcheng = gongzimingcheng;
	}
	/**
	 * 获取：工资名称
	 */
	public String getGongzimingcheng() {
		return gongzimingcheng;
	}
	/**
	 * 设置：工号
	 */
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：个人卡号
	 */
	public void setGerenkahao(String gerenkahao) {
		this.gerenkahao = gerenkahao;
	}
	/**
	 * 获取：个人卡号
	 */
	public String getGerenkahao() {
		return gerenkahao;
	}
	/**
	 * 设置：开户行
	 */
	public void setKaihuxing(String kaihuxing) {
		this.kaihuxing = kaihuxing;
	}
	/**
	 * 获取：开户行
	 */
	public String getKaihuxing() {
		return kaihuxing;
	}
	/**
	 * 设置：基本工资
	 */
	public void setJibengongzi(Integer jibengongzi) {
		this.jibengongzi = jibengongzi;
	}
	/**
	 * 获取：基本工资
	 */
	public Integer getJibengongzi() {
		return jibengongzi;
	}
	/**
	 * 设置：加班补助
	 */
	public void setJiabanbuzhu(Integer jiabanbuzhu) {
		this.jiabanbuzhu = jiabanbuzhu;
	}
	/**
	 * 获取：加班补助
	 */
	public Integer getJiabanbuzhu() {
		return jiabanbuzhu;
	}
	/**
	 * 设置：应扣金额
	 */
	public void setYingkoujine(Integer yingkoujine) {
		this.yingkoujine = yingkoujine;
	}
	/**
	 * 获取：应扣金额
	 */
	public Integer getYingkoujine() {
		return yingkoujine;
	}
	/**
	 * 设置：实际工资
	 */
	public void setShijigongzi(Integer shijigongzi) {
		this.shijigongzi = shijigongzi;
	}
	/**
	 * 获取：实际工资
	 */
	public Integer getShijigongzi() {
		return shijigongzi;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
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
