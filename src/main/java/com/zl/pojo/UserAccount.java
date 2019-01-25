package com.zl.pojo;

import java.io.Serializable;
import java.util.Date;

public class UserAccount implements Serializable{
 
	private static final long serialVersionUID = 9005473056358079875L;

	private Integer accountId;

    private Integer userId;

    private Integer accountNum;

    private Double accountBalance;

    private Date accountOpenTime;

    private String transationPwd;

    private String capitalPwd;

    private Integer orgId;

    private Integer shAccountNum;

    private Integer szAccountNum;

    private String a1;

    private String a2;

    private String a3;

    private String a4;

    private String a5;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(Integer accountNum) {
        this.accountNum = accountNum;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Date getAccountOpenTime() {
        return accountOpenTime;
    }

    public void setAccountOpenTime(Date accountOpenTime) {
        this.accountOpenTime = accountOpenTime;
    }

    public String getTransationPwd() {
        return transationPwd;
    }

    public void setTransationPwd(String transationPwd) {
        this.transationPwd = transationPwd == null ? null : transationPwd.trim();
    }

    public String getCapitalPwd() {
        return capitalPwd;
    }

    public void setCapitalPwd(String capitalPwd) {
        this.capitalPwd = capitalPwd == null ? null : capitalPwd.trim();
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Integer getShAccountNum() {
        return shAccountNum;
    }

    public void setShAccountNum(Integer shAccountNum) {
        this.shAccountNum = shAccountNum;
    }

    public Integer getSzAccountNum() {
        return szAccountNum;
    }

    public void setSzAccountNum(Integer szAccountNum) {
        this.szAccountNum = szAccountNum;
    }

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1 == null ? null : a1.trim();
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
		return "UserAccount [accountId=" + accountId + ", userId=" + userId + ", accountNum=" + accountNum
				+ ", accountBalance=" + accountBalance + ", accountOpenTime=" + accountOpenTime + ", transationPwd="
				+ transationPwd + ", capitalPwd=" + capitalPwd + ", orgId=" + orgId + ", shAccountNum=" + shAccountNum
				+ ", szAccountNum=" + szAccountNum + ", a1=" + a1 + ", a2=" + a2 + ", a3=" + a3 + ", a4=" + a4 + ", a5="
				+ a5 + "]";
	}
    
    
}