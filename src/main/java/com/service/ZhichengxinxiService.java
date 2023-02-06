package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhichengxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhichengxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhichengxinxiView;


/**
 * 职称信息
 *
 * @author 
 * @email 
 * @date 2022-01-07 10:29:19
 */
public interface ZhichengxinxiService extends IService<ZhichengxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhichengxinxiVO> selectListVO(Wrapper<ZhichengxinxiEntity> wrapper);
   	
   	ZhichengxinxiVO selectVO(@Param("ew") Wrapper<ZhichengxinxiEntity> wrapper);
   	
   	List<ZhichengxinxiView> selectListView(Wrapper<ZhichengxinxiEntity> wrapper);
   	
   	ZhichengxinxiView selectView(@Param("ew") Wrapper<ZhichengxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhichengxinxiEntity> wrapper);
   	

}

