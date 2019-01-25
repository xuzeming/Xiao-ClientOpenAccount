package com.zl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.mapper.EducationMapper;
import com.zl.pojo.Education;
import com.zl.service.IEducationService;
@Service
public class EducationServiceImpl implements IEducationService {
	@Autowired
	private EducationMapper educationMapper;
	@Override
	public List<Education> queryEducation() {
		// TODO Auto-generated method stub
		return educationMapper.selectEducation();
	}

}
