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


import com.dao.DiscussyueyushangpinDao;
import com.entity.DiscussyueyushangpinEntity;
import com.service.DiscussyueyushangpinService;
import com.entity.vo.DiscussyueyushangpinVO;
import com.entity.view.DiscussyueyushangpinView;

@Service("discussyueyushangpinService")
public class DiscussyueyushangpinServiceImpl extends ServiceImpl<DiscussyueyushangpinDao, DiscussyueyushangpinEntity> implements DiscussyueyushangpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyueyushangpinEntity> page = this.selectPage(
                new Query<DiscussyueyushangpinEntity>(params).getPage(),
                new EntityWrapper<DiscussyueyushangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyueyushangpinEntity> wrapper) {
		  Page<DiscussyueyushangpinView> page =new Query<DiscussyueyushangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscussyueyushangpinVO> selectListVO(Wrapper<DiscussyueyushangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyueyushangpinVO selectVO(Wrapper<DiscussyueyushangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyueyushangpinView> selectListView(Wrapper<DiscussyueyushangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyueyushangpinView selectView(Wrapper<DiscussyueyushangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
