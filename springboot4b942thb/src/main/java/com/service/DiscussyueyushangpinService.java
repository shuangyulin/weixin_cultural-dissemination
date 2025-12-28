package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyueyushangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyueyushangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyueyushangpinView;


/**
 * 粤语商品评论表
 *
 * @author 
 * @email 
 * @date 2025-02-18 12:43:21
 */
public interface DiscussyueyushangpinService extends IService<DiscussyueyushangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyueyushangpinVO> selectListVO(Wrapper<DiscussyueyushangpinEntity> wrapper);
   	
   	DiscussyueyushangpinVO selectVO(@Param("ew") Wrapper<DiscussyueyushangpinEntity> wrapper);
   	
   	List<DiscussyueyushangpinView> selectListView(Wrapper<DiscussyueyushangpinEntity> wrapper);
   	
   	DiscussyueyushangpinView selectView(@Param("ew") Wrapper<DiscussyueyushangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyueyushangpinEntity> wrapper);

   	

}

