package com.zl.pojo;

import java.io.Serializable;

public class ShStockAccount implements Serializable{
	private static final long serialVersionUID = -6453961106507486233L;

	private Integer shAccountNum;

    private Integer userId;

    private String identificationId;

    private String tel;

    private Integer accountId;

    private Integer comId;

    private String a1;

    private String a2;

    private String a3;

    private String a4;

    private String a5;

    public Integer getShAccountNum() {
        return shAccountNum;
    }

    public void setShAccountNum(Integer shAccountNum) {
        this.shAccountNum = shAccountNum;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getIdentificationId() {
        return identificationId;
    }

    public void setIdentificationId(String identificationId) {
        this.identificationId = identificationId == null ? null : identificationId.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
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
}