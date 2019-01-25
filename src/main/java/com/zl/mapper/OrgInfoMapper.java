package com.zl.mapper;

import java.util.List;

import com.zl.pojo.OrgInfo;

public interface OrgInfoMapper {

	List<OrgInfo> selectOrgInfo();

	List<OrgInfo> selectOrgInfoByAreaId(String areaId);

	OrgInfo selectOrgInfoByUserId(Integer userId);

}
