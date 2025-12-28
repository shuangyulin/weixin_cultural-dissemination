package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyueyuyingshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyueyuyingshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyueyuyingshiView;


/**
 * 粤语影视评论表
 *
 * @author 
 * @email 
 * @date 2025-02-18 12:43:21
 */
public interface DiscussyueyuyingshiService extends IService<DiscussyueyuyingshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyueyuyingshiVO> selectListVO(Wrapper<DiscussyueyuyingshiEntity> wrapper);
   	
   	DiscussyueyuyingshiVO selectVO(@Param("ew") Wrapper<DiscussyueyuyingshiEntity> wrapper);
   	
   	List<DiscussyueyuyingshiView> selectListView(Wrapper<DiscussyueyuyingshiEntity> wrapper);
   	
   	DiscussyueyuyingshiView selectView(@Param("ew") Wrapper<DiscussyueyuyingshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyueyuyingshiEntity> wrapper);

   	

}

