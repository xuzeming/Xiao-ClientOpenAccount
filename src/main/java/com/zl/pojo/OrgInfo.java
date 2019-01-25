package com.zl.pojo;

public class OrgInfo {
    private Integer orgId;

    private String areaId;

    private String orgName;

    private String a1;

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1 == null ? null : a1.trim();
    }

	@Override
	public String toString() {
		return "OrgInfo [orgId=" + orgId + ", areaId=" + areaId + ", orgName=" + orgName + ", a1=" + a1 + "]";
	}
    
}