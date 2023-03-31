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


import com.dao.ZulindingdanliebiaoDao;
import com.entity.ZulindingdanliebiaoEntity;
import com.service.ZulindingdanliebiaoService;
import com.entity.vo.ZulindingdanliebiaoVO;
import com.entity.view.ZulindingdanliebiaoView;

@Service("zulindingdanliebiaoService")
public class ZulindingdanliebiaoServiceImpl extends ServiceImpl<ZulindingdanliebiaoDao, ZulindingdanliebiaoEntity> implements ZulindingdanliebiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZulindingdanliebiaoEntity> page = this.selectPage(
                new Query<ZulindingdanliebiaoEntity>(params).getPage(),
                new EntityWrapper<ZulindingdanliebiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZulindingdanliebiaoEntity> wrapper) {
		  Page<ZulindingdanliebiaoView> page =new Query<ZulindingdanliebiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZulindingdanliebiaoVO> selectListVO(Wrapper<ZulindingdanliebiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZulindingdanliebiaoVO selectVO(Wrapper<ZulindingdanliebiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZulindingdanliebiaoView> selectListView(Wrapper<ZulindingdanliebiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZulindingdanliebiaoView selectView(Wrapper<ZulindingdanliebiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
