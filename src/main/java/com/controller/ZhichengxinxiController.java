package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZhichengxinxiEntity;
import com.entity.view.ZhichengxinxiView;

import com.service.ZhichengxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 职称信息
 * 后端接口
 * @author 
 * @email 
 * @date 2022-01-07 10:29:19
 */
@RestController
@RequestMapping("/zhichengxinxi")
public class ZhichengxinxiController {
    @Autowired
    private ZhichengxinxiService zhichengxinxiService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhichengxinxiEntity zhichengxinxi,
		HttpServletRequest request){
        EntityWrapper<ZhichengxinxiEntity> ew = new EntityWrapper<ZhichengxinxiEntity>();
		PageUtils page = zhichengxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhichengxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhichengxinxiEntity zhichengxinxi, 
		HttpServletRequest request){
        EntityWrapper<ZhichengxinxiEntity> ew = new EntityWrapper<ZhichengxinxiEntity>();
		PageUtils page = zhichengxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhichengxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhichengxinxiEntity zhichengxinxi){
       	EntityWrapper<ZhichengxinxiEntity> ew = new EntityWrapper<ZhichengxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhichengxinxi, "zhichengxinxi")); 
        return R.ok().put("data", zhichengxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhichengxinxiEntity zhichengxinxi){
        EntityWrapper< ZhichengxinxiEntity> ew = new EntityWrapper< ZhichengxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhichengxinxi, "zhichengxinxi")); 
		ZhichengxinxiView zhichengxinxiView =  zhichengxinxiService.selectView(ew);
		return R.ok("查询职称信息成功").put("data", zhichengxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhichengxinxiEntity zhichengxinxi = zhichengxinxiService.selectById(id);
        return R.ok().put("data", zhichengxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhichengxinxiEntity zhichengxinxi = zhichengxinxiService.selectById(id);
        return R.ok().put("data", zhichengxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhichengxinxiEntity zhichengxinxi, HttpServletRequest request){
    	zhichengxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhichengxinxi);
        zhichengxinxiService.insert(zhichengxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhichengxinxiEntity zhichengxinxi, HttpServletRequest request){
    	zhichengxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhichengxinxi);
        zhichengxinxiService.insert(zhichengxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZhichengxinxiEntity zhichengxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhichengxinxi);
        zhichengxinxiService.updateById(zhichengxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhichengxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ZhichengxinxiEntity> wrapper = new EntityWrapper<ZhichengxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = zhichengxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
