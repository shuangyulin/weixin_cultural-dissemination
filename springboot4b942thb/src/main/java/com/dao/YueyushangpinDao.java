package com.dao;

import com.entity.YueyushangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YueyushangpinVO;
import com.entity.view.YueyushangpinView;


/**
 * 粤语商品
 * 
 * @author 
 * @email 
 * @date 2025-02-18 12:43:20
 */
public interface YueyushangpinDao extends BaseMapper<YueyushangpinEntity> {
	
	List<YueyushangpinVO> selectListVO(@Param("ew") Wrapper<YueyushangpinEntity> wrapper);
	
	YueyushangpinVO selectVO(@Param("ew") Wrapper<YueyushangpinEntity> wrapper);
	
	List<YueyushangpinView> selectListView(@Param("ew") Wrapper<YueyushangpinEntity> wrapper);

	List<YueyushangpinView> selectListView(Pagination page,@Param("ew") Wrapper<YueyushangpinEntity> wrapper);

	
	YueyushangpinView selectView(@Param("ew") Wrapper<YueyushangpinEntity> wrapper);
	

}
