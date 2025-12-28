package com.entity.view;

import com.entity.DiscussyueyuwenhuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 粤语文化评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2025-02-18 12:43:21
 */
@TableName("discussyueyuwenhua")
public class DiscussyueyuwenhuaView  extends DiscussyueyuwenhuaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussyueyuwenhuaView(){
	}
 
 	public DiscussyueyuwenhuaView(DiscussyueyuwenhuaEntity discussyueyuwenhuaEntity){
 	try {
			BeanUtils.copyProperties(this, discussyueyuwenhuaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
