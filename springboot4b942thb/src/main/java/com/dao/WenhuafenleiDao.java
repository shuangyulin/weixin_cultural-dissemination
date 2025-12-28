package com.dao;

import com.entity.WenhuafenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenhuafenleiVO;
import com.entity.view.WenhuafenleiView;


/**
 * 文化分类
 * 
 * @author 
 * @email 
 * @date 2025-02-18 12:43:19
 */
public interface WenhuafenleiDao extends BaseMapper<WenhuafenleiEntity> {
	
	List<WenhuafenleiVO> selectListVO(@Param("ew") Wrapper<WenhuafenleiEntity> wrapper);
	
	WenhuafenleiVO selectVO(@Param("ew") Wrapper<WenhuafenleiEntity> wrapper);
	
	List<WenhuafenleiView> selectListView(@Param("ew") Wrapper<WenhuafenleiEntity> wrapper);

	List<WenhuafenleiView> selectListView(Pagination page,@Param("ew") Wrapper<WenhuafenleiEntity> wrapper);

	
	WenhuafenleiView selectView(@Param("ew") Wrapper<WenhuafenleiEntity> wrapper);
	

}
