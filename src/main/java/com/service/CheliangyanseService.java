package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CheliangyanseEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CheliangyanseVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CheliangyanseView;


/**
 * 车辆颜色
 *
 * @author 
 * @email 
 * @date 2021-03-13 10:03:34
 */
public interface CheliangyanseService extends IService<CheliangyanseEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CheliangyanseVO> selectListVO(Wrapper<CheliangyanseEntity> wrapper);
   	
   	CheliangyanseVO selectVO(@Param("ew") Wrapper<CheliangyanseEntity> wrapper);
   	
   	List<CheliangyanseView> selectListView(Wrapper<CheliangyanseEntity> wrapper);
   	
   	CheliangyanseView selectView(@Param("ew") Wrapper<CheliangyanseEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CheliangyanseEntity> wrapper);
   	
}

