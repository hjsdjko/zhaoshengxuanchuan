package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.XinxiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 信息公开
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("xinxi")
public class XinxiView extends XinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 信息公开类型的值
	*/
	@ColumnInfo(comment="信息公开类型的字典表值",type="varchar(200)")
	private String xinxiValue;




	public XinxiView() {

	}

	public XinxiView(XinxiEntity xinxiEntity) {
		try {
			BeanUtils.copyProperties(this, xinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 信息公开类型的值
	*/
	public String getXinxiValue() {
		return xinxiValue;
	}
	/**
	* 设置： 信息公开类型的值
	*/
	public void setXinxiValue(String xinxiValue) {
		this.xinxiValue = xinxiValue;
	}




	@Override
	public String toString() {
		return "XinxiView{" +
			", xinxiValue=" + xinxiValue +
			"} " + super.toString();
	}
}
