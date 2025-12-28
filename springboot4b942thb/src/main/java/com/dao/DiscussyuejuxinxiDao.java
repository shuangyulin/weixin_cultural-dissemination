package com.dao;

import com.entity.DiscussyuejuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyuejuxinxiVO;
import com.entity.view.DiscussyuejuxinxiView;


/**
 * 粤剧信息评论表
 * 
 * @author 
 * @email 
 * @date 2025-02-18 12:43:21
 */
public interface DiscussyuejuxinxiDao extends BaseMapper<DiscussyuejuxinxiEntity> {
	
	List<DiscussyuejuxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussyuejuxinxiEntity> wrapper);
	
	DiscussyuejuxinxiVO selectVO(@Param("ew") Wrapper<DiscussyuejuxinxiEntity> wrapper);
	
	List<DiscussyuejuxinxiView> selectListView(@Param("ew") Wrapper<DiscussyuejuxinxiEntity> wrapper);

	List<DiscussyuejuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyuejuxinxiEntity> wrapper);

	
	DiscussyuejuxinxiView selectView(@Param("ew") Wrapper<DiscussyuejuxinxiEntity> wrapper);
	

}
