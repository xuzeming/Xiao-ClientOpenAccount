package com.zl.pojo;

import java.io.Serializable;

public class BankCard implements Serializable{
 
	private static final long serialVersionUID = -2737676248370728702L;

	private Integer cardId;

    private String cardNum;

    private String cardPwd;

    private String cardType;

    private Double cardBalance;

    private String cardOwner;

    private String cardTel;

    private String a1;

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

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum == null ? null : cardNum.trim();
    }

    public String getCardPwd() {
        return cardPwd;
    }

    public void setCardPwd(String cardPwd) {
        this.cardPwd = cardPwd == null ? null : cardPwd.trim();
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    public Double getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(Double cardBalance) {
        this.cardBalance = cardBalance;
    }

    public String getCardOwner() {
        return cardOwner;
    }

    public void setCardOwner(String cardOwner) {
        this.cardOwner = cardOwner == null ? null : cardOwner.trim();
    }

    public String getCardTel() {
        return cardTel;
    }

    public void setCardTel(String cardTel) {
        this.cardTel = cardTel == null ? null : cardTel.trim();
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
		return "BankCard [cardId=" + cardId + ", cardNum=" + cardNum + ", cardPwd=" + cardPwd + ", cardType=" + cardType
				+ ", cardBalance=" + cardBalance + ", cardOwner=" + cardOwner + ", cardTel=" + cardTel + ", a1=" + a1
				+ ", a2=" + a2 + ", a3=" + a3 + ", a4=" + a4 + ", a5=" + a5 + "]";
	}
    
}