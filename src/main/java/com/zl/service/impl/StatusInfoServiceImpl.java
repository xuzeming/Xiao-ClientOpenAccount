package com.zl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.mapper.StatusInfoMapper;
import com.zl.pojo.StatusInfo;
import com.zl.service.IStatusInfoService;
@Service
public class StatusInfoServiceImpl implements IStatusInfoService {
	@Autowired
	private StatusInfoMapper statusInfoMapper;
	@Override
	public void insertStatusInfo(StatusInfo statusInfo) {
		statusInfoMapper.insertStatusInfo(statusInfo);
	}
	/**
	 * 根据sessionid查询
	 */
	@Override
	public StatusInfo queryStatusInfoByUserId(Integer userId) {
		// TODO Auto-generated method stub
		return statusInfoMapper.selectStatusInfo(userId);
	}
	

}
