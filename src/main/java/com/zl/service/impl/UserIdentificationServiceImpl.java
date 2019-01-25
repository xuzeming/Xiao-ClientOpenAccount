package com.zl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.mapper.UserIdentificationMapper;
import com.zl.pojo.UserIdentification;

import com.zl.service.IUserIdentificationService;
@Service
public class UserIdentificationServiceImpl implements IUserIdentificationService {
	@Autowired
	private UserIdentificationMapper userIdentificationMapper;
	
	/**
	 * 1.插入数据
	 */
	@Override
	public void save(UserIdentification userIdentification) {
		userIdentificationMapper.insertUserIdentification(userIdentification);
	}

	/**
	 * 2.修改数据
	 */
	@Override
	public void updateUserIdentification(UserIdentification userIdentification) {
		userIdentificationMapper.updateupdateUserIdentification(userIdentification);
	}

}
