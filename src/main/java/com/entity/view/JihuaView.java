package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.JihuaEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 招生计划
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("jihua")
public class JihuaView extends JihuaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 计划类型的值
	*/
	@ColumnInfo(comment="计划类型的字典表值",type="varchar(200)")
	private String jihuaValue;




	public JihuaView() {

	}

	public JihuaView(JihuaEntity jihuaEntity) {
		try {
			BeanUtils.copyProperties(this, jihuaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 计划类型的值
	*/
	public String getJihuaValue() {
		return jihuaValue;
	}
	/**
	* 设置： 计划类型的值
	*/
	public void setJihuaValue(String jihuaValue) {
		this.jihuaValue = jihuaValue;
	}




	@Override
	public String toString() {
		return "JihuaView{" +
			", jihuaValue=" + jihuaValue +
			"} " + super.toString();
	}
}
