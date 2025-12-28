package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenhuafenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenhuafenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenhuafenleiView;


/**
 * 文化分类
 *
 * @author 
 * @email 
 * @date 2025-02-18 12:43:19
 */
public interface WenhuafenleiService extends IService<WenhuafenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenhuafenleiVO> selectListVO(Wrapper<WenhuafenleiEntity> wrapper);
   	
   	WenhuafenleiVO selectVO(@Param("ew") Wrapper<WenhuafenleiEntity> wrapper);
   	
   	List<WenhuafenleiView> selectListView(Wrapper<WenhuafenleiEntity> wrapper);
   	
   	WenhuafenleiView selectView(@Param("ew") Wrapper<WenhuafenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenhuafenleiEntity> wrapper);

   	

}

