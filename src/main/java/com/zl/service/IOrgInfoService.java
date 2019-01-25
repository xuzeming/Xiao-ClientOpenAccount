package com.zl.service;

import java.util.List;

import com.zl.pojo.OrgInfo;

public interface IOrgInfoService {

	List<OrgInfo> queryOrgInfo();

	List<OrgInfo> selectOrgInfoById(String areaId);

	OrgInfo queryOrgInfoByUserId(Integer userId);

}
