package com.example.survey_system.service.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import com.example.survey_system.constants.RtnCode;
import com.example.survey_system.entity.BackQuestion;
import com.example.survey_system.entity.SurveyBack;
import com.example.survey_system.entity.UserInfo;
import com.example.survey_system.repository.BackQuestionDao;
import com.example.survey_system.repository.SurveyBackDao;
import com.example.survey_system.repository.UserInfoDao;
import com.example.survey_system.service.ifs.UserInfoService;
import com.example.survey_system.vo.AddUserInfoRequest;
import com.example.survey_system.vo.AddUserInfoResponse;
import com.example.survey_system.vo.ShowAllInfoRequest;
import com.example.survey_system.vo.ShowAllInfoResponse;
import com.example.survey_system.vo.ShowUserInfoRequest;
import com.example.survey_system.vo.ShowUserInfoResponse;

@Service
public class UserInfoServiceImpl implements UserInfoService{

	@Autowired
	private SurveyBackDao backDao;
	
	@Autowired
	private BackQuestionDao questionDao;
	
	@Autowired
	private UserInfoDao userDao;
	
	
	
	@Override
	public AddUserInfoResponse addSurveyInfo(AddUserInfoRequest request) {
		
		List<UserInfo> user = request.getReqUserInfo();
		
//		LocalDateTime writeTime = request.getWriteTime();
		
		
		userDao.saveAll(user);
	

		return new AddUserInfoResponse(RtnCode.SUCCESSFUL.getMessage());
	}



	@Override
	public ShowUserInfoResponse ShowSurveyInfo(ShowUserInfoRequest request) {
	
//		List<UserInfo> feedBack = userDao.findUserNameAndWriteTime();
		List<UserInfo> feedBack = userDao.findAll();

		//	ïâê”Â‰åãâ ìIãÛList
		List<String> resUserName = new ArrayList<>();
		List<LocalDateTime> resWriteTime = new ArrayList<>();

		for(UserInfo item: feedBack) {
						
			String userName = item.getUserName();
			LocalDateTime writeTime = item.getWrite_time();
			
			resUserName.add(userName);
			resWriteTime.add(writeTime);
			
		}
		
		
		return new ShowUserInfoResponse(resUserName, resWriteTime, RtnCode.SUCCESSFUL.getMessage());
	}



	@Override
	public ShowAllInfoResponse ShowAllInfo(ShowAllInfoRequest request) {
		
		String userName = request.getUserName();
		
//		Â‰ñ‚åîÂj·˘
		List<Integer> tNumber = new ArrayList<>();
		
		List<String> resQuestion = new ArrayList<>();
		
		List<String> resAnswer = new ArrayList<>();
		
		
		List<UserInfo> res = userDao.finduserInfoByname(userName);
		
		if(CollectionUtils.isEmpty(res)) {
			
			return new ShowAllInfoResponse(RtnCode.NOT_FOUND.getMessage());

		}
		
		for(UserInfo item: res) {
			
			String nameInfo = item.getUserName();
			String phoneInfo = item.getPhone();
			int ageInfo = item.getAge();
			String mailInfo = item.getMail();
			LocalDateTime timeInfo = item.getWrite_time();
			
//			----------------------------------------------
			for(UserInfo itemList: res) {
				
				resQuestion.add(itemList.getQuestion());
				resAnswer.add(itemList.getAnswer());
				tNumber.add(itemList.getT_number());
	
			}

//			-----------------------------------------------
			
			return new ShowAllInfoResponse(nameInfo, phoneInfo, mailInfo, ageInfo, timeInfo, resQuestion, resAnswer, RtnCode.SUCCESSFUL.getMessage());

		}
		
		if(CollectionUtils.isEmpty(tNumber)) {
			
		}
		
		return new ShowAllInfoResponse("good!");
	}
	
	

}
