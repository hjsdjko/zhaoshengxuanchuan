package com.entity.vo;

import com.entity.ZixunjiluEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 咨询记录
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zixunjilu")
public class ZixunjiluVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 招生人员
     */

    @TableField(value = "zhaoshengrenyuan_id")
    private Integer zhaoshengrenyuanId;


    /**
     * 咨询记录编号
     */

    @TableField(value = "zixunjilu_uuid_number")
    private String zixunjiluUuidNumber;


    /**
     * 咨询方式
     */

    @TableField(value = "zixunjilu_fangshi_types")
    private Integer zixunjiluFangshiTypes;


    /**
     * 咨询重点
     */

    @TableField(value = "zixunjilu_zhongdian_types")
    private Integer zixunjiluZhongdianTypes;


    /**
     * 咨询时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "zixun_time")
    private Date zixunTime;


    /**
     * 附件
     */

    @TableField(value = "zixunjilu_file")
    private String zixunjiluFile;


    /**
     * 咨询记录备注
     */

    @TableField(value = "zixunjilu_content")
    private String zixunjiluContent;


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
	 * 设置：咨询记录编号
	 */
    public String getZixunjiluUuidNumber() {
        return zixunjiluUuidNumber;
    }


    /**
	 * 获取：咨询记录编号
	 */

    public void setZixunjiluUuidNumber(String zixunjiluUuidNumber) {
        this.zixunjiluUuidNumber = zixunjiluUuidNumber;
    }
    /**
	 * 设置：咨询方式
	 */
    public Integer getZixunjiluFangshiTypes() {
        return zixunjiluFangshiTypes;
    }


    /**
	 * 获取：咨询方式
	 */

    public void setZixunjiluFangshiTypes(Integer zixunjiluFangshiTypes) {
        this.zixunjiluFangshiTypes = zixunjiluFangshiTypes;
    }
    /**
	 * 设置：咨询重点
	 */
    public Integer getZixunjiluZhongdianTypes() {
        return zixunjiluZhongdianTypes;
    }


    /**
	 * 获取：咨询重点
	 */

    public void setZixunjiluZhongdianTypes(Integer zixunjiluZhongdianTypes) {
        this.zixunjiluZhongdianTypes = zixunjiluZhongdianTypes;
    }
    /**
	 * 设置：咨询时间
	 */
    public Date getZixunTime() {
        return zixunTime;
    }


    /**
	 * 获取：咨询时间
	 */

    public void setZixunTime(Date zixunTime) {
        this.zixunTime = zixunTime;
    }
    /**
	 * 设置：附件
	 */
    public String getZixunjiluFile() {
        return zixunjiluFile;
    }


    /**
	 * 获取：附件
	 */

    public void setZixunjiluFile(String zixunjiluFile) {
        this.zixunjiluFile = zixunjiluFile;
    }
    /**
	 * 设置：咨询记录备注
	 */
    public String getZixunjiluContent() {
        return zixunjiluContent;
    }


    /**
	 * 获取：咨询记录备注
	 */

    public void setZixunjiluContent(String zixunjiluContent) {
        this.zixunjiluContent = zixunjiluContent;
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
