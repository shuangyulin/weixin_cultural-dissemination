package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyueyuwenhuaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyueyuwenhuaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyueyuwenhuaView;


/**
 * 粤语文化评论表
 *
 * @author 
 * @email 
 * @date 2025-02-18 12:43:21
 */
public interface DiscussyueyuwenhuaService extends IService<DiscussyueyuwenhuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyueyuwenhuaVO> selectListVO(Wrapper<DiscussyueyuwenhuaEntity> wrapper);
   	
   	DiscussyueyuwenhuaVO selectVO(@Param("ew") Wrapper<DiscussyueyuwenhuaEntity> wrapper);
   	
   	List<DiscussyueyuwenhuaView> selectListView(Wrapper<DiscussyueyuwenhuaEntity> wrapper);
   	
   	DiscussyueyuwenhuaView selectView(@Param("ew") Wrapper<DiscussyueyuwenhuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyueyuwenhuaEntity> wrapper);

   	

}

