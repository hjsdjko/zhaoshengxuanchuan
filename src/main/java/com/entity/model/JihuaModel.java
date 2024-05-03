package com.entity.model;

import com.entity.JihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 招生计划
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JihuaModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 计划标题
     */
    private String jihuaName;


    /**
     * 计划图片
     */
    private String jihuaPhoto;


    /**
     * 计划类型
     */
    private Integer jihuaTypes;


    /**
     * 计划发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 计划详情
     */
    private String jihuaContent;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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
	 * 获取：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
