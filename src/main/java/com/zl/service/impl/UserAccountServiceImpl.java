package com.zl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.mapper.UserAccountMapper;
import com.zl.pojo.UserAccount;
import com.zl.service.IUserAccountService;
@Service
public class UserAccountServiceImpl implements IUserAccountService {
	@Autowired
	private UserAccountMapper userAccountMapper;
	@Override
	public void insertUserAccount(UserAccount userAccount) {
		userAccountMapper.insertUserAccount(userAccount);
	}

}
