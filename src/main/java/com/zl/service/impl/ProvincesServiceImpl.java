package com.zl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.mapper.ProvincesMapper;
import com.zl.pojo.Provinces;
import com.zl.service.IProvincesService;
@Service
public class ProvincesServiceImpl implements IProvincesService {
	@Autowired
	private ProvincesMapper provincesMapper;
	@Override
	public List<Provinces> queryProvince() {
		return provincesMapper.selectProvinces();
	}

}
