package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.WuziXiaohaoEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 物资消耗
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("wuzi_xiaohao")
public class WuziXiaohaoView extends WuziXiaohaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 物资消耗类型的值
	*/
	@ColumnInfo(comment="物资消耗类型的字典表值",type="varchar(200)")
	private String wuziXiaohaoValue;

	//级联表 物资
		/**
		* 物资编号
		*/

		@ColumnInfo(comment="物资编号",type="varchar(200)")
		private String wuziUuidNumber;
		/**
		* 物资名称
		*/

		@ColumnInfo(comment="物资名称",type="varchar(200)")
		private String wuziName;
		/**
		* 物资照片
		*/

		@ColumnInfo(comment="物资照片",type="varchar(200)")
		private String wuziPhoto;
		/**
		* 单位
		*/

		@ColumnInfo(comment="单位",type="varchar(200)")
		private String wuziDanwei;
		/**
		* 物资类型
		*/
		@ColumnInfo(comment="物资类型",type="int(11)")
		private Integer wuziTypes;
			/**
			* 物资类型的值
			*/
			@ColumnInfo(comment="物资类型的字典表值",type="varchar(200)")
			private String wuziValue;
		/**
		* 物资数量
		*/

		@ColumnInfo(comment="物资数量",type="int(11)")
		private Integer wuziKucunNumber;
		/**
		* 阈值
		*/

		@ColumnInfo(comment="阈值",type="int(11)")
		private Integer wuziYuzhi;
		/**
		* 物资介绍
		*/

		@ColumnInfo(comment="物资介绍",type="longtext")
		private String wuziContent;
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



	public WuziXiaohaoView() {

	}

	public WuziXiaohaoView(WuziXiaohaoEntity wuziXiaohaoEntity) {
		try {
			BeanUtils.copyProperties(this, wuziXiaohaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 物资消耗类型的值
	*/
	public String getWuziXiaohaoValue() {
		return wuziXiaohaoValue;
	}
	/**
	* 设置： 物资消耗类型的值
	*/
	public void setWuziXiaohaoValue(String wuziXiaohaoValue) {
		this.wuziXiaohaoValue = wuziXiaohaoValue;
	}


	//级联表的get和set 物资

		/**
		* 获取： 物资编号
		*/
		public String getWuziUuidNumber() {
			return wuziUuidNumber;
		}
		/**
		* 设置： 物资编号
		*/
		public void setWuziUuidNumber(String wuziUuidNumber) {
			this.wuziUuidNumber = wuziUuidNumber;
		}

		/**
		* 获取： 物资名称
		*/
		public String getWuziName() {
			return wuziName;
		}
		/**
		* 设置： 物资名称
		*/
		public void setWuziName(String wuziName) {
			this.wuziName = wuziName;
		}

		/**
		* 获取： 物资照片
		*/
		public String getWuziPhoto() {
			return wuziPhoto;
		}
		/**
		* 设置： 物资照片
		*/
		public void setWuziPhoto(String wuziPhoto) {
			this.wuziPhoto = wuziPhoto;
		}

		/**
		* 获取： 单位
		*/
		public String getWuziDanwei() {
			return wuziDanwei;
		}
		/**
		* 设置： 单位
		*/
		public void setWuziDanwei(String wuziDanwei) {
			this.wuziDanwei = wuziDanwei;
		}
		/**
		* 获取： 物资类型
		*/
		public Integer getWuziTypes() {
			return wuziTypes;
		}
		/**
		* 设置： 物资类型
		*/
		public void setWuziTypes(Integer wuziTypes) {
			this.wuziTypes = wuziTypes;
		}


			/**
			* 获取： 物资类型的值
			*/
			public String getWuziValue() {
				return wuziValue;
			}
			/**
			* 设置： 物资类型的值
			*/
			public void setWuziValue(String wuziValue) {
				this.wuziValue = wuziValue;
			}

		/**
		* 获取： 物资数量
		*/
		public Integer getWuziKucunNumber() {
			return wuziKucunNumber;
		}
		/**
		* 设置： 物资数量
		*/
		public void setWuziKucunNumber(Integer wuziKucunNumber) {
			this.wuziKucunNumber = wuziKucunNumber;
		}

		/**
		* 获取： 阈值
		*/
		public Integer getWuziYuzhi() {
			return wuziYuzhi;
		}
		/**
		* 设置： 阈值
		*/
		public void setWuziYuzhi(Integer wuziYuzhi) {
			this.wuziYuzhi = wuziYuzhi;
		}

		/**
		* 获取： 物资介绍
		*/
		public String getWuziContent() {
			return wuziContent;
		}
		/**
		* 设置： 物资介绍
		*/
		public void setWuziContent(String wuziContent) {
			this.wuziContent = wuziContent;
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
		return "WuziXiaohaoView{" +
			", wuziXiaohaoValue=" + wuziXiaohaoValue +
			", wuziUuidNumber=" + wuziUuidNumber +
			", wuziName=" + wuziName +
			", wuziPhoto=" + wuziPhoto +
			", wuziDanwei=" + wuziDanwei +
			", wuziKucunNumber=" + wuziKucunNumber +
			", wuziYuzhi=" + wuziYuzhi +
			", wuziContent=" + wuziContent +
			", zhaoshengrenyuanName=" + zhaoshengrenyuanName +
			", zhaoshengrenyuanPhone=" + zhaoshengrenyuanPhone +
			", zhaoshengrenyuanIdNumber=" + zhaoshengrenyuanIdNumber +
			", zhaoshengrenyuanPhoto=" + zhaoshengrenyuanPhoto +
			", zhaoshengrenyuanEmail=" + zhaoshengrenyuanEmail +
			"} " + super.toString();
	}
}
