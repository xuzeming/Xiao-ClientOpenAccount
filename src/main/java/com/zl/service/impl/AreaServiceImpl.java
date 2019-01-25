package com.zl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.mapper.AreaMapper;
import com.zl.pojo.Area;
import com.zl.pojo.Cities;
import com.zl.service.IAreaService;
@Service
public class AreaServiceImpl implements IAreaService {
	@Autowired
	private AreaMapper areaMapper;
	@Override
	public List<Area> queryArea() {
		// TODO Auto-generated method stub
		return areaMapper.selectArea();
	}
	/**
	 * 2.根据城市id查询区县
	 */
	@Override
	public List<Cities> selectAreaById(String citiesId) {
		return areaMapper.selectAreaByCitiesId(citiesId);
	}

}
