package com.dao;

import com.entity.YuejuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuejuxinxiVO;
import com.entity.view.YuejuxinxiView;


/**
 * 粤剧信息
 * 
 * @author 
 * @email 
 * @date 2025-02-18 12:43:19
 */
public interface YuejuxinxiDao extends BaseMapper<YuejuxinxiEntity> {
	
	List<YuejuxinxiVO> selectListVO(@Param("ew") Wrapper<YuejuxinxiEntity> wrapper);
	
	YuejuxinxiVO selectVO(@Param("ew") Wrapper<YuejuxinxiEntity> wrapper);
	
	List<YuejuxinxiView> selectListView(@Param("ew") Wrapper<YuejuxinxiEntity> wrapper);

	List<YuejuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YuejuxinxiEntity> wrapper);

	
	YuejuxinxiView selectView(@Param("ew") Wrapper<YuejuxinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YuejuxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YuejuxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YuejuxinxiEntity> wrapper);



}
