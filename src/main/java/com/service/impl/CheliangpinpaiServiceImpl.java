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


import com.dao.CheliangpinpaiDao;
import com.entity.CheliangpinpaiEntity;
import com.service.CheliangpinpaiService;
import com.entity.vo.CheliangpinpaiVO;
import com.entity.view.CheliangpinpaiView;

@Service("cheliangpinpaiService")
public class CheliangpinpaiServiceImpl extends ServiceImpl<CheliangpinpaiDao, CheliangpinpaiEntity> implements CheliangpinpaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CheliangpinpaiEntity> page = this.selectPage(
                new Query<CheliangpinpaiEntity>(params).getPage(),
                new EntityWrapper<CheliangpinpaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CheliangpinpaiEntity> wrapper) {
		  Page<CheliangpinpaiView> page =new Query<CheliangpinpaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CheliangpinpaiVO> selectListVO(Wrapper<CheliangpinpaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CheliangpinpaiVO selectVO(Wrapper<CheliangpinpaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CheliangpinpaiView> selectListView(Wrapper<CheliangpinpaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CheliangpinpaiView selectView(Wrapper<CheliangpinpaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
