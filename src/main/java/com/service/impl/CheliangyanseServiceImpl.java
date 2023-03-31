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


import com.dao.CheliangyanseDao;
import com.entity.CheliangyanseEntity;
import com.service.CheliangyanseService;
import com.entity.vo.CheliangyanseVO;
import com.entity.view.CheliangyanseView;

@Service("cheliangyanseService")
public class CheliangyanseServiceImpl extends ServiceImpl<CheliangyanseDao, CheliangyanseEntity> implements CheliangyanseService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CheliangyanseEntity> page = this.selectPage(
                new Query<CheliangyanseEntity>(params).getPage(),
                new EntityWrapper<CheliangyanseEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CheliangyanseEntity> wrapper) {
		  Page<CheliangyanseView> page =new Query<CheliangyanseView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CheliangyanseVO> selectListVO(Wrapper<CheliangyanseEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CheliangyanseVO selectVO(Wrapper<CheliangyanseEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CheliangyanseView> selectListView(Wrapper<CheliangyanseEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CheliangyanseView selectView(Wrapper<CheliangyanseEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
