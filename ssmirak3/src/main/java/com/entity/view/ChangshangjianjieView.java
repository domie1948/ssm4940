package com.entity.view;

import com.entity.ChangshangjianjieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 厂商简介
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-11-07 11:11:45
 */
@TableName("changshangjianjie")
public class ChangshangjianjieView  extends ChangshangjianjieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChangshangjianjieView(){
	}
 
 	public ChangshangjianjieView(ChangshangjianjieEntity changshangjianjieEntity){
 	try {
			BeanUtils.copyProperties(this, changshangjianjieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
