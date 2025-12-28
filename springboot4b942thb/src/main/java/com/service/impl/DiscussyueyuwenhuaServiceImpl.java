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


import com.dao.DiscussyueyuwenhuaDao;
import com.entity.DiscussyueyuwenhuaEntity;
import com.service.DiscussyueyuwenhuaService;
import com.entity.vo.DiscussyueyuwenhuaVO;
import com.entity.view.DiscussyueyuwenhuaView;

@Service("discussyueyuwenhuaService")
public class DiscussyueyuwenhuaServiceImpl extends ServiceImpl<DiscussyueyuwenhuaDao, DiscussyueyuwenhuaEntity> implements DiscussyueyuwenhuaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyueyuwenhuaEntity> page = this.selectPage(
                new Query<DiscussyueyuwenhuaEntity>(params).getPage(),
                new EntityWrapper<DiscussyueyuwenhuaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyueyuwenhuaEntity> wrapper) {
		  Page<DiscussyueyuwenhuaView> page =new Query<DiscussyueyuwenhuaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscussyueyuwenhuaVO> selectListVO(Wrapper<DiscussyueyuwenhuaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyueyuwenhuaVO selectVO(Wrapper<DiscussyueyuwenhuaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyueyuwenhuaView> selectListView(Wrapper<DiscussyueyuwenhuaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyueyuwenhuaView selectView(Wrapper<DiscussyueyuwenhuaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
