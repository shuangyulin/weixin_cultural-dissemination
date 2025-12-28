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


import com.dao.YuejufenleiDao;
import com.entity.YuejufenleiEntity;
import com.service.YuejufenleiService;
import com.entity.vo.YuejufenleiVO;
import com.entity.view.YuejufenleiView;

@Service("yuejufenleiService")
public class YuejufenleiServiceImpl extends ServiceImpl<YuejufenleiDao, YuejufenleiEntity> implements YuejufenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuejufenleiEntity> page = this.selectPage(
                new Query<YuejufenleiEntity>(params).getPage(),
                new EntityWrapper<YuejufenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuejufenleiEntity> wrapper) {
		  Page<YuejufenleiView> page =new Query<YuejufenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<YuejufenleiVO> selectListVO(Wrapper<YuejufenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuejufenleiVO selectVO(Wrapper<YuejufenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuejufenleiView> selectListView(Wrapper<YuejufenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuejufenleiView selectView(Wrapper<YuejufenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
