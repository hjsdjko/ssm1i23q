package com.entity.view;

import com.entity.XueshengfanxiaoshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生返校申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-15 11:56:39
 */
@TableName("xueshengfanxiaoshenqing")
public class XueshengfanxiaoshenqingView  extends XueshengfanxiaoshenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengfanxiaoshenqingView(){
	}
 
 	public XueshengfanxiaoshenqingView(XueshengfanxiaoshenqingEntity xueshengfanxiaoshenqingEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengfanxiaoshenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
