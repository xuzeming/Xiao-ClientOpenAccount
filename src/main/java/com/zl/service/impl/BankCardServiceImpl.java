package com.zl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.mapper.BankCardMapper;
import com.zl.pojo.BankCard;
import com.zl.service.IBankCardService;
@Service
public class BankCardServiceImpl implements IBankCardService {
	@Autowired
	private BankCardMapper bankMapper;
	@Override
	public BankCard queryBankCardByNameAndTelAndBankNum(String cardOwner, String cardNum, String cardTel) {
		return bankMapper.selectBankCardByNameAndTelAndBankNum(cardOwner,cardNum,cardTel);
	}

}
