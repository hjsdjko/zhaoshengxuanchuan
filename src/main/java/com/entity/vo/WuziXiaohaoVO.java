package com.entity.vo;

import com.entity.WuziXiaohaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 物资消耗
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("wuzi_xiaohao")
public class WuziXiaohaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 物资
     */

    @TableField(value = "wuzi_id")
    private Integer wuziId;


    /**
     * 招生人员
     */

    @TableField(value = "zhaoshengrenyuan_id")
    private Integer zhaoshengrenyuanId;


    /**
     * 物资消耗编号
     */

    @TableField(value = "wuzi_xiaohao_uuid_number")
    private String wuziXiaohaoUuidNumber;


    /**
     * 物资消耗标题
     */

    @TableField(value = "wuzi_xiaohao_name")
    private String wuziXiaohaoName;


    /**
     * 消耗地点
     */

    @TableField(value = "wuzi_xiaohao_address")
    private String wuziXiaohaoAddress;


    /**
     * 消耗时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "wuzi_xiaohao_time")
    private Date wuziXiaohaoTime;


    /**
     * 物资消耗类型
     */

    @TableField(value = "wuzi_xiaohao_types")
    private Integer wuziXiaohaoTypes;


    /**
     * 消耗数量
     */

    @TableField(value = "wuzi_xiaohao_kucun_number")
    private Integer wuziXiaohaoKucunNumber;


    /**
     * 消耗备注
     */

    @TableField(value = "wuzi_xiaohao_content")
    private String wuziXiaohaoContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
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
	 * 设置：物资
	 */
    public Integer getWuziId() {
        return wuziId;
    }


    /**
	 * 获取：物资
	 */

    public void setWuziId(Integer wuziId) {
        this.wuziId = wuziId;
    }
    /**
	 * 设置：招生人员
	 */
    public Integer getZhaoshengrenyuanId() {
        return zhaoshengrenyuanId;
    }


    /**
	 * 获取：招生人员
	 */

    public void setZhaoshengrenyuanId(Integer zhaoshengrenyuanId) {
        this.zhaoshengrenyuanId = zhaoshengrenyuanId;
    }
    /**
	 * 设置：物资消耗编号
	 */
    public String getWuziXiaohaoUuidNumber() {
        return wuziXiaohaoUuidNumber;
    }


    /**
	 * 获取：物资消耗编号
	 */

    public void setWuziXiaohaoUuidNumber(String wuziXiaohaoUuidNumber) {
        this.wuziXiaohaoUuidNumber = wuziXiaohaoUuidNumber;
    }
    /**
	 * 设置：物资消耗标题
	 */
    public String getWuziXiaohaoName() {
        return wuziXiaohaoName;
    }


    /**
	 * 获取：物资消耗标题
	 */

    public void setWuziXiaohaoName(String wuziXiaohaoName) {
        this.wuziXiaohaoName = wuziXiaohaoName;
    }
    /**
	 * 设置：消耗地点
	 */
    public String getWuziXiaohaoAddress() {
        return wuziXiaohaoAddress;
    }


    /**
	 * 获取：消耗地点
	 */

    public void setWuziXiaohaoAddress(String wuziXiaohaoAddress) {
        this.wuziXiaohaoAddress = wuziXiaohaoAddress;
    }
    /**
	 * 设置：消耗时间
	 */
    public Date getWuziXiaohaoTime() {
        return wuziXiaohaoTime;
    }


    /**
	 * 获取：消耗时间
	 */

    public void setWuziXiaohaoTime(Date wuziXiaohaoTime) {
        this.wuziXiaohaoTime = wuziXiaohaoTime;
    }
    /**
	 * 设置：物资消耗类型
	 */
    public Integer getWuziXiaohaoTypes() {
        return wuziXiaohaoTypes;
    }


    /**
	 * 获取：物资消耗类型
	 */

    public void setWuziXiaohaoTypes(Integer wuziXiaohaoTypes) {
        this.wuziXiaohaoTypes = wuziXiaohaoTypes;
    }
    /**
	 * 设置：消耗数量
	 */
    public Integer getWuziXiaohaoKucunNumber() {
        return wuziXiaohaoKucunNumber;
    }


    /**
	 * 获取：消耗数量
	 */

    public void setWuziXiaohaoKucunNumber(Integer wuziXiaohaoKucunNumber) {
        this.wuziXiaohaoKucunNumber = wuziXiaohaoKucunNumber;
    }
    /**
	 * 设置：消耗备注
	 */
    public String getWuziXiaohaoContent() {
        return wuziXiaohaoContent;
    }


    /**
	 * 获取：消耗备注
	 */

    public void setWuziXiaohaoContent(String wuziXiaohaoContent) {
        this.wuziXiaohaoContent = wuziXiaohaoContent;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
