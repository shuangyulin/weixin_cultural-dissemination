package com.dao;

import com.entity.YueyuyingshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YueyuyingshiVO;
import com.entity.view.YueyuyingshiView;


/**
 * 粤语影视
 * 
 * @author 
 * @email 
 * @date 2025-02-18 12:43:19
 */
public interface YueyuyingshiDao extends BaseMapper<YueyuyingshiEntity> {
	
	List<YueyuyingshiVO> selectListVO(@Param("ew") Wrapper<YueyuyingshiEntity> wrapper);
	
	YueyuyingshiVO selectVO(@Param("ew") Wrapper<YueyuyingshiEntity> wrapper);
	
	List<YueyuyingshiView> selectListView(@Param("ew") Wrapper<YueyuyingshiEntity> wrapper);

	List<YueyuyingshiView> selectListView(Pagination page,@Param("ew") Wrapper<YueyuyingshiEntity> wrapper);

	
	YueyuyingshiView selectView(@Param("ew") Wrapper<YueyuyingshiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YueyuyingshiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YueyuyingshiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YueyuyingshiEntity> wrapper);



}
