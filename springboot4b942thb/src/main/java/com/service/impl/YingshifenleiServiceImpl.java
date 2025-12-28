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


import com.dao.YingshifenleiDao;
import com.entity.YingshifenleiEntity;
import com.service.YingshifenleiService;
import com.entity.vo.YingshifenleiVO;
import com.entity.view.YingshifenleiView;

@Service("yingshifenleiService")
public class YingshifenleiServiceImpl extends ServiceImpl<YingshifenleiDao, YingshifenleiEntity> implements YingshifenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YingshifenleiEntity> page = this.selectPage(
                new Query<YingshifenleiEntity>(params).getPage(),
                new EntityWrapper<YingshifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YingshifenleiEntity> wrapper) {
		  Page<YingshifenleiView> page =new Query<YingshifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<YingshifenleiVO> selectListVO(Wrapper<YingshifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YingshifenleiVO selectVO(Wrapper<YingshifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YingshifenleiView> selectListView(Wrapper<YingshifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YingshifenleiView selectView(Wrapper<YingshifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
