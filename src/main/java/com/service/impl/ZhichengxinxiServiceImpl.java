package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZhichengxinxiDao;
import com.entity.ZhichengxinxiEntity;
import com.service.ZhichengxinxiService;
import com.entity.vo.ZhichengxinxiVO;
import com.entity.view.ZhichengxinxiView;

@Service("zhichengxinxiService")
public class ZhichengxinxiServiceImpl extends ServiceImpl<ZhichengxinxiDao, ZhichengxinxiEntity> implements ZhichengxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhichengxinxiEntity> page = this.selectPage(
                new Query<ZhichengxinxiEntity>(params).getPage(),
                new EntityWrapper<ZhichengxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhichengxinxiEntity> wrapper) {
		  Page<ZhichengxinxiView> page =new Query<ZhichengxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhichengxinxiVO> selectListVO(Wrapper<ZhichengxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhichengxinxiVO selectVO(Wrapper<ZhichengxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhichengxinxiView> selectListView(Wrapper<ZhichengxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhichengxinxiView selectView(Wrapper<ZhichengxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
