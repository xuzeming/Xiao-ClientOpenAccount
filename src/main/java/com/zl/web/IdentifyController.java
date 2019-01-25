package com.zl.web;

import java.io.File;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONObject;
import com.zl.pojo.Education;
import com.zl.pojo.EstimateScore;
import com.zl.pojo.Page;
import com.zl.pojo.StatusInfo;
import com.zl.pojo.UserBaseInfo;
import com.zl.pojo.UserCenters;
import com.zl.pojo.UserIdentification;
import com.zl.service.IEducationService;
import com.zl.service.IStatusInfoService;
import com.zl.service.IUserBaseInfoService;
import com.zl.service.IUserIdentificationService;
import com.zl.util.APPCodeDemo;
import com.zl.util.ConvertJsonToDate;

@Controller
public class IdentifyController {
	@Autowired
	private IUserIdentificationService userIdentificationService;
	
	@Autowired
	private IEducationService educationService;
	
	@Autowired
	private IUserBaseInfoService userBaseInfoServiceImpl;
	
	@Autowired
	private IStatusInfoService statusInfoServiceImpl;
	/**
	 * 1.上传身份证
	 * @param uploadFile
	 * @param name
	 * @param identityNo
	 * @param session
	 * @return
	 * @throws ParseException
	 */
	@RequestMapping(value="/uploadIdentify.action",method = RequestMethod.POST)
    public String fileUpload(@RequestBody(required=false)MultipartFile[] uploadFile,@RequestBody(required=false)String name,@RequestBody(required=false)String identityNo,HttpSession session,Integer id,HttpServletRequest request) throws ParseException {
		UserCenters userCenters = (UserCenters)request.getSession().getAttribute("user");
System.out.println(userCenters);
        String fileFaceName = uploadFile[0].getOriginalFilename();  // 正面文件名
        String fileBackName = uploadFile[1].getOriginalFilename();  //反面文件名
        String suffixFaceName = fileFaceName.substring(fileFaceName.lastIndexOf("."));  // 后缀名
        String suffixBackName = fileBackName.substring(fileBackName.lastIndexOf("."));  // 后缀名
        String filePath = "D:/test/upload/"; // 上传后的路径
        fileFaceName = UUID.randomUUID() + suffixFaceName; // 正面新文件名
        fileBackName = UUID.randomUUID() + suffixBackName; // 反面新文件名
        File destFace = new File(filePath + fileFaceName);//正面存储
        File destBack = new File(filePath + fileBackName);//反面存储
        
        if (!destFace.getParentFile().exists()) {
        	destFace.getParentFile().mkdirs();
        }
       
        try {
        	uploadFile[0].transferTo(destFace);
        	uploadFile[1].transferTo(destBack);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        JSONObject jsonObjectFace = APPCodeDemo.identificationChick(destFace, "face");
        JSONObject jsonObjectBack = APPCodeDemo.identificationChick(destBack, "back");
        
        if (jsonObjectFace==null ||jsonObjectBack==null) {
			return "redirect:/error.html";
		}
        UserIdentification userIdentification = new UserIdentification();
        userIdentification.setIdentificationId(jsonObjectFace.getString("num"));
        userIdentification.setUserName(jsonObjectFace.getString("name"));
        userIdentification.setUserSex(jsonObjectFace.getString("sex"));
        userIdentification.setUserNation(jsonObjectFace.getString("nationality"));
        userIdentification.setSignAgency(jsonObjectBack.getString("issue"));
        userIdentification.setUserAddress(jsonObjectFace.getString("address"));
        //设置userId
		
		// UserCenters userCenters =(UserCenters) session.getAttribute("user");
		 //userIdentification.setUserId(user.getUserId());
		 
        //将json对象
       // RedisUtil.set("user", 123);
    //	UserCenters userCenters = RedisUtil.getObj("user", UserCenters.class);//getObj("user", UserCenters.class);
		// RedisUtil.set("a", 1);
//System.err.println(userCenters);
        userIdentification.setUserId(id);
        
        //创建一个日期转换的工具类将识别的字符串转换成日期
        ConvertJsonToDate.convertJsonStrToDate(jsonObjectBack.getString("start_date"));
        ConvertJsonToDate.convertJsonStrToDate(jsonObjectBack.getString("end_date"));
        ConvertJsonToDate.convertJsonStrToDate(jsonObjectFace.getString("birth"));
        
        userIdentification.setStartTime(ConvertJsonToDate.convertJsonStrToDate(jsonObjectBack.getString("start_date")));
        userIdentification.setEndTime(ConvertJsonToDate.convertJsonStrToDate(jsonObjectBack.getString("end_date")));
        userIdentification.setUserBirthday( ConvertJsonToDate.convertJsonStrToDate(jsonObjectFace.getString("birth")));
        userIdentification.setFrontImg(fileFaceName);
        userIdentification.setBackImg(fileBackName);
        //调用插入的方法
        userIdentificationService.save(userIdentification);
        
        //将数据回写
        session.setAttribute("userIdentification", userIdentification);
        return "redirect:/acount.html";
    }
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping("/getJsonObject.action")
	/**
	 * 2.从session里面拿对象回写
	 * @param session
	 * @return
	 */
	@ResponseBody
	public Page getJsonObject(HttpSession session) {
		UserIdentification userIdentification = (UserIdentification)session.getAttribute("userIdentification");
		
		Page pages = new Page();
		pages.setUserIdentification(userIdentification);
		List<Education> educationList = educationService.queryEducation();
		pages.setEducation(educationList);
		return pages;
	}
	/**
	 * 3.插入信息
	 */
	@RequestMapping("/saveIdentiFy.action")
	public String saveIdentifyInfomation(UserIdentification userIdentification,UserBaseInfo userBaseInfo) {
		//1.修改刚才的信息进行确认
		userIdentificationService.updateUserIdentification(userIdentification);
		//2.插入基础信息
		userBaseInfoServiceImpl.saveUserBaseInfo(userBaseInfo);
		return "redirect:/estimate.html";
	}
	/**
	 * 4.统计风险评估
	 */
	@RequestMapping("/saveEstimateScore.action")
	public String saveEstimate(EstimateScore score,HttpSession session) {
		UserBaseInfo userBaseInfo = new UserBaseInfo();
		 //设置userId
		UserCenters user =(UserCenters) session.getAttribute("user");
		userBaseInfo.setUserId(user.getUserId());//这里是从session里面获取的
		userBaseInfo.setRiskScore(score.getAllScore());
		userBaseInfoServiceImpl.saveEstimateScore(userBaseInfo);
		return  "redirect:/kaiHuLeiXin.html";
	}
	/**
	 * 5.视频上传
	 */
	/**
	 * 1.上传身份证
	 * @param uploadFile
	 * @param name
	 * @param identityNo
	 * @param session
	 * @return
	 * @throws ParseException
	 */
	@RequestMapping("/uploadVideo.action")
    public String uploadVideo(MultipartFile uploadVideoFile,HttpSession session) throws ParseException {
			
        String fileName = uploadVideoFile.getOriginalFilename();  // 正面文件名
        String suffixFaceName = fileName.substring(fileName.lastIndexOf("."));  // 后缀名
        String filePath = "D:/test/upload/"; // 上传后的路径
        fileName = UUID.randomUUID() + suffixFaceName; // 正面新文件名
        File destFace = new File(filePath + fileName);//正面存储
        if (!destFace.getParentFile().exists()) {
        	destFace.getParentFile().mkdirs();
        }
       
        try {
        	uploadVideoFile.transferTo(destFace);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        //修改viewname
        UserBaseInfo userBaseInfo = new UserBaseInfo();
        userBaseInfo.setViewName(fileName);
UserCenters user =(UserCenters) session.getAttribute("user");
userBaseInfo.setUserId(user.getUserId());//这里是从session里面获取的  
                
		userBaseInfoServiceImpl.updateUserBaseInfo(userBaseInfo);
		
		
		//插入数据状态表
		StatusInfo statusInfo = new StatusInfo();
statusInfo.setUserId(1);//从session拿的
		statusInfoServiceImpl.insertStatusInfo(statusInfo);
		
        return "redirect:/WiatCheck.html";
    }
}


