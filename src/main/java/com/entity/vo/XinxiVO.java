package com.entity.vo;

import com.entity.XinxiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 信息公开
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xinxi")
public class XinxiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 信息公开名称
     */

    @TableField(value = "xinxi_name")
    private String xinxiName;


    /**
     * 信息公开图片
     */

    @TableField(value = "xinxi_photo")
    private String xinxiPhoto;


    /**
     * 信息公开类型
     */

    @TableField(value = "xinxi_types")
    private Integer xinxiTypes;


    /**
     * 信息公开发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 信息公开详情
     */

    @TableField(value = "xinxi_content")
    private String xinxiContent;


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
	 * 设置：信息公开名称
	 */
    public String getXinxiName() {
        return xinxiName;
    }


    /**
	 * 获取：信息公开名称
	 */

    public void setXinxiName(String xinxiName) {
        this.xinxiName = xinxiName;
    }
    /**
	 * 设置：信息公开图片
	 */
    public String getXinxiPhoto() {
        return xinxiPhoto;
    }


    /**
	 * 获取：信息公开图片
	 */

    public void setXinxiPhoto(String xinxiPhoto) {
        this.xinxiPhoto = xinxiPhoto;
    }
    /**
	 * 设置：信息公开类型
	 */
    public Integer getXinxiTypes() {
        return xinxiTypes;
    }


    /**
	 * 获取：信息公开类型
	 */

    public void setXinxiTypes(Integer xinxiTypes) {
        this.xinxiTypes = xinxiTypes;
    }
    /**
	 * 设置：信息公开发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：信息公开发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：信息公开详情
	 */
    public String getXinxiContent() {
        return xinxiContent;
    }


    /**
	 * 获取：信息公开详情
	 */

    public void setXinxiContent(String xinxiContent) {
        this.xinxiContent = xinxiContent;
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
