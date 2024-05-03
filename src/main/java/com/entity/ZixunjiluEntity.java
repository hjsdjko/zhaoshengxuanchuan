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
 * 咨询记录
 *
 * @author 
 * @email
 */
@TableName("zixunjilu")
public class ZixunjiluEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZixunjiluEntity() {

	}

	public ZixunjiluEntity(T t) {
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
     * 招生人员
     */
    @ColumnInfo(comment="招生人员",type="int(11)")
    @TableField(value = "zhaoshengrenyuan_id")

    private Integer zhaoshengrenyuanId;


    /**
     * 咨询记录编号
     */
    @ColumnInfo(comment="咨询记录编号",type="varchar(200)")
    @TableField(value = "zixunjilu_uuid_number")

    private String zixunjiluUuidNumber;


    /**
     * 咨询方式
     */
    @ColumnInfo(comment="咨询方式",type="int(11)")
    @TableField(value = "zixunjilu_fangshi_types")

    private Integer zixunjiluFangshiTypes;


    /**
     * 咨询重点
     */
    @ColumnInfo(comment="咨询重点",type="int(11)")
    @TableField(value = "zixunjilu_zhongdian_types")

    private Integer zixunjiluZhongdianTypes;


    /**
     * 咨询时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="咨询时间",type="timestamp")
    @TableField(value = "zixun_time")

    private Date zixunTime;


    /**
     * 附件
     */
    @ColumnInfo(comment="附件",type="varchar(200)")
    @TableField(value = "zixunjilu_file")

    private String zixunjiluFile;


    /**
     * 咨询记录备注
     */
    @ColumnInfo(comment="咨询记录备注",type="longtext")
    @TableField(value = "zixunjilu_content")

    private String zixunjiluContent;


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

    @Override
    public String toString() {
        return "Zixunjilu{" +
            ", id=" + id +
            ", zhaoshengrenyuanId=" + zhaoshengrenyuanId +
            ", zixunjiluUuidNumber=" + zixunjiluUuidNumber +
            ", zixunjiluFangshiTypes=" + zixunjiluFangshiTypes +
            ", zixunjiluZhongdianTypes=" + zixunjiluZhongdianTypes +
            ", zixunTime=" + DateUtil.convertString(zixunTime,"yyyy-MM-dd") +
            ", zixunjiluFile=" + zixunjiluFile +
            ", zixunjiluContent=" + zixunjiluContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
