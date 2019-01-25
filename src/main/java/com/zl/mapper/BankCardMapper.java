package com.zl.mapper;

import com.zl.pojo.BankCard;

public interface BankCardMapper {

	BankCard selectBankCardByNameAndTelAndBankNum(String cardOwner, String cardNum, String cardTel);

}
