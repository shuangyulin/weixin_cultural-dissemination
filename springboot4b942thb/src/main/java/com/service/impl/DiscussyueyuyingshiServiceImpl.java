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


import com.dao.DiscussyueyuyingshiDao;
import com.entity.DiscussyueyuyingshiEntity;
import com.service.DiscussyueyuyingshiService;
import com.entity.vo.DiscussyueyuyingshiVO;
import com.entity.view.DiscussyueyuyingshiView;

@Service("discussyueyuyingshiService")
public class DiscussyueyuyingshiServiceImpl extends ServiceImpl<DiscussyueyuyingshiDao, DiscussyueyuyingshiEntity> implements DiscussyueyuyingshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyueyuyingshiEntity> page = this.selectPage(
                new Query<DiscussyueyuyingshiEntity>(params).getPage(),
                new EntityWrapper<DiscussyueyuyingshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyueyuyingshiEntity> wrapper) {
		  Page<DiscussyueyuyingshiView> page =new Query<DiscussyueyuyingshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscussyueyuyingshiVO> selectListVO(Wrapper<DiscussyueyuyingshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyueyuyingshiVO selectVO(Wrapper<DiscussyueyuyingshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyueyuyingshiView> selectListView(Wrapper<DiscussyueyuyingshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyueyuyingshiView selectView(Wrapper<DiscussyueyuyingshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
