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
 * 招生人员
 *
 * @author 
 * @email
 */
@TableName("zhaoshengrenyuan")
public class ZhaoshengrenyuanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZhaoshengrenyuanEntity() {

	}

	public ZhaoshengrenyuanEntity(T t) {
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
     * 账户
     */
    @ColumnInfo(comment="账户",type="varchar(200)")
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @ColumnInfo(comment="密码",type="varchar(200)")
    @TableField(value = "password")

    private String password;


    /**
     * 招生人员姓名
     */
    @ColumnInfo(comment="招生人员姓名",type="varchar(200)")
    @TableField(value = "zhaoshengrenyuan_name")

    private String zhaoshengrenyuanName;


    /**
     * 招生人员手机号
     */
    @ColumnInfo(comment="招生人员手机号",type="varchar(200)")
    @TableField(value = "zhaoshengrenyuan_phone")

    private String zhaoshengrenyuanPhone;


    /**
     * 招生人员身份证号
     */
    @ColumnInfo(comment="招生人员身份证号",type="varchar(200)")
    @TableField(value = "zhaoshengrenyuan_id_number")

    private String zhaoshengrenyuanIdNumber;


    /**
     * 招生人员头像
     */
    @ColumnInfo(comment="招生人员头像",type="varchar(200)")
    @TableField(value = "zhaoshengrenyuan_photo")

    private String zhaoshengrenyuanPhoto;


    /**
     * 性别
     */
    @ColumnInfo(comment="性别",type="int(11)")
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 招生人员邮箱
     */
    @ColumnInfo(comment="招生人员邮箱",type="varchar(200)")
    @TableField(value = "zhaoshengrenyuan_email")

    private String zhaoshengrenyuanEmail;


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
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }
    /**
	 * 设置：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }
    /**
	 * 设置：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：招生人员姓名
	 */
    public String getZhaoshengrenyuanName() {
        return zhaoshengrenyuanName;
    }
    /**
	 * 设置：招生人员姓名
	 */

    public void setZhaoshengrenyuanName(String zhaoshengrenyuanName) {
        this.zhaoshengrenyuanName = zhaoshengrenyuanName;
    }
    /**
	 * 获取：招生人员手机号
	 */
    public String getZhaoshengrenyuanPhone() {
        return zhaoshengrenyuanPhone;
    }
    /**
	 * 设置：招生人员手机号
	 */

    public void setZhaoshengrenyuanPhone(String zhaoshengrenyuanPhone) {
        this.zhaoshengrenyuanPhone = zhaoshengrenyuanPhone;
    }
    /**
	 * 获取：招生人员身份证号
	 */
    public String getZhaoshengrenyuanIdNumber() {
        return zhaoshengrenyuanIdNumber;
    }
    /**
	 * 设置：招生人员身份证号
	 */

    public void setZhaoshengrenyuanIdNumber(String zhaoshengrenyuanIdNumber) {
        this.zhaoshengrenyuanIdNumber = zhaoshengrenyuanIdNumber;
    }
    /**
	 * 获取：招生人员头像
	 */
    public String getZhaoshengrenyuanPhoto() {
        return zhaoshengrenyuanPhoto;
    }
    /**
	 * 设置：招生人员头像
	 */

    public void setZhaoshengrenyuanPhoto(String zhaoshengrenyuanPhoto) {
        this.zhaoshengrenyuanPhoto = zhaoshengrenyuanPhoto;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }
    /**
	 * 设置：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：招生人员邮箱
	 */
    public String getZhaoshengrenyuanEmail() {
        return zhaoshengrenyuanEmail;
    }
    /**
	 * 设置：招生人员邮箱
	 */

    public void setZhaoshengrenyuanEmail(String zhaoshengrenyuanEmail) {
        this.zhaoshengrenyuanEmail = zhaoshengrenyuanEmail;
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
        return "Zhaoshengrenyuan{" +
            ", id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", zhaoshengrenyuanName=" + zhaoshengrenyuanName +
            ", zhaoshengrenyuanPhone=" + zhaoshengrenyuanPhone +
            ", zhaoshengrenyuanIdNumber=" + zhaoshengrenyuanIdNumber +
            ", zhaoshengrenyuanPhoto=" + zhaoshengrenyuanPhoto +
            ", sexTypes=" + sexTypes +
            ", zhaoshengrenyuanEmail=" + zhaoshengrenyuanEmail +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
