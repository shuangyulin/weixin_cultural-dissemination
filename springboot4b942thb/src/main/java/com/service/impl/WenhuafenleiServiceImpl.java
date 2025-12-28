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


import com.dao.WenhuafenleiDao;
import com.entity.WenhuafenleiEntity;
import com.service.WenhuafenleiService;
import com.entity.vo.WenhuafenleiVO;
import com.entity.view.WenhuafenleiView;

@Service("wenhuafenleiService")
public class WenhuafenleiServiceImpl extends ServiceImpl<WenhuafenleiDao, WenhuafenleiEntity> implements WenhuafenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenhuafenleiEntity> page = this.selectPage(
                new Query<WenhuafenleiEntity>(params).getPage(),
                new EntityWrapper<WenhuafenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenhuafenleiEntity> wrapper) {
		  Page<WenhuafenleiView> page =new Query<WenhuafenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<WenhuafenleiVO> selectListVO(Wrapper<WenhuafenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenhuafenleiVO selectVO(Wrapper<WenhuafenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenhuafenleiView> selectListView(Wrapper<WenhuafenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenhuafenleiView selectView(Wrapper<WenhuafenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
