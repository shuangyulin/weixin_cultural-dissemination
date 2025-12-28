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


import com.dao.YuejuxinxiDao;
import com.entity.YuejuxinxiEntity;
import com.service.YuejuxinxiService;
import com.entity.vo.YuejuxinxiVO;
import com.entity.view.YuejuxinxiView;

@Service("yuejuxinxiService")
public class YuejuxinxiServiceImpl extends ServiceImpl<YuejuxinxiDao, YuejuxinxiEntity> implements YuejuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuejuxinxiEntity> page = this.selectPage(
                new Query<YuejuxinxiEntity>(params).getPage(),
                new EntityWrapper<YuejuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuejuxinxiEntity> wrapper) {
		  Page<YuejuxinxiView> page =new Query<YuejuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<YuejuxinxiVO> selectListVO(Wrapper<YuejuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuejuxinxiVO selectVO(Wrapper<YuejuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuejuxinxiView> selectListView(Wrapper<YuejuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuejuxinxiView selectView(Wrapper<YuejuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<YuejuxinxiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<YuejuxinxiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<YuejuxinxiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
