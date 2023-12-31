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
	public ShowUserInfoResponse showWriterDate(ShowUserInfoRequest request) {
	
//		List<UserInfo> feedBack = userDao.findUserNameAndWriteTime();
		List<UserInfo> feedBack = userDao.findAll();

		//	ΣεδΚIσList
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
	public ShowAllInfoResponse showWriterInfo(ShowAllInfoRequest request) {
		
		String userName = request.getUserName();
		
//		εδβεjαω
		List<Integer> tNumber = new ArrayList<>();
		
		List<String> resQuestion = new ArrayList<>();
		
		List<String> resAnswer = new ArrayList<>();
		
//		εδp"findWriterQuestion"©θ`DaoQISΏ(Vγό¬ΒΚΏζo)
		List<BackQuestion> writedSurvey = new ArrayList<>();
		
		
		List<UserInfo> res = userDao.finduserInfoByname(userName);
		
		if(CollectionUtils.isEmpty(res)) {
			
			return new ShowAllInfoResponse(RtnCode.NOT_FOUND.getMessage());

		}
		
//		ζoUlIu: ©Ό, εjαω M  Nκ Uϊϊ 
		for(UserInfo item: res) {
			
			String nameInfo = item.getUserName();
			String phoneInfo = item.getPhone();
			int ageInfo = item.getAge();
			String mailInfo = item.getMail();

			LocalDateTime timeInfo = item.getWrite_time();
			
//			itemList: εδό‘ΙΘγIΚ
//			----------------------------------------------
			for(UserInfo itemList: res) {
				
				resQuestion.add(itemList.getQuestion());
				resAnswer.add(itemList.getAnswer());
				tNumber.add(itemList.getT_number());
				System.out.println(itemList.getT_number());

				List<BackQuestion> resWritedSurvey = userDao.findWriterQuestion(itemList.getT_number());
				for(BackQuestion itemNum: resWritedSurvey) {
					
					writedSurvey.add(itemNum);
			
				}
			
			}
		
//			-----------------------------------------------
					
			return new ShowAllInfoResponse(nameInfo, phoneInfo, mailInfo, ageInfo, timeInfo, resQuestion, writedSurvey, resAnswer, RtnCode.SUCCESSFUL.getMessage());
//			return new ShowAllInfoResponse(writedSurvey);
		}
		
		
		
		
		return new ShowAllInfoResponse("good!");
	}
	
	

}
