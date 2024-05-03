package com.entity.vo;

import com.entity.ZhaoshengrenyuanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 招生人员
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zhaoshengrenyuan")
public class ZhaoshengrenyuanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 账户
     */

    @TableField(value = "username")
    private String username;


    /**
     * 密码
     */

    @TableField(value = "password")
    private String password;


    /**
     * 招生人员姓名
     */

    @TableField(value = "zhaoshengrenyuan_name")
    private String zhaoshengrenyuanName;


    /**
     * 招生人员手机号
     */

    @TableField(value = "zhaoshengrenyuan_phone")
    private String zhaoshengrenyuanPhone;


    /**
     * 招生人员身份证号
     */

    @TableField(value = "zhaoshengrenyuan_id_number")
    private String zhaoshengrenyuanIdNumber;


    /**
     * 招生人员头像
     */

    @TableField(value = "zhaoshengrenyuan_photo")
    private String zhaoshengrenyuanPhoto;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 招生人员邮箱
     */

    @TableField(value = "zhaoshengrenyuan_email")
    private String zhaoshengrenyuanEmail;


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
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：招生人员姓名
	 */
    public String getZhaoshengrenyuanName() {
        return zhaoshengrenyuanName;
    }


    /**
	 * 获取：招生人员姓名
	 */

    public void setZhaoshengrenyuanName(String zhaoshengrenyuanName) {
        this.zhaoshengrenyuanName = zhaoshengrenyuanName;
    }
    /**
	 * 设置：招生人员手机号
	 */
    public String getZhaoshengrenyuanPhone() {
        return zhaoshengrenyuanPhone;
    }


    /**
	 * 获取：招生人员手机号
	 */

    public void setZhaoshengrenyuanPhone(String zhaoshengrenyuanPhone) {
        this.zhaoshengrenyuanPhone = zhaoshengrenyuanPhone;
    }
    /**
	 * 设置：招生人员身份证号
	 */
    public String getZhaoshengrenyuanIdNumber() {
        return zhaoshengrenyuanIdNumber;
    }


    /**
	 * 获取：招生人员身份证号
	 */

    public void setZhaoshengrenyuanIdNumber(String zhaoshengrenyuanIdNumber) {
        this.zhaoshengrenyuanIdNumber = zhaoshengrenyuanIdNumber;
    }
    /**
	 * 设置：招生人员头像
	 */
    public String getZhaoshengrenyuanPhoto() {
        return zhaoshengrenyuanPhoto;
    }


    /**
	 * 获取：招生人员头像
	 */

    public void setZhaoshengrenyuanPhoto(String zhaoshengrenyuanPhoto) {
        this.zhaoshengrenyuanPhoto = zhaoshengrenyuanPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：招生人员邮箱
	 */
    public String getZhaoshengrenyuanEmail() {
        return zhaoshengrenyuanEmail;
    }


    /**
	 * 获取：招生人员邮箱
	 */

    public void setZhaoshengrenyuanEmail(String zhaoshengrenyuanEmail) {
        this.zhaoshengrenyuanEmail = zhaoshengrenyuanEmail;
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
