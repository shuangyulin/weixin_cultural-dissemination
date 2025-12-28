package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuejufenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuejufenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuejufenleiView;


/**
 * 粤剧分类
 *
 * @author 
 * @email 
 * @date 2025-02-18 12:43:19
 */
public interface YuejufenleiService extends IService<YuejufenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuejufenleiVO> selectListVO(Wrapper<YuejufenleiEntity> wrapper);
   	
   	YuejufenleiVO selectVO(@Param("ew") Wrapper<YuejufenleiEntity> wrapper);
   	
   	List<YuejufenleiView> selectListView(Wrapper<YuejufenleiEntity> wrapper);
   	
   	YuejufenleiView selectView(@Param("ew") Wrapper<YuejufenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuejufenleiEntity> wrapper);

   	

}

