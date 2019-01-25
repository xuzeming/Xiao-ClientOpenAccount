package com.zl.mapper;

import java.util.List;

import com.zl.pojo.Cities;

public interface CitiesMapper {

	List<Cities> selectCities();

	List<Cities> selectCitiesById(String provinceId);

}
