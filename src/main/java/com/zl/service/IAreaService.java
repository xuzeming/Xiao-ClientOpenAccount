package com.zl.service;

import java.util.List;

import com.zl.pojo.Area;
import com.zl.pojo.Cities;

public interface IAreaService {

	List<Area> queryArea();

	List<Cities> selectAreaById(String citiesId);

}
