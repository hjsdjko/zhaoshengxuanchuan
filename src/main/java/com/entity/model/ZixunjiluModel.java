package com.entity.model;

import com.entity.ZixunjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 咨询记录
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZixunjiluModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 招生人员
     */
    private Integer zhaoshengrenyuanId;


    /**
     * 咨询记录编号
     */
    private String zixunjiluUuidNumber;


    /**
     * 咨询方式
     */
    private Integer zixunjiluFangshiTypes;


    /**
     * 咨询重点
     */
    private Integer zixunjiluZhongdianTypes;


    /**
     * 咨询时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date zixunTime;


    /**
     * 附件
     */
    private String zixunjiluFile;


    /**
     * 咨询记录备注
     */
    private String zixunjiluContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
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
	 * 获取：招生人员
	 */
    public Integer getZhaoshengrenyuanId() {
        return zhaoshengrenyuanId;
    }


    /**
	 * 设置：招生人员
	 */
    public void setZhaoshengrenyuanId(Integer zhaoshengrenyuanId) {
        this.zhaoshengrenyuanId = zhaoshengrenyuanId;
    }
    /**
	 * 获取：咨询记录编号
	 */
    public String getZixunjiluUuidNumber() {
        return zixunjiluUuidNumber;
    }


    /**
	 * 设置：咨询记录编号
	 */
    public void setZixunjiluUuidNumber(String zixunjiluUuidNumber) {
        this.zixunjiluUuidNumber = zixunjiluUuidNumber;
    }
    /**
	 * 获取：咨询方式
	 */
    public Integer getZixunjiluFangshiTypes() {
        return zixunjiluFangshiTypes;
    }


    /**
	 * 设置：咨询方式
	 */
    public void setZixunjiluFangshiTypes(Integer zixunjiluFangshiTypes) {
        this.zixunjiluFangshiTypes = zixunjiluFangshiTypes;
    }
    /**
	 * 获取：咨询重点
	 */
    public Integer getZixunjiluZhongdianTypes() {
        return zixunjiluZhongdianTypes;
    }


    /**
	 * 设置：咨询重点
	 */
    public void setZixunjiluZhongdianTypes(Integer zixunjiluZhongdianTypes) {
        this.zixunjiluZhongdianTypes = zixunjiluZhongdianTypes;
    }
    /**
	 * 获取：咨询时间
	 */
    public Date getZixunTime() {
        return zixunTime;
    }


    /**
	 * 设置：咨询时间
	 */
    public void setZixunTime(Date zixunTime) {
        this.zixunTime = zixunTime;
    }
    /**
	 * 获取：附件
	 */
    public String getZixunjiluFile() {
        return zixunjiluFile;
    }


    /**
	 * 设置：附件
	 */
    public void setZixunjiluFile(String zixunjiluFile) {
        this.zixunjiluFile = zixunjiluFile;
    }
    /**
	 * 获取：咨询记录备注
	 */
    public String getZixunjiluContent() {
        return zixunjiluContent;
    }


    /**
	 * 设置：咨询记录备注
	 */
    public void setZixunjiluContent(String zixunjiluContent) {
        this.zixunjiluContent = zixunjiluContent;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：录入时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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

    }
