package com.zl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.mapper.OrgInfoMapper;
import com.zl.pojo.OrgInfo;
import com.zl.service.IOrgInfoService;
@Service
public class OrgInfoServiceImpl implements IOrgInfoService {
	@Autowired
	private OrgInfoMapper orgInfoMapper;
	@Override
	public List<OrgInfo> queryOrgInfo() {
		// TODO Auto-generated method stub
		return orgInfoMapper.selectOrgInfo();
	}
	/**
	 * 2.根据地区id查询营业厅
	 */
	@Override
	public List<OrgInfo> selectOrgInfoById(String areaId) {
		// TODO Auto-generated method stub
		return orgInfoMapper.selectOrgInfoByAreaId(areaId);
	}
	/**
	 * 3.查询当前注册的营业厅
	 */
	@Override
	public OrgInfo queryOrgInfoByUserId(Integer userId) {
		// TODO Auto-generated method stub
		return orgInfoMapper.selectOrgInfoByUserId(userId);
	}

}
