package com.entity.model;

import com.entity.GongzixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 工资信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-01-07 10:29:19
 */
public class GongzixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
				
	
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
