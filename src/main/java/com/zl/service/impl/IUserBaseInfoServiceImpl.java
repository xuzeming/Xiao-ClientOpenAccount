package com.zl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.mapper.UserBaseInfoMapper;
import com.zl.pojo.UserBaseInfo;
import com.zl.pojo.UserIdentification;
import com.zl.service.IUserBaseInfoService;
@Service
public class IUserBaseInfoServiceImpl implements IUserBaseInfoService {
	@Autowired
	private UserBaseInfoMapper userBaseInfoMapper;
	@Override
	public void saveUserBaseInfo(UserBaseInfo userBaseInfo) {
		userBaseInfoMapper.insertUserBaseInfo(userBaseInfo);
	}
	
	/**
	 * 2.保存风险评估分数
	 */
	@Override
	public void saveEstimateScore(UserBaseInfo userBaseInfo) {
		userBaseInfoMapper.updateUserBaseInfoForSaveEstimateScore(userBaseInfo);
	}
	/**
	 * 3.插入视频
	 */
	@Override
	public void updateUserBaseInfo(UserBaseInfo userBaseInfo) {
		userBaseInfoMapper.updateupdateUserBaseInfo(userBaseInfo);
	}

}
