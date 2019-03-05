package com.jw.bean;

import com.jw.Utils.UUIDUtils;

/**
 * user用户类，映射数据库paynote_user表
 * 遵循驼峰变量命名规则
 */
public class User {
    //主键 uuid
    private String userId;
    //用户帐号
    private String userNumber;
    //用户密码
    private String userPassword;
    //用户名
    private String userUsername;
    //用户状态
    private String userStatus;
    //用户注册时间(mysql自动生成函数)
    private String userRegistereDate;

    User(){
        userId= UUIDUtils.getUUID();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserRegistereDate() {
        return userRegistereDate;
    }

    public void setUserRegistereDate(String userRegistereDate) {
        this.userRegistereDate = userRegistereDate;
    }
}
