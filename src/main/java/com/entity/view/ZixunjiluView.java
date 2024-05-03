package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ZixunjiluEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 咨询记录
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("zixunjilu")
public class ZixunjiluView extends ZixunjiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 咨询方式的值
	*/
	@ColumnInfo(comment="咨询方式的字典表值",type="varchar(200)")
	private String zixunjiluFangshiValue;
	/**
	* 咨询重点的值
	*/
	@ColumnInfo(comment="咨询重点的字典表值",type="varchar(200)")
	private String zixunjiluZhongdianValue;

	//级联表 招生人员
		/**
		* 招生人员姓名
		*/

		@ColumnInfo(comment="招生人员姓名",type="varchar(200)")
		private String zhaoshengrenyuanName;
		/**
		* 招生人员手机号
		*/

		@ColumnInfo(comment="招生人员手机号",type="varchar(200)")
		private String zhaoshengrenyuanPhone;
		/**
		* 招生人员身份证号
		*/

		@ColumnInfo(comment="招生人员身份证号",type="varchar(200)")
		private String zhaoshengrenyuanIdNumber;
		/**
		* 招生人员头像
		*/

		@ColumnInfo(comment="招生人员头像",type="varchar(200)")
		private String zhaoshengrenyuanPhoto;
		/**
		* 招生人员邮箱
		*/

		@ColumnInfo(comment="招生人员邮箱",type="varchar(200)")
		private String zhaoshengrenyuanEmail;



	public ZixunjiluView() {

	}

	public ZixunjiluView(ZixunjiluEntity zixunjiluEntity) {
		try {
			BeanUtils.copyProperties(this, zixunjiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 咨询方式的值
	*/
	public String getZixunjiluFangshiValue() {
		return zixunjiluFangshiValue;
	}
	/**
	* 设置： 咨询方式的值
	*/
	public void setZixunjiluFangshiValue(String zixunjiluFangshiValue) {
		this.zixunjiluFangshiValue = zixunjiluFangshiValue;
	}
	//当前表的
	/**
	* 获取： 咨询重点的值
	*/
	public String getZixunjiluZhongdianValue() {
		return zixunjiluZhongdianValue;
	}
	/**
	* 设置： 咨询重点的值
	*/
	public void setZixunjiluZhongdianValue(String zixunjiluZhongdianValue) {
		this.zixunjiluZhongdianValue = zixunjiluZhongdianValue;
	}


	//级联表的get和set 招生人员

		/**
		* 获取： 招生人员姓名
		*/
		public String getZhaoshengrenyuanName() {
			return zhaoshengrenyuanName;
		}
		/**
		* 设置： 招生人员姓名
		*/
		public void setZhaoshengrenyuanName(String zhaoshengrenyuanName) {
			this.zhaoshengrenyuanName = zhaoshengrenyuanName;
		}

		/**
		* 获取： 招生人员手机号
		*/
		public String getZhaoshengrenyuanPhone() {
			return zhaoshengrenyuanPhone;
		}
		/**
		* 设置： 招生人员手机号
		*/
		public void setZhaoshengrenyuanPhone(String zhaoshengrenyuanPhone) {
			this.zhaoshengrenyuanPhone = zhaoshengrenyuanPhone;
		}

		/**
		* 获取： 招生人员身份证号
		*/
		public String getZhaoshengrenyuanIdNumber() {
			return zhaoshengrenyuanIdNumber;
		}
		/**
		* 设置： 招生人员身份证号
		*/
		public void setZhaoshengrenyuanIdNumber(String zhaoshengrenyuanIdNumber) {
			this.zhaoshengrenyuanIdNumber = zhaoshengrenyuanIdNumber;
		}

		/**
		* 获取： 招生人员头像
		*/
		public String getZhaoshengrenyuanPhoto() {
			return zhaoshengrenyuanPhoto;
		}
		/**
		* 设置： 招生人员头像
		*/
		public void setZhaoshengrenyuanPhoto(String zhaoshengrenyuanPhoto) {
			this.zhaoshengrenyuanPhoto = zhaoshengrenyuanPhoto;
		}

		/**
		* 获取： 招生人员邮箱
		*/
		public String getZhaoshengrenyuanEmail() {
			return zhaoshengrenyuanEmail;
		}
		/**
		* 设置： 招生人员邮箱
		*/
		public void setZhaoshengrenyuanEmail(String zhaoshengrenyuanEmail) {
			this.zhaoshengrenyuanEmail = zhaoshengrenyuanEmail;
		}


	@Override
	public String toString() {
		return "ZixunjiluView{" +
			", zixunjiluFangshiValue=" + zixunjiluFangshiValue +
			", zixunjiluZhongdianValue=" + zixunjiluZhongdianValue +
			", zhaoshengrenyuanName=" + zhaoshengrenyuanName +
			", zhaoshengrenyuanPhone=" + zhaoshengrenyuanPhone +
			", zhaoshengrenyuanIdNumber=" + zhaoshengrenyuanIdNumber +
			", zhaoshengrenyuanPhoto=" + zhaoshengrenyuanPhoto +
			", zhaoshengrenyuanEmail=" + zhaoshengrenyuanEmail +
			"} " + super.toString();
	}
}
