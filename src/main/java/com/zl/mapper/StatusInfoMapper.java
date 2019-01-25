package com.zl.mapper;

import com.zl.pojo.StatusInfo;

public interface StatusInfoMapper {

	void insertStatusInfo(StatusInfo statusInfo);

	StatusInfo selectStatusInfo(Integer userId);

}
