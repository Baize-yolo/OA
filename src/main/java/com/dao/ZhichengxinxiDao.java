package com.dao;

import com.entity.ZhichengxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhichengxinxiVO;
import com.entity.view.ZhichengxinxiView;


/**
 * 职称信息
 * 
 * @author 
 * @email 
 * @date 2022-01-07 10:29:19
 */
public interface ZhichengxinxiDao extends BaseMapper<ZhichengxinxiEntity> {
	
	List<ZhichengxinxiVO> selectListVO(@Param("ew") Wrapper<ZhichengxinxiEntity> wrapper);
	
	ZhichengxinxiVO selectVO(@Param("ew") Wrapper<ZhichengxinxiEntity> wrapper);
	
	List<ZhichengxinxiView> selectListView(@Param("ew") Wrapper<ZhichengxinxiEntity> wrapper);

	List<ZhichengxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhichengxinxiEntity> wrapper);
	
	ZhichengxinxiView selectView(@Param("ew") Wrapper<ZhichengxinxiEntity> wrapper);
	

}
