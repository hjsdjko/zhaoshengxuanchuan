package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 信息公开
 *
 * @author 
 * @email
 */
@TableName("xinxi")
public class XinxiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XinxiEntity() {

	}

	public XinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 信息公开名称
     */
    @ColumnInfo(comment="信息公开名称",type="varchar(200)")
    @TableField(value = "xinxi_name")

    private String xinxiName;


    /**
     * 信息公开图片
     */
    @ColumnInfo(comment="信息公开图片",type="varchar(200)")
    @TableField(value = "xinxi_photo")

    private String xinxiPhoto;


    /**
     * 信息公开类型
     */
    @ColumnInfo(comment="信息公开类型",type="int(11)")
    @TableField(value = "xinxi_types")

    private Integer xinxiTypes;


    /**
     * 信息公开发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="信息公开发布时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 信息公开详情
     */
    @ColumnInfo(comment="信息公开详情",type="longtext")
    @TableField(value = "xinxi_content")

    private String xinxiContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：信息公开名称
	 */
    public String getXinxiName() {
        return xinxiName;
    }
    /**
	 * 设置：信息公开名称
	 */

    public void setXinxiName(String xinxiName) {
        this.xinxiName = xinxiName;
    }
    /**
	 * 获取：信息公开图片
	 */
    public String getXinxiPhoto() {
        return xinxiPhoto;
    }
    /**
	 * 设置：信息公开图片
	 */

    public void setXinxiPhoto(String xinxiPhoto) {
        this.xinxiPhoto = xinxiPhoto;
    }
    /**
	 * 获取：信息公开类型
	 */
    public Integer getXinxiTypes() {
        return xinxiTypes;
    }
    /**
	 * 设置：信息公开类型
	 */

    public void setXinxiTypes(Integer xinxiTypes) {
        this.xinxiTypes = xinxiTypes;
    }
    /**
	 * 获取：信息公开发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：信息公开发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：信息公开详情
	 */
    public String getXinxiContent() {
        return xinxiContent;
    }
    /**
	 * 设置：信息公开详情
	 */

    public void setXinxiContent(String xinxiContent) {
        this.xinxiContent = xinxiContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Xinxi{" +
            ", id=" + id +
            ", xinxiName=" + xinxiName +
            ", xinxiPhoto=" + xinxiPhoto +
            ", xinxiTypes=" + xinxiTypes +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", xinxiContent=" + xinxiContent +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
