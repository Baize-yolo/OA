package com.entity.model;

import com.entity.GongzizhanghaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 工资账号
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-01-07 10:29:19
 */
public class GongzizhanghaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 部门名称
	 */
	
	private String bumenmingcheng;
		
	/**
	 * 职位名称
	 */
	
	private String zhiweimingcheng;
		
	/**
	 * 职称名称
	 */
	
	private String zhichengmingcheng;
		
	/**
	 * 个人卡号
	 */
	
	private Integer gerenkahao;
		
	/**
	 * 开户行
	 */
	
	private String kaihuxing;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
				
	
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
	 * 设置：部门名称
	 */
	 
	public void setBumenmingcheng(String bumenmingcheng) {
		this.bumenmingcheng = bumenmingcheng;
	}
	
	/**
	 * 获取：部门名称
	 */
	public String getBumenmingcheng() {
		return bumenmingcheng;
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
	 * 设置：职称名称
	 */
	 
	public void setZhichengmingcheng(String zhichengmingcheng) {
		this.zhichengmingcheng = zhichengmingcheng;
	}
	
	/**
	 * 获取：职称名称
	 */
	public String getZhichengmingcheng() {
		return zhichengmingcheng;
	}
				
	
	/**
	 * 设置：个人卡号
	 */
	 
	public void setGerenkahao(Integer gerenkahao) {
		this.gerenkahao = gerenkahao;
	}
	
	/**
	 * 获取：个人卡号
	 */
	public Integer getGerenkahao() {
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
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
			
}
