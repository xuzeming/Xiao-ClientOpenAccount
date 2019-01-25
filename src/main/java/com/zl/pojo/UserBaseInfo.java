package com.zl.pojo;

public class UserBaseInfo {
    private Integer baseId;

    private Integer userId;

    private String userIndustry;

    private String userProfession;

    private String accountBeneficiary;

    private String accountController;

    private String badRecord;

    private String taxStatus;

    private String viewName;

    private String telNum;

    private Integer riskScore;

    private String contactAddress;

    private Integer zipCode;

    private String userEducation;

    private String a2;

    private String a3;

    private String a4;

    private String a5;

    public Integer getBaseId() {
        return baseId;
    }

    public void setBaseId(Integer baseId) {
        this.baseId = baseId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserIndustry() {
        return userIndustry;
    }

    public void setUserIndustry(String userIndustry) {
        this.userIndustry = userIndustry == null ? null : userIndustry.trim();
    }

    public String getUserProfession() {
        return userProfession;
    }

    public void setUserProfession(String userProfession) {
        this.userProfession = userProfession == null ? null : userProfession.trim();
    }

    public String getAccountBeneficiary() {
        return accountBeneficiary;
    }

    public void setAccountBeneficiary(String accountBeneficiary) {
        this.accountBeneficiary = accountBeneficiary == null ? null : accountBeneficiary.trim();
    }

    public String getAccountController() {
        return accountController;
    }

    public void setAccountController(String accountController) {
        this.accountController = accountController == null ? null : accountController.trim();
    }

    public String getBadRecord() {
        return badRecord;
    }

    public void setBadRecord(String badRecord) {
        this.badRecord = badRecord == null ? null : badRecord.trim();
    }

    public String getTaxStatus() {
        return taxStatus;
    }

    public void setTaxStatus(String taxStatus) {
        this.taxStatus = taxStatus == null ? null : taxStatus.trim();
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName == null ? null : viewName.trim();
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum == null ? null : telNum.trim();
    }

    public Integer getRiskScore() {
        return riskScore;
    }

    public void setRiskScore(Integer riskScore) {
        this.riskScore = riskScore;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress == null ? null : contactAddress.trim();
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public String getUserEducation() {
        return userEducation;
    }

    public void setUserEducation(String userEducation) {
        this.userEducation = userEducation == null ? null : userEducation.trim();
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
		return "UserBaseInfo [baseId=" + baseId + ", userId=" + userId + ", userIndustry=" + userIndustry
				+ ", userProfession=" + userProfession + ", accountBeneficiary=" + accountBeneficiary
				+ ", accountController=" + accountController + ", badRecord=" + badRecord + ", taxStatus=" + taxStatus
				+ ", viewName=" + viewName + ", telNum=" + telNum + ", riskScore=" + riskScore + ", contactAddress="
				+ contactAddress + ", zipCode=" + zipCode + ", userEducation=" + userEducation + ", a2=" + a2 + ", a3="
				+ a3 + ", a4=" + a4 + ", a5=" + a5 + "]";
	}
    
}