package com.entity.view;

import com.entity.YueyuyingshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 粤语影视
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2025-02-18 12:43:19
 */
@TableName("yueyuyingshi")
public class YueyuyingshiView  extends YueyuyingshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YueyuyingshiView(){
	}
 
 	public YueyuyingshiView(YueyuyingshiEntity yueyuyingshiEntity){
 	try {
			BeanUtils.copyProperties(this, yueyuyingshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
