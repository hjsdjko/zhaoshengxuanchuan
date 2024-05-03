package com.entity.model;

import com.entity.XinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 信息公开
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XinxiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 信息公开名称
     */
    private String xinxiName;


    /**
     * 信息公开图片
     */
    private String xinxiPhoto;


    /**
     * 信息公开类型
     */
    private Integer xinxiTypes;


    /**
     * 信息公开发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 信息公开详情
     */
    private String xinxiContent;


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
