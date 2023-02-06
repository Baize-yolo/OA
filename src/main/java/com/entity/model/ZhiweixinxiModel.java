package com.entity.model;

import com.entity.ZhiweixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 职位信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-01-07 10:29:19
 */
public class ZhiweixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 职位薪酬
	 */
	
	private Integer zhiweixinchou;
		
	/**
	 * 职位职责
	 */
	
	private String zhiweizhize;
				
	
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
