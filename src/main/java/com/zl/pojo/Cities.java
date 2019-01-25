package com.zl.pojo;

public class Cities {
    private Integer cId;

    private String cityId;

    private String city;

    private String provinceId;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId == null ? null : provinceId.trim();
    }

	@Override
	public String toString() {
		return "Cities [cId=" + cId + ", cityId=" + cityId + ", city=" + city + ", provinceId=" + provinceId + "]";
	}
    
}