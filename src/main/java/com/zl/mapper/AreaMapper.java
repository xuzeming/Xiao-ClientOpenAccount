package com.zl.mapper;

import java.util.List;

import com.zl.pojo.Area;
import com.zl.pojo.Cities;

public interface AreaMapper {

	List<Area> selectArea();

	List<Cities> selectAreaByCitiesId(String citiesId);

}
