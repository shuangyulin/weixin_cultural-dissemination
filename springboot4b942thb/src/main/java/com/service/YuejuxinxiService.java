package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuejuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuejuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuejuxinxiView;


/**
 * 粤剧信息
 *
 * @author 
 * @email 
 * @date 2025-02-18 12:43:19
 */
public interface YuejuxinxiService extends IService<YuejuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuejuxinxiVO> selectListVO(Wrapper<YuejuxinxiEntity> wrapper);
   	
   	YuejuxinxiVO selectVO(@Param("ew") Wrapper<YuejuxinxiEntity> wrapper);
   	
   	List<YuejuxinxiView> selectListView(Wrapper<YuejuxinxiEntity> wrapper);
   	
   	YuejuxinxiView selectView(@Param("ew") Wrapper<YuejuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuejuxinxiEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<YuejuxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<YuejuxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<YuejuxinxiEntity> wrapper);



}

