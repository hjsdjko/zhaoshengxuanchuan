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
 * 物资消耗
 *
 * @author 
 * @email
 */
@TableName("wuzi_xiaohao")
public class WuziXiaohaoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public WuziXiaohaoEntity() {

	}

	public WuziXiaohaoEntity(T t) {
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
     * 物资
     */
    @ColumnInfo(comment="物资",type="int(11)")
    @TableField(value = "wuzi_id")

    private Integer wuziId;


    /**
     * 招生人员
     */
    @ColumnInfo(comment="招生人员",type="int(11)")
    @TableField(value = "zhaoshengrenyuan_id")

    private Integer zhaoshengrenyuanId;


    /**
     * 物资消耗编号
     */
    @ColumnInfo(comment="物资消耗编号",type="varchar(200)")
    @TableField(value = "wuzi_xiaohao_uuid_number")

    private String wuziXiaohaoUuidNumber;


    /**
     * 物资消耗标题
     */
    @ColumnInfo(comment="物资消耗标题",type="varchar(200)")
    @TableField(value = "wuzi_xiaohao_name")

    private String wuziXiaohaoName;


    /**
     * 消耗地点
     */
    @ColumnInfo(comment="消耗地点",type="varchar(200)")
    @TableField(value = "wuzi_xiaohao_address")

    private String wuziXiaohaoAddress;


    /**
     * 消耗时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="消耗时间",type="timestamp")
    @TableField(value = "wuzi_xiaohao_time")

    private Date wuziXiaohaoTime;


    /**
     * 物资消耗类型
     */
    @ColumnInfo(comment="物资消耗类型",type="int(11)")
    @TableField(value = "wuzi_xiaohao_types")

    private Integer wuziXiaohaoTypes;


    /**
     * 消耗数量
     */
    @ColumnInfo(comment="消耗数量",type="int(11)")
    @TableField(value = "wuzi_xiaohao_kucun_number")

    private Integer wuziXiaohaoKucunNumber;


    /**
     * 消耗备注
     */
    @ColumnInfo(comment="消耗备注",type="longtext")
    @TableField(value = "wuzi_xiaohao_content")

    private String wuziXiaohaoContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


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

    @Override
    public String toString() {
        return "WuziXiaohao{" +
            ", id=" + id +
            ", wuziId=" + wuziId +
            ", zhaoshengrenyuanId=" + zhaoshengrenyuanId +
            ", wuziXiaohaoUuidNumber=" + wuziXiaohaoUuidNumber +
            ", wuziXiaohaoName=" + wuziXiaohaoName +
            ", wuziXiaohaoAddress=" + wuziXiaohaoAddress +
            ", wuziXiaohaoTime=" + DateUtil.convertString(wuziXiaohaoTime,"yyyy-MM-dd") +
            ", wuziXiaohaoTypes=" + wuziXiaohaoTypes +
            ", wuziXiaohaoKucunNumber=" + wuziXiaohaoKucunNumber +
            ", wuziXiaohaoContent=" + wuziXiaohaoContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
