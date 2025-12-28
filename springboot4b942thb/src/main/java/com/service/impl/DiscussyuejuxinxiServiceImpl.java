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


import com.dao.DiscussyuejuxinxiDao;
import com.entity.DiscussyuejuxinxiEntity;
import com.service.DiscussyuejuxinxiService;
import com.entity.vo.DiscussyuejuxinxiVO;
import com.entity.view.DiscussyuejuxinxiView;

@Service("discussyuejuxinxiService")
public class DiscussyuejuxinxiServiceImpl extends ServiceImpl<DiscussyuejuxinxiDao, DiscussyuejuxinxiEntity> implements DiscussyuejuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyuejuxinxiEntity> page = this.selectPage(
                new Query<DiscussyuejuxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussyuejuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyuejuxinxiEntity> wrapper) {
		  Page<DiscussyuejuxinxiView> page =new Query<DiscussyuejuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscussyuejuxinxiVO> selectListVO(Wrapper<DiscussyuejuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyuejuxinxiVO selectVO(Wrapper<DiscussyuejuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyuejuxinxiView> selectListView(Wrapper<DiscussyuejuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyuejuxinxiView selectView(Wrapper<DiscussyuejuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
