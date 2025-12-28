package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyuejuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyuejuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyuejuxinxiView;


/**
 * 粤剧信息评论表
 *
 * @author 
 * @email 
 * @date 2025-02-18 12:43:21
 */
public interface DiscussyuejuxinxiService extends IService<DiscussyuejuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyuejuxinxiVO> selectListVO(Wrapper<DiscussyuejuxinxiEntity> wrapper);
   	
   	DiscussyuejuxinxiVO selectVO(@Param("ew") Wrapper<DiscussyuejuxinxiEntity> wrapper);
   	
   	List<DiscussyuejuxinxiView> selectListView(Wrapper<DiscussyuejuxinxiEntity> wrapper);
   	
   	DiscussyuejuxinxiView selectView(@Param("ew") Wrapper<DiscussyuejuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyuejuxinxiEntity> wrapper);

   	

}

