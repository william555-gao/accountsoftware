package com.shanxi.lvliang.commodity.account.entity.dataobj;

import java.io.Serializable;
import java.util.Date;

public class UserInfoDO implements Serializable {
    private Long pkUserId;

    private String userNameCn;

    private String userNameEn;

    private String userLoginPhone;

    private String userLoginEimal;

    private String userLoginPassword;

    private String userType;

    private String userStatus;

    private Date userCreate;

    private Date userModified;

    private static final long serialVersionUID = 1L;

    public Long getPkUserId() {
        return pkUserId;
    }

    public void setPkUserId(Long pkUserId) {
        this.pkUserId = pkUserId;
    }

    public String getUserNameCn() {
        return userNameCn;
    }

    public void setUserNameCn(String userNameCn) {
        this.userNameCn = userNameCn == null ? null : userNameCn.trim();
    }

    public String getUserNameEn() {
        return userNameEn;
    }

    public void setUserNameEn(String userNameEn) {
        this.userNameEn = userNameEn == null ? null : userNameEn.trim();
    }

    public String getUserLoginPhone() {
        return userLoginPhone;
    }

    public void setUserLoginPhone(String userLoginPhone) {
        this.userLoginPhone = userLoginPhone == null ? null : userLoginPhone.trim();
    }

    public String getUserLoginEimal() {
        return userLoginEimal;
    }

    public void setUserLoginEimal(String userLoginEimal) {
        this.userLoginEimal = userLoginEimal == null ? null : userLoginEimal.trim();
    }

    public String getUserLoginPassword() {
        return userLoginPassword;
    }

    public void setUserLoginPassword(String userLoginPassword) {
        this.userLoginPassword = userLoginPassword == null ? null : userLoginPassword.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public Date getUserCreate() {
        return userCreate;
    }

    public void setUserCreate(Date userCreate) {
        this.userCreate = userCreate;
    }

    public Date getUserModified() {
        return userModified;
    }

    public void setUserModified(Date userModified) {
        this.userModified = userModified;
    }
}