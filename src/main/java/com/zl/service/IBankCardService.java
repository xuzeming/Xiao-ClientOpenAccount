package com.zl.service;

import com.zl.pojo.BankCard;

public interface IBankCardService {

	BankCard queryBankCardByNameAndTelAndBankNum(String cardOwner, String cardNum, String cardTel);

}
