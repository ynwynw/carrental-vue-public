package com.entity.view;

import com.entity.DiscusscheliangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 车辆信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-13 10:03:34
 */
@TableName("discusscheliangxinxi")
public class DiscusscheliangxinxiView  extends DiscusscheliangxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusscheliangxinxiView(){
	}
 
 	public DiscusscheliangxinxiView(DiscusscheliangxinxiEntity discusscheliangxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discusscheliangxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
