package com.zl.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zl.pojo.ShStockAccount;
import com.zl.pojo.SzStockAccount;
import com.zl.pojo.UserCenters;
import com.zl.pojo.UserIdentification;
import com.zl.service.ISHStockAccountService;
import com.zl.service.ISZStockAccountService;

@Controller
public class OpenOrTransferAccountController {
	@Autowired
	private  ISZStockAccountService sZStockAccountserviceImpl;
	
	@Autowired
	private  ISHStockAccountService shStockAccountserviceImpl;
	
	@RequestMapping("/openAccount.action")
	public String openAccount(String openAccountType,String  shTransferType,String  szTransferType,HttpSession session) {
		

		if ("上海A股".equals(openAccountType)) {
			ShStockAccount shStockAccount = new ShStockAccount();
			
			shStockAccount.setIdentificationId(((UserIdentification)session.getAttribute("userIdentification")).getIdentificationId());
			UserCenters user =(UserCenters) session.getAttribute("user");
			shStockAccount.setUserId(user.getUserId());   //从session获取的userId
System.err.println(shStockAccount);
			shStockAccountserviceImpl.saveSZStockAccount(shStockAccount);
		}else if("深圳A股".equals(openAccountType)) {
			SzStockAccount szStockAccount = new SzStockAccount();
			szStockAccount.setIdentificationId(((UserIdentification)session.getAttribute("userIdentification")).getIdentificationId());
			UserCenters user =(UserCenters) session.getAttribute("user");
			szStockAccount.setUserId(user.getUserId());;//从session获取的userId
			sZStockAccountserviceImpl.saveSHStockAccount(szStockAccount);
		}
		
		return "redirect:/kaiHuXieYi.html";
	}
}
