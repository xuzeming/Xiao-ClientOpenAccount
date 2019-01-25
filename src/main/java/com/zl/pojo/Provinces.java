package com.zl.pojo;

public class Provinces {
    private Integer pId;

    private String provinceId;

    private String province;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId == null ? null : provinceId.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

	@Override
	public String toString() {
		return "Provinces [pId=" + pId + ", provinceId=" + provinceId + ", province=" + province + "]";
	}
    
}