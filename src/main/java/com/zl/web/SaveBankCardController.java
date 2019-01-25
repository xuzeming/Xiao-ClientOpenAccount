package com.zl.web;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zl.pojo.BankCard;
import com.zl.pojo.UserBankCard;
import com.zl.pojo.UserCenters;
import com.zl.service.IBankCardService;
import com.zl.service.IUserBankCardService;
import com.zl.util.RedisUtils;
import com.zl.util.RestTest;
/**
 * 
 * @author THINK
 * 绑定银行卡
 */
@Controller
public class SaveBankCardController {
	
	@Autowired
	private IBankCardService bankCardServiceImpl;
	
	@Autowired
	private IUserBankCardService userBankCardServiceImpl;
	/*
	 * 1/获取验证码
	 */
	@RequestMapping("/getMagCheck.action")
	@ResponseBody
	private String  getMagCheck(String cardTel) throws IOException {
		String sendPhone = RestTest.sendPhone(cardTel, "1");
		/**
		 * sendPhone存到redis
		 */
		RedisUtils.setString("checkCard", sendPhone);
		return "";
	}
	/**
	 * 绑定银行卡
	 * @param sendCard
	 * @param bankCard
	 * @return
	 */
	@RequestMapping("/saveBankCard.action")
	private String saveBankMsgsendPhone(String sendCard,BankCard bankCard,HttpSession session) {		
		String checkCard = RedisUtils.getString("checkCard");
		if (!checkCard.equals(sendCard)) {
			return "redirect:/error.html";
		}
		//根据手机号   银行卡号  拥有人姓名去匹配
		BankCard bankCards = bankCardServiceImpl.queryBankCardByNameAndTelAndBankNum(bankCard.getCardOwner(),bankCard.getCardNum(),bankCard.getCardTel());
		if (bankCards==null) {
			return "redirect:/error.html";
		}
		UserBankCard userBankCard = new UserBankCard();
		userBankCard.setCardId(bankCards.getCardId());
UserCenters user =(UserCenters) session.getAttribute("user");
userBankCard.setUserId(user.getUserId());//设置用户登录session的id
		userBankCard.setcardType(bankCards.getCardType());
		userBankCardServiceImpl.insertUserBankCard(userBankCard);
		
		
		
		return "redirect:/VideoUpload.html";
	}
	
	
}
