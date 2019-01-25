package com.zl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.zl.mapper.SZStockAccountMapper;
import com.zl.pojo.SzStockAccount;
import com.zl.service.ISZStockAccountService;
@Service
public class SZStockAccountServiceImpl implements ISZStockAccountService {
	@Autowired
	private SZStockAccountMapper  sZStockAccountMapper;

	@Override
	public void saveSHStockAccount(SzStockAccount szStockAccount) {
		sZStockAccountMapper.insertSZStockAccount(szStockAccount);
	}

}
