package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YueyuwenhuaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YueyuwenhuaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YueyuwenhuaView;


/**
 * 粤语文化
 *
 * @author 
 * @email 
 * @date 2025-02-18 12:43:19
 */
public interface YueyuwenhuaService extends IService<YueyuwenhuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YueyuwenhuaVO> selectListVO(Wrapper<YueyuwenhuaEntity> wrapper);
   	
   	YueyuwenhuaVO selectVO(@Param("ew") Wrapper<YueyuwenhuaEntity> wrapper);
   	
   	List<YueyuwenhuaView> selectListView(Wrapper<YueyuwenhuaEntity> wrapper);
   	
   	YueyuwenhuaView selectView(@Param("ew") Wrapper<YueyuwenhuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YueyuwenhuaEntity> wrapper);

   	

}

