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
 * 招生计划
 *
 * @author 
 * @email
 */
@TableName("jihua")
public class JihuaEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JihuaEntity() {

	}

	public JihuaEntity(T t) {
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
     * 计划标题
     */
    @ColumnInfo(comment="计划标题",type="varchar(200)")
    @TableField(value = "jihua_name")

    private String jihuaName;


    /**
     * 计划图片
     */
    @ColumnInfo(comment="计划图片",type="varchar(200)")
    @TableField(value = "jihua_photo")

    private String jihuaPhoto;


    /**
     * 计划类型
     */
    @ColumnInfo(comment="计划类型",type="int(11)")
    @TableField(value = "jihua_types")

    private Integer jihuaTypes;


    /**
     * 计划发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="计划发布时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 计划详情
     */
    @ColumnInfo(comment="计划详情",type="longtext")
    @TableField(value = "jihua_content")

    private String jihuaContent;


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
	 * 获取：计划标题
	 */
    public String getJihuaName() {
        return jihuaName;
    }
    /**
	 * 设置：计划标题
	 */

    public void setJihuaName(String jihuaName) {
        this.jihuaName = jihuaName;
    }
    /**
	 * 获取：计划图片
	 */
    public String getJihuaPhoto() {
        return jihuaPhoto;
    }
    /**
	 * 设置：计划图片
	 */

    public void setJihuaPhoto(String jihuaPhoto) {
        this.jihuaPhoto = jihuaPhoto;
    }
    /**
	 * 获取：计划类型
	 */
    public Integer getJihuaTypes() {
        return jihuaTypes;
    }
    /**
	 * 设置：计划类型
	 */

    public void setJihuaTypes(Integer jihuaTypes) {
        this.jihuaTypes = jihuaTypes;
    }
    /**
	 * 获取：计划发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：计划发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：计划详情
	 */
    public String getJihuaContent() {
        return jihuaContent;
    }
    /**
	 * 设置：计划详情
	 */

    public void setJihuaContent(String jihuaContent) {
        this.jihuaContent = jihuaContent;
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
        return "Jihua{" +
            ", id=" + id +
            ", jihuaName=" + jihuaName +
            ", jihuaPhoto=" + jihuaPhoto +
            ", jihuaTypes=" + jihuaTypes +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", jihuaContent=" + jihuaContent +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
