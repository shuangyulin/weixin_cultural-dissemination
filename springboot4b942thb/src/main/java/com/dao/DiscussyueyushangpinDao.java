package com.dao;

import com.entity.DiscussyueyushangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyueyushangpinVO;
import com.entity.view.DiscussyueyushangpinView;


/**
 * 粤语商品评论表
 * 
 * @author 
 * @email 
 * @date 2025-02-18 12:43:21
 */
public interface DiscussyueyushangpinDao extends BaseMapper<DiscussyueyushangpinEntity> {
	
	List<DiscussyueyushangpinVO> selectListVO(@Param("ew") Wrapper<DiscussyueyushangpinEntity> wrapper);
	
	DiscussyueyushangpinVO selectVO(@Param("ew") Wrapper<DiscussyueyushangpinEntity> wrapper);
	
	List<DiscussyueyushangpinView> selectListView(@Param("ew") Wrapper<DiscussyueyushangpinEntity> wrapper);

	List<DiscussyueyushangpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyueyushangpinEntity> wrapper);

	
	DiscussyueyushangpinView selectView(@Param("ew") Wrapper<DiscussyueyushangpinEntity> wrapper);
	

}
