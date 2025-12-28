package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YueyuyingshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YueyuyingshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YueyuyingshiView;


/**
 * 粤语影视
 *
 * @author 
 * @email 
 * @date 2025-02-18 12:43:19
 */
public interface YueyuyingshiService extends IService<YueyuyingshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YueyuyingshiVO> selectListVO(Wrapper<YueyuyingshiEntity> wrapper);
   	
   	YueyuyingshiVO selectVO(@Param("ew") Wrapper<YueyuyingshiEntity> wrapper);
   	
   	List<YueyuyingshiView> selectListView(Wrapper<YueyuyingshiEntity> wrapper);
   	
   	YueyuyingshiView selectView(@Param("ew") Wrapper<YueyuyingshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YueyuyingshiEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<YueyuyingshiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<YueyuyingshiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<YueyuyingshiEntity> wrapper);



}

