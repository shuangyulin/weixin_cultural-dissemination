package com.dao;

import com.entity.YingshifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YingshifenleiVO;
import com.entity.view.YingshifenleiView;


/**
 * 影视分类
 * 
 * @author 
 * @email 
 * @date 2025-02-18 12:43:19
 */
public interface YingshifenleiDao extends BaseMapper<YingshifenleiEntity> {
	
	List<YingshifenleiVO> selectListVO(@Param("ew") Wrapper<YingshifenleiEntity> wrapper);
	
	YingshifenleiVO selectVO(@Param("ew") Wrapper<YingshifenleiEntity> wrapper);
	
	List<YingshifenleiView> selectListView(@Param("ew") Wrapper<YingshifenleiEntity> wrapper);

	List<YingshifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<YingshifenleiEntity> wrapper);

	
	YingshifenleiView selectView(@Param("ew") Wrapper<YingshifenleiEntity> wrapper);
	

}
