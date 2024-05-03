package com.entity.vo;

import com.entity.JihuaEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 招生计划
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jihua")
public class JihuaVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 计划标题
     */

    @TableField(value = "jihua_name")
    private String jihuaName;


    /**
     * 计划图片
     */

    @TableField(value = "jihua_photo")
    private String jihuaPhoto;


    /**
     * 计划类型
     */

    @TableField(value = "jihua_types")
    private Integer jihuaTypes;


    /**
     * 计划发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 计划详情
     */

    @TableField(value = "jihua_content")
    private String jihuaContent;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：计划标题
	 */
    public String getJihuaName() {
        return jihuaName;
    }


    /**
	 * 获取：计划标题
	 */

    public void setJihuaName(String jihuaName) {
        this.jihuaName = jihuaName;
    }
    /**
	 * 设置：计划图片
	 */
    public String getJihuaPhoto() {
        return jihuaPhoto;
    }


    /**
	 * 获取：计划图片
	 */

    public void setJihuaPhoto(String jihuaPhoto) {
        this.jihuaPhoto = jihuaPhoto;
    }
    /**
	 * 设置：计划类型
	 */
    public Integer getJihuaTypes() {
        return jihuaTypes;
    }


    /**
	 * 获取：计划类型
	 */

    public void setJihuaTypes(Integer jihuaTypes) {
        this.jihuaTypes = jihuaTypes;
    }
    /**
	 * 设置：计划发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：计划发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：计划详情
	 */
    public String getJihuaContent() {
        return jihuaContent;
    }


    /**
	 * 获取：计划详情
	 */

    public void setJihuaContent(String jihuaContent) {
        this.jihuaContent = jihuaContent;
    }
    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
