package com.entity.model;

import com.entity.WuziXiaohaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 物资消耗
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class WuziXiaohaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 物资
     */
    private Integer wuziId;


    /**
     * 招生人员
     */
    private Integer zhaoshengrenyuanId;


    /**
     * 物资消耗编号
     */
    private String wuziXiaohaoUuidNumber;


    /**
     * 物资消耗标题
     */
    private String wuziXiaohaoName;


    /**
     * 消耗地点
     */
    private String wuziXiaohaoAddress;


    /**
     * 消耗时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date wuziXiaohaoTime;


    /**
     * 物资消耗类型
     */
    private Integer wuziXiaohaoTypes;


    /**
     * 消耗数量
     */
    private Integer wuziXiaohaoKucunNumber;


    /**
     * 消耗备注
     */
    private String wuziXiaohaoContent;


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
	 * 获取：物资
	 */
    public Integer getWuziId() {
        return wuziId;
    }


    /**
	 * 设置：物资
	 */
    public void setWuziId(Integer wuziId) {
        this.wuziId = wuziId;
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
	 * 获取：物资消耗编号
	 */
    public String getWuziXiaohaoUuidNumber() {
        return wuziXiaohaoUuidNumber;
    }


    /**
	 * 设置：物资消耗编号
	 */
    public void setWuziXiaohaoUuidNumber(String wuziXiaohaoUuidNumber) {
        this.wuziXiaohaoUuidNumber = wuziXiaohaoUuidNumber;
    }
    /**
	 * 获取：物资消耗标题
	 */
    public String getWuziXiaohaoName() {
        return wuziXiaohaoName;
    }


    /**
	 * 设置：物资消耗标题
	 */
    public void setWuziXiaohaoName(String wuziXiaohaoName) {
        this.wuziXiaohaoName = wuziXiaohaoName;
    }
    /**
	 * 获取：消耗地点
	 */
    public String getWuziXiaohaoAddress() {
        return wuziXiaohaoAddress;
    }


    /**
	 * 设置：消耗地点
	 */
    public void setWuziXiaohaoAddress(String wuziXiaohaoAddress) {
        this.wuziXiaohaoAddress = wuziXiaohaoAddress;
    }
    /**
	 * 获取：消耗时间
	 */
    public Date getWuziXiaohaoTime() {
        return wuziXiaohaoTime;
    }


    /**
	 * 设置：消耗时间
	 */
    public void setWuziXiaohaoTime(Date wuziXiaohaoTime) {
        this.wuziXiaohaoTime = wuziXiaohaoTime;
    }
    /**
	 * 获取：物资消耗类型
	 */
    public Integer getWuziXiaohaoTypes() {
        return wuziXiaohaoTypes;
    }


    /**
	 * 设置：物资消耗类型
	 */
    public void setWuziXiaohaoTypes(Integer wuziXiaohaoTypes) {
        this.wuziXiaohaoTypes = wuziXiaohaoTypes;
    }
    /**
	 * 获取：消耗数量
	 */
    public Integer getWuziXiaohaoKucunNumber() {
        return wuziXiaohaoKucunNumber;
    }


    /**
	 * 设置：消耗数量
	 */
    public void setWuziXiaohaoKucunNumber(Integer wuziXiaohaoKucunNumber) {
        this.wuziXiaohaoKucunNumber = wuziXiaohaoKucunNumber;
    }
    /**
	 * 获取：消耗备注
	 */
    public String getWuziXiaohaoContent() {
        return wuziXiaohaoContent;
    }


    /**
	 * 设置：消耗备注
	 */
    public void setWuziXiaohaoContent(String wuziXiaohaoContent) {
        this.wuziXiaohaoContent = wuziXiaohaoContent;
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
