package com.zl.pojo;

import java.io.Serializable;


import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class UserIdentification implements Serializable{

	private static final long serialVersionUID = 4447660556289282073L;

	private String identificationId;

    private Integer userId;

    private String userName;

    private String userSex;

    private String userNation;

    private String userAddress;

    private String signAgency;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date startTime;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date endTime;

    private String frontImg;

    private String backImg;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date userBirthday;

    private String a2;

    private String a3;

    private String a4;

    private String a5;

    public String getIdentificationId() {
        return identificationId;
    }

    public void setIdentificationId(String identificationId) {
        this.identificationId = identificationId == null ? null : identificationId.trim();
    }

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
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public String getUserNation() {
        return userNation;
    }

    public void setUserNation(String userNation) {
        this.userNation = userNation == null ? null : userNation.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public String getSignAgency() {
        return signAgency;
    }

    public void setSignAgency(String signAgency) {
        this.signAgency = signAgency == null ? null : signAgency.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getFrontImg() {
        return frontImg;
    }

    public void setFrontImg(String frontImg) {
        this.frontImg = frontImg == null ? null : frontImg.trim();
    }

    public String getBackImg() {
        return backImg;
    }

    public void setBackImg(String backImg) {
        this.backImg = backImg == null ? null : backImg.trim();
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday ;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2 == null ? null : a2.trim();
    }

    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        this.a3 = a3 == null ? null : a3.trim();
    }

    public String getA4() {
        return a4;
    }

    public void setA4(String a4) {
        this.a4 = a4 == null ? null : a4.trim();
    }

    public String getA5() {
        return a5;
    }

    public void setA5(String a5) {
        this.a5 = a5 == null ? null : a5.trim();
    }

	@Override
	public String toString() {
		return "UserIdentification [identificationId=" + identificationId + ", userId=" + userId + ", userName="
				+ userName + ", userSex=" + userSex + ", userNation=" + userNation + ", userAddress=" + userAddress
				+ ", signAgency=" + signAgency + ", startTime=" + startTime + ", endTime=" + endTime + ", frontImg="
				+ frontImg + ", backImg=" + backImg + ", userBirthday=" + userBirthday + ", a2=" + a2 + ", a3=" + a3 + ", a4=" + a4
				+ ", a5=" + a5 + "]";
	}
    
}