package com.entity.view;

import com.entity.GongzizhanghaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 工资账号
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-01-07 10:29:19
 */
@TableName("gongzizhanghao")
public class GongzizhanghaoView  extends GongzizhanghaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GongzizhanghaoView(){
	}
 
 	public GongzizhanghaoView(GongzizhanghaoEntity gongzizhanghaoEntity){
 	try {
			BeanUtils.copyProperties(this, gongzizhanghaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
