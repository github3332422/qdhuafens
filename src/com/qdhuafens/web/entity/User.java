package com.qdhuafens.web.entity;

/**
 * @program: Huafens
 * @description: 用户实体类
 * @author: 张清
 * @create: 2019-06-24 08:40
 **/
public class User {
    /**
     * 用户id号 和发帖链接关联
     * */
    private Integer userId;

    /**
     * 用户名
     * */
    private String userName;

    /**
     * 用户密码
     * */
    private String password;

    /**
     * 用户电话
     * */
    private String userPhone;

    /**
     * 用户QQ
     * */
    private String userQq;

    /**
     * 用户邮箱
     * */
    private String userMail;

    /**
     * 用户职位
     * */
    private String position;

    /**
     * 用户所属部门 数据库中存储的是部门号的id值
     * */
    private Depart depart;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserQq() {
        return userQq;
    }

    public void setUserQq(String userQq) {
        this.userQq = userQq;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Depart getDepart() {
        return depart;
    }

    public void setDepart(Depart depart) {
        this.depart = depart;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userQq='" + userQq + '\'' +
                ", userMail='" + userMail + '\'' +
                ", position='" + position + '\'' +
                ", depart=" + depart +
                '}';
    }
}
