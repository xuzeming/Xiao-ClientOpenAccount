package com.zl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.mapper.UserBankCardMapper;
import com.zl.pojo.UserBankCard;
import com.zl.service.IUserBankCardService;
@Service
public class UserBankCardServiceImpl implements IUserBankCardService {
	@Autowired
	private UserBankCardMapper userBankCardMapper;
	@Override
	public void insertUserBankCard(UserBankCard userBankCard) {
		userBankCardMapper.insertUserBankCard(userBankCard);
	}

}
