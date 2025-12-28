package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YingshifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YingshifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YingshifenleiView;


/**
 * 影视分类
 *
 * @author 
 * @email 
 * @date 2025-02-18 12:43:19
 */
public interface YingshifenleiService extends IService<YingshifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YingshifenleiVO> selectListVO(Wrapper<YingshifenleiEntity> wrapper);
   	
   	YingshifenleiVO selectVO(@Param("ew") Wrapper<YingshifenleiEntity> wrapper);
   	
   	List<YingshifenleiView> selectListView(Wrapper<YingshifenleiEntity> wrapper);
   	
   	YingshifenleiView selectView(@Param("ew") Wrapper<YingshifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YingshifenleiEntity> wrapper);

   	

}

