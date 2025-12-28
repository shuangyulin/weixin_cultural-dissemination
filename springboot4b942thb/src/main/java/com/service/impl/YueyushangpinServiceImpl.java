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


import com.dao.YueyushangpinDao;
import com.entity.YueyushangpinEntity;
import com.service.YueyushangpinService;
import com.entity.vo.YueyushangpinVO;
import com.entity.view.YueyushangpinView;

@Service("yueyushangpinService")
public class YueyushangpinServiceImpl extends ServiceImpl<YueyushangpinDao, YueyushangpinEntity> implements YueyushangpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YueyushangpinEntity> page = this.selectPage(
                new Query<YueyushangpinEntity>(params).getPage(),
                new EntityWrapper<YueyushangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YueyushangpinEntity> wrapper) {
		  Page<YueyushangpinView> page =new Query<YueyushangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<YueyushangpinVO> selectListVO(Wrapper<YueyushangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YueyushangpinVO selectVO(Wrapper<YueyushangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YueyushangpinView> selectListView(Wrapper<YueyushangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YueyushangpinView selectView(Wrapper<YueyushangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
