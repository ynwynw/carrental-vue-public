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


import com.dao.DiscusscheliangxinxiDao;
import com.entity.DiscusscheliangxinxiEntity;
import com.service.DiscusscheliangxinxiService;
import com.entity.vo.DiscusscheliangxinxiVO;
import com.entity.view.DiscusscheliangxinxiView;

@Service("discusscheliangxinxiService")
public class DiscusscheliangxinxiServiceImpl extends ServiceImpl<DiscusscheliangxinxiDao, DiscusscheliangxinxiEntity> implements DiscusscheliangxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusscheliangxinxiEntity> page = this.selectPage(
                new Query<DiscusscheliangxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusscheliangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusscheliangxinxiEntity> wrapper) {
		  Page<DiscusscheliangxinxiView> page =new Query<DiscusscheliangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusscheliangxinxiVO> selectListVO(Wrapper<DiscusscheliangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusscheliangxinxiVO selectVO(Wrapper<DiscusscheliangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusscheliangxinxiView> selectListView(Wrapper<DiscusscheliangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusscheliangxinxiView selectView(Wrapper<DiscusscheliangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
