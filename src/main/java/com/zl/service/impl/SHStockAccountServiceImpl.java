package com.zl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.mapper.SHStockAccountMapper;
import com.zl.pojo.ShStockAccount;
import com.zl.service.ISHStockAccountService;
@Service
public class SHStockAccountServiceImpl implements ISHStockAccountService {
	@Autowired
	private SHStockAccountMapper sHStockAccountMapper;
	@Override
	public void saveSZStockAccount(ShStockAccount shStockAccount) {
		sHStockAccountMapper.insertSHStockAccount(shStockAccount);
	}

}
