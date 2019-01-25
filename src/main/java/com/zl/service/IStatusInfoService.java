package com.zl.service;

import com.zl.pojo.StatusInfo;

public interface IStatusInfoService {

	void insertStatusInfo(StatusInfo statusInfo);


	StatusInfo queryStatusInfoByUserId(Integer userId);

}
