package com.entity.model;

import com.entity.ZhaoshengrenyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 招生人员
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZhaoshengrenyuanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 招生人员姓名
     */
    private String zhaoshengrenyuanName;


    /**
     * 招生人员手机号
     */
    private String zhaoshengrenyuanPhone;


    /**
     * 招生人员身份证号
     */
    private String zhaoshengrenyuanIdNumber;


    /**
     * 招生人员头像
     */
    private String zhaoshengrenyuanPhoto;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 招生人员邮箱
     */
    private String zhaoshengrenyuanEmail;


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

    }
