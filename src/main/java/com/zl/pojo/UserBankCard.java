package com.zl.pojo;

import java.io.Serializable;

public class UserBankCard implements Serializable{
	
  
	private static final long serialVersionUID = -487506678304535345L;

	private Integer cardId;

    private Integer userId;

    private String cardType;

    private String a2;

    private String a3;

    private String a4;

    private String a5;

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getcardType() {
        return cardType;
    }

    public void setcardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
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