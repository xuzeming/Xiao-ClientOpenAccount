package com.zl.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zl.pojo.Area;
import com.zl.pojo.Cities;
import com.zl.pojo.OrgInfo;
import com.zl.pojo.Page;
import com.zl.pojo.Provinces;
import com.zl.pojo.UserAccount;
import com.zl.pojo.UserCenters;
import com.zl.service.IAreaService;
import com.zl.service.ICitiesService;
import com.zl.service.IOrgInfoService;
import com.zl.service.IProvincesService;
import com.zl.service.IUserAccountService;

/**
 * 
 * @author THINK
 *
 */
@Controller
public class GetProAndCitieAndCountAndOrgController {
	
	@Autowired 
	private  IProvincesService provincesServiceImpl;
	
	@Autowired
	private  ICitiesService  citiesServiceImpl;
	
	@Autowired
	private  IAreaService areaServiceImpl;
	
	@Autowired
	private  IOrgInfoService orgInfoServiceImpl;
	
	
	@Autowired
	private IUserAccountService userAccountServiceImpl;
	/**
	 * 1.查询省
	 * @return
	 */
	@RequestMapping("/getProAndCitieAndCountAndOrg.action")
	@ResponseBody
	public Page getProAndCitieAndCountAndOrg() {
		Page page = new Page<>();
		List<Provinces> provinces = provincesServiceImpl.queryProvince();
		page.setProvinces(provinces);
		return page;
	}
	/**
	 * 2.查询市
	 * @param provinceId
	 * @return
	 */
	@RequestMapping("/getCities.action")
	@ResponseBody
	public List<Cities> getCities(String provinceId){
		return citiesServiceImpl.selectCitiesById(provinceId);
		
	}
	/**
	 * 3.查询区
	 * @param citiesId
	 * @return
	 */
	@RequestMapping("/getArea.action")
	@ResponseBody
	public List<Cities> getArea(String citiesId){
		return areaServiceImpl.selectAreaById(citiesId);
		
	}
	
	/**
	 * 4.查询营业厅
	 * @param areaId
	 * @return
	 */
	@RequestMapping("/getOrgInfo.action")
	@ResponseBody
	public List<OrgInfo> getOrgInfo(String areaId){
		return orgInfoServiceImpl.selectOrgInfoById(areaId);
		
	}
	/**
	 * 5.插入资金密码和营业厅
	 */
	@RequestMapping("/savePwdAndOrg.action")
	public String getOrgInfo(UserAccount userAccount,HttpSession session){
		UserCenters user =(UserCenters) session.getAttribute("user");
userAccount.setUserId(user.getUserId());//从session拿的userId
		userAccountServiceImpl.insertUserAccount(userAccount);
		return "redirect:/bangdingYHK.html";
		
	}
	
}
