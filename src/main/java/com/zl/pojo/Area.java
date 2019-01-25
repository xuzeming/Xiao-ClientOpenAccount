package com.zl.pojo;

public class Area {
    private Integer aId;

    private String areaId;

    private String area;

    private String cityId;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

	@Override
	public String toString() {
		return "Area [aId=" + aId + ", areaId=" + areaId + ", area=" + area + ", cityId=" + cityId + "]";
	}
    
    
}