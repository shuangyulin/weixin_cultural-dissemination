package com.dao;

import com.entity.DiscussyueyuyingshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyueyuyingshiVO;
import com.entity.view.DiscussyueyuyingshiView;


/**
 * 粤语影视评论表
 * 
 * @author 
 * @email 
 * @date 2025-02-18 12:43:21
 */
public interface DiscussyueyuyingshiDao extends BaseMapper<DiscussyueyuyingshiEntity> {
	
	List<DiscussyueyuyingshiVO> selectListVO(@Param("ew") Wrapper<DiscussyueyuyingshiEntity> wrapper);
	
	DiscussyueyuyingshiVO selectVO(@Param("ew") Wrapper<DiscussyueyuyingshiEntity> wrapper);
	
	List<DiscussyueyuyingshiView> selectListView(@Param("ew") Wrapper<DiscussyueyuyingshiEntity> wrapper);

	List<DiscussyueyuyingshiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyueyuyingshiEntity> wrapper);

	
	DiscussyueyuyingshiView selectView(@Param("ew") Wrapper<DiscussyueyuyingshiEntity> wrapper);
	

}
