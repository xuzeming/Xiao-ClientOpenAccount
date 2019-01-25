package com.zl.pojo;

import java.io.Serializable;


import java.util.List;

public class Page<T> implements Serializable {
    private static final long serialVersionUID = 3441425995210227543L;
	
    private UserIdentification userIdentification;
    private List<Education> education;
    
    private List<Provinces> provinces;
    private List<Cities> cities;
    private List<Area> area;
    private List<OrgInfo> orgInfo;
	public UserIdentification getUserIdentification() {
		return userIdentification;
	}
	public void setUserIdentification(UserIdentification userIdentification) {
		this.userIdentification = userIdentification;
	}
	public List<Education> getEducation() {
		return education;
	}
	public void setEducation(List<Education> education) {
		this.education = education;
	}
	public List<Provinces> getProvinces() {
		return provinces;
	}
	public void setProvinces(List<Provinces> provinces) {
		this.provinces = provinces;
	}
	public List<Cities> getCities() {
		return cities;
	}
	public void setCities(List<Cities> cities) {
		this.cities = cities;
	}
	public List<Area> getArea() {
		return area;
	}
	public void setArea(List<Area> area) {
		this.area = area;
	}
	public List<OrgInfo> getOrgInfo() {
		return orgInfo;
	}
	public void setOrgInfo(List<OrgInfo> orgInfo) {
		this.orgInfo = orgInfo;
	}
	
	
	
    
    
}
