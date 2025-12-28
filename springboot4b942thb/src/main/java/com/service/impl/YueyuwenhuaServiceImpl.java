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


import com.dao.YueyuwenhuaDao;
import com.entity.YueyuwenhuaEntity;
import com.service.YueyuwenhuaService;
import com.entity.vo.YueyuwenhuaVO;
import com.entity.view.YueyuwenhuaView;

@Service("yueyuwenhuaService")
public class YueyuwenhuaServiceImpl extends ServiceImpl<YueyuwenhuaDao, YueyuwenhuaEntity> implements YueyuwenhuaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YueyuwenhuaEntity> page = this.selectPage(
                new Query<YueyuwenhuaEntity>(params).getPage(),
                new EntityWrapper<YueyuwenhuaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YueyuwenhuaEntity> wrapper) {
		  Page<YueyuwenhuaView> page =new Query<YueyuwenhuaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<YueyuwenhuaVO> selectListVO(Wrapper<YueyuwenhuaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YueyuwenhuaVO selectVO(Wrapper<YueyuwenhuaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YueyuwenhuaView> selectListView(Wrapper<YueyuwenhuaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YueyuwenhuaView selectView(Wrapper<YueyuwenhuaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
