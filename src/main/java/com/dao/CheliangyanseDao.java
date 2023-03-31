package com.dao;

import com.entity.CheliangyanseEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CheliangyanseVO;
import com.entity.view.CheliangyanseView;


/**
 * 车辆颜色
 * 
 * @author 
 * @email 
 * @date 2021-03-13 10:03:34
 */
public interface CheliangyanseDao extends BaseMapper<CheliangyanseEntity> {
	
	List<CheliangyanseVO> selectListVO(@Param("ew") Wrapper<CheliangyanseEntity> wrapper);
	
	CheliangyanseVO selectVO(@Param("ew") Wrapper<CheliangyanseEntity> wrapper);
	
	List<CheliangyanseView> selectListView(@Param("ew") Wrapper<CheliangyanseEntity> wrapper);

	List<CheliangyanseView> selectListView(Pagination page,@Param("ew") Wrapper<CheliangyanseEntity> wrapper);
	
	CheliangyanseView selectView(@Param("ew") Wrapper<CheliangyanseEntity> wrapper);
	
}
