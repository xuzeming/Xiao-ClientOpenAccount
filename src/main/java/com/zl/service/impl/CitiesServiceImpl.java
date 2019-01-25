package com.zl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.mapper.CitiesMapper;
import com.zl.pojo.Cities;
import com.zl.service.ICitiesService;
@Service
public class CitiesServiceImpl implements ICitiesService {
	@Autowired
	private CitiesMapper citiesMapper;
	@Override
	public List<Cities> queryCities() {
		// TODO Auto-generated method stub
		return citiesMapper.selectCities();
	}
	/**
	 * 2.根据省Id查询
	 */
	@Override
	public List<Cities> selectCitiesById(String provinceId) {
		// TODO Auto-generated method stub
		return citiesMapper.selectCitiesById(provinceId);
	}

}
