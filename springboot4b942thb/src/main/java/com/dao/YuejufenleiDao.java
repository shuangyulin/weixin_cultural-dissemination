package com.dao;

import com.entity.YuejufenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuejufenleiVO;
import com.entity.view.YuejufenleiView;


/**
 * 粤剧分类
 * 
 * @author 
 * @email 
 * @date 2025-02-18 12:43:19
 */
public interface YuejufenleiDao extends BaseMapper<YuejufenleiEntity> {
	
	List<YuejufenleiVO> selectListVO(@Param("ew") Wrapper<YuejufenleiEntity> wrapper);
	
	YuejufenleiVO selectVO(@Param("ew") Wrapper<YuejufenleiEntity> wrapper);
	
	List<YuejufenleiView> selectListView(@Param("ew") Wrapper<YuejufenleiEntity> wrapper);

	List<YuejufenleiView> selectListView(Pagination page,@Param("ew") Wrapper<YuejufenleiEntity> wrapper);

	
	YuejufenleiView selectView(@Param("ew") Wrapper<YuejufenleiEntity> wrapper);
	

}
