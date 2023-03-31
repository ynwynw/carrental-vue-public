package com.dao;

import com.entity.ZulindingdanliebiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZulindingdanliebiaoVO;
import com.entity.view.ZulindingdanliebiaoView;


/**
 * 租赁订单列表
 * 
 * @author 
 * @email 
 * @date 2021-03-13 10:03:34
 */
public interface ZulindingdanliebiaoDao extends BaseMapper<ZulindingdanliebiaoEntity> {
	
	List<ZulindingdanliebiaoVO> selectListVO(@Param("ew") Wrapper<ZulindingdanliebiaoEntity> wrapper);
	
	ZulindingdanliebiaoVO selectVO(@Param("ew") Wrapper<ZulindingdanliebiaoEntity> wrapper);
	
	List<ZulindingdanliebiaoView> selectListView(@Param("ew") Wrapper<ZulindingdanliebiaoEntity> wrapper);

	List<ZulindingdanliebiaoView> selectListView(Pagination page,@Param("ew") Wrapper<ZulindingdanliebiaoEntity> wrapper);
	
	ZulindingdanliebiaoView selectView(@Param("ew") Wrapper<ZulindingdanliebiaoEntity> wrapper);
	
}
