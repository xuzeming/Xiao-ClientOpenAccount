package com.zl.service;

import com.zl.pojo.UserBaseInfo;

public interface IUserBaseInfoService {


	void saveUserBaseInfo(UserBaseInfo userBaseInfo);


	void saveEstimateScore(UserBaseInfo userBaseInfo);


	void updateUserBaseInfo(UserBaseInfo userBaseInfo);

}
