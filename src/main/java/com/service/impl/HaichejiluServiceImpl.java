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


import com.dao.HaichejiluDao;
import com.entity.HaichejiluEntity;
import com.service.HaichejiluService;
import com.entity.vo.HaichejiluVO;
import com.entity.view.HaichejiluView;

@Service("haichejiluService")
public class HaichejiluServiceImpl extends ServiceImpl<HaichejiluDao, HaichejiluEntity> implements HaichejiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HaichejiluEntity> page = this.selectPage(
                new Query<HaichejiluEntity>(params).getPage(),
                new EntityWrapper<HaichejiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HaichejiluEntity> wrapper) {
		  Page<HaichejiluView> page =new Query<HaichejiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HaichejiluVO> selectListVO(Wrapper<HaichejiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HaichejiluVO selectVO(Wrapper<HaichejiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HaichejiluView> selectListView(Wrapper<HaichejiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HaichejiluView selectView(Wrapper<HaichejiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
