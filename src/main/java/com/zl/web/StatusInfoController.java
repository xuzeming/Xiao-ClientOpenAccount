package com.zl.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zl.pojo.OrgInfo;
import com.zl.pojo.StatusInfo;
import com.zl.pojo.UserCenters;
import com.zl.service.IOrgInfoService;
import com.zl.service.IStatusInfoService;

@Controller
public class StatusInfoController {
	@Autowired
	private IStatusInfoService statusInfoServiceImpl;
	
	@Autowired
	private IOrgInfoService orgInfoServiceImpl;
	
	/**
	    *      营业厅和状态的查询
	 * @return
	 */
	@RequestMapping("/getStatus.action")
	@ResponseBody
	public StatusInfo getStatusInfo(HttpSession session) {
		
UserCenters user =(UserCenters) session.getAttribute("user");
Integer userId = user.getUserId();//从session拿到
		StatusInfo 	StatusInfo = statusInfoServiceImpl.queryStatusInfoByUserId(userId);//查询审核信息状态
		
		
		return StatusInfo;
	}
	@RequestMapping("/getOrgInfoStatus.action")
	@ResponseBody
	public OrgInfo getStatusOrgInfo(HttpSession session) {
UserCenters user =(UserCenters) session.getAttribute("user");
Integer userId = user.getUserId();//从session拿到
		
		OrgInfo orgInfo = orgInfoServiceImpl.queryOrgInfoByUserId(userId);
		
		return orgInfo;
	}
}
