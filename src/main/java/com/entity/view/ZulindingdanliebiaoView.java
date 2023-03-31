package com.entity.view;

import com.entity.ZulindingdanliebiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 租赁订单列表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-13 10:03:34
 */
@TableName("zulindingdanliebiao")
public class ZulindingdanliebiaoView  extends ZulindingdanliebiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZulindingdanliebiaoView(){
	}
 
 	public ZulindingdanliebiaoView(ZulindingdanliebiaoEntity zulindingdanliebiaoEntity){
 	try {
			BeanUtils.copyProperties(this, zulindingdanliebiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
