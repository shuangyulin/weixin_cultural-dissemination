package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YueyushangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YueyushangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YueyushangpinView;


/**
 * 粤语商品
 *
 * @author 
 * @email 
 * @date 2025-02-18 12:43:20
 */
public interface YueyushangpinService extends IService<YueyushangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YueyushangpinVO> selectListVO(Wrapper<YueyushangpinEntity> wrapper);
   	
   	YueyushangpinVO selectVO(@Param("ew") Wrapper<YueyushangpinEntity> wrapper);
   	
   	List<YueyushangpinView> selectListView(Wrapper<YueyushangpinEntity> wrapper);
   	
   	YueyushangpinView selectView(@Param("ew") Wrapper<YueyushangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YueyushangpinEntity> wrapper);

   	

}

