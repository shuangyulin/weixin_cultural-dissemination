package com.dao;

import com.entity.DiscussyueyuwenhuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyueyuwenhuaVO;
import com.entity.view.DiscussyueyuwenhuaView;


/**
 * 粤语文化评论表
 * 
 * @author 
 * @email 
 * @date 2025-02-18 12:43:21
 */
public interface DiscussyueyuwenhuaDao extends BaseMapper<DiscussyueyuwenhuaEntity> {
	
	List<DiscussyueyuwenhuaVO> selectListVO(@Param("ew") Wrapper<DiscussyueyuwenhuaEntity> wrapper);
	
	DiscussyueyuwenhuaVO selectVO(@Param("ew") Wrapper<DiscussyueyuwenhuaEntity> wrapper);
	
	List<DiscussyueyuwenhuaView> selectListView(@Param("ew") Wrapper<DiscussyueyuwenhuaEntity> wrapper);

	List<DiscussyueyuwenhuaView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyueyuwenhuaEntity> wrapper);

	
	DiscussyueyuwenhuaView selectView(@Param("ew") Wrapper<DiscussyueyuwenhuaEntity> wrapper);
	

}
