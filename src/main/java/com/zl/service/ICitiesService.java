package com.zl.service;

import java.util.List;

import com.zl.pojo.Cities;

public interface ICitiesService {

	List<Cities> queryCities();

	List<Cities> selectCitiesById(String provinceId);

}
