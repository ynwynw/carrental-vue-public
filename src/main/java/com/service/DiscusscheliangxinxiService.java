package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusscheliangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusscheliangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusscheliangxinxiView;


/**
 * 车辆信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-13 10:03:34
 */
public interface DiscusscheliangxinxiService extends IService<DiscusscheliangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusscheliangxinxiVO> selectListVO(Wrapper<DiscusscheliangxinxiEntity> wrapper);
   	
   	DiscusscheliangxinxiVO selectVO(@Param("ew") Wrapper<DiscusscheliangxinxiEntity> wrapper);
   	
   	List<DiscusscheliangxinxiView> selectListView(Wrapper<DiscusscheliangxinxiEntity> wrapper);
   	
   	DiscusscheliangxinxiView selectView(@Param("ew") Wrapper<DiscusscheliangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusscheliangxinxiEntity> wrapper);
   	
}

