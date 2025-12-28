package com.dao;

import com.entity.YueyuwenhuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YueyuwenhuaVO;
import com.entity.view.YueyuwenhuaView;


/**
 * 粤语文化
 * 
 * @author 
 * @email 
 * @date 2025-02-18 12:43:19
 */
public interface YueyuwenhuaDao extends BaseMapper<YueyuwenhuaEntity> {
	
	List<YueyuwenhuaVO> selectListVO(@Param("ew") Wrapper<YueyuwenhuaEntity> wrapper);
	
	YueyuwenhuaVO selectVO(@Param("ew") Wrapper<YueyuwenhuaEntity> wrapper);
	
	List<YueyuwenhuaView> selectListView(@Param("ew") Wrapper<YueyuwenhuaEntity> wrapper);

	List<YueyuwenhuaView> selectListView(Pagination page,@Param("ew") Wrapper<YueyuwenhuaEntity> wrapper);

	
	YueyuwenhuaView selectView(@Param("ew") Wrapper<YueyuwenhuaEntity> wrapper);
	

}
