package com.example.demo.entity;

import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;

@Mapper
public class DpdouyUserEntity implements Serializable {

    private String userId;
    private String userName;
    private String userSex;
    private int userAge;
    private String userPassword;
    private String userTel;

    @Override
    public String toString() {
        return "DpdouyUserEntity{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userAge=" + userAge +
                ", userPassword='" + userPassword + '\'' +
                ", userTel='" + userTel + '\'' +
                '}';
    }

    public DpdouyUserEntity(String userId, String userName, String userSex, int userAge, String userPassword, String userTel) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.userAge = userAge;
        this.userPassword = userPassword;
        this.userTel = userTel;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }
}
