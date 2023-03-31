package com.dao;

import com.entity.DiscusscheliangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusscheliangxinxiVO;
import com.entity.view.DiscusscheliangxinxiView;


/**
 * 车辆信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-13 10:03:34
 */
public interface DiscusscheliangxinxiDao extends BaseMapper<DiscusscheliangxinxiEntity> {
	
	List<DiscusscheliangxinxiVO> selectListVO(@Param("ew") Wrapper<DiscusscheliangxinxiEntity> wrapper);
	
	DiscusscheliangxinxiVO selectVO(@Param("ew") Wrapper<DiscusscheliangxinxiEntity> wrapper);
	
	List<DiscusscheliangxinxiView> selectListView(@Param("ew") Wrapper<DiscusscheliangxinxiEntity> wrapper);

	List<DiscusscheliangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusscheliangxinxiEntity> wrapper);
	
	DiscusscheliangxinxiView selectView(@Param("ew") Wrapper<DiscusscheliangxinxiEntity> wrapper);
	
}
