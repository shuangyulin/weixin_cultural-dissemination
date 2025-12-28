package com.entity.view;

import com.entity.YingshifenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 影视分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2025-02-18 12:43:19
 */
@TableName("yingshifenlei")
public class YingshifenleiView  extends YingshifenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YingshifenleiView(){
	}
 
 	public YingshifenleiView(YingshifenleiEntity yingshifenleiEntity){
 	try {
			BeanUtils.copyProperties(this, yingshifenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
