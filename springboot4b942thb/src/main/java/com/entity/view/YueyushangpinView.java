package com.entity.view;

import com.entity.YueyushangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 粤语商品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2025-02-18 12:43:20
 */
@TableName("yueyushangpin")
public class YueyushangpinView  extends YueyushangpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YueyushangpinView(){
	}
 
 	public YueyushangpinView(YueyushangpinEntity yueyushangpinEntity){
 	try {
			BeanUtils.copyProperties(this, yueyushangpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
