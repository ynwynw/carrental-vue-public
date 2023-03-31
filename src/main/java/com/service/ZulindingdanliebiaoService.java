package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZulindingdanliebiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZulindingdanliebiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZulindingdanliebiaoView;


/**
 * 租赁订单列表
 *
 * @author 
 * @email 
 * @date 2021-03-13 10:03:34
 */
public interface ZulindingdanliebiaoService extends IService<ZulindingdanliebiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZulindingdanliebiaoVO> selectListVO(Wrapper<ZulindingdanliebiaoEntity> wrapper);
   	
   	ZulindingdanliebiaoVO selectVO(@Param("ew") Wrapper<ZulindingdanliebiaoEntity> wrapper);
   	
   	List<ZulindingdanliebiaoView> selectListView(Wrapper<ZulindingdanliebiaoEntity> wrapper);
   	
   	ZulindingdanliebiaoView selectView(@Param("ew") Wrapper<ZulindingdanliebiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZulindingdanliebiaoEntity> wrapper);
   	
}

