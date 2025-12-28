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


import com.dao.YueyuyingshiDao;
import com.entity.YueyuyingshiEntity;
import com.service.YueyuyingshiService;
import com.entity.vo.YueyuyingshiVO;
import com.entity.view.YueyuyingshiView;

@Service("yueyuyingshiService")
public class YueyuyingshiServiceImpl extends ServiceImpl<YueyuyingshiDao, YueyuyingshiEntity> implements YueyuyingshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YueyuyingshiEntity> page = this.selectPage(
                new Query<YueyuyingshiEntity>(params).getPage(),
                new EntityWrapper<YueyuyingshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YueyuyingshiEntity> wrapper) {
		  Page<YueyuyingshiView> page =new Query<YueyuyingshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<YueyuyingshiVO> selectListVO(Wrapper<YueyuyingshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YueyuyingshiVO selectVO(Wrapper<YueyuyingshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YueyuyingshiView> selectListView(Wrapper<YueyuyingshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YueyuyingshiView selectView(Wrapper<YueyuyingshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<YueyuyingshiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<YueyuyingshiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<YueyuyingshiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
