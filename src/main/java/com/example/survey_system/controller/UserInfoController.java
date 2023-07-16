package com.example.survey_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.survey_system.service.ifs.UserInfoService;
import com.example.survey_system.vo.AddUserInfoRequest;
import com.example.survey_system.vo.AddUserInfoResponse;
import com.example.survey_system.vo.ShowAllInfoRequest;
import com.example.survey_system.vo.ShowAllInfoResponse;
import com.example.survey_system.vo.ShowUserInfoRequest;
import com.example.survey_system.vo.ShowUserInfoResponse;

@RestController
@CrossOrigin
public class UserInfoController {
	
	@Autowired
	private UserInfoService userInfoService;
	
	
	@PostMapping(value = "add_SurveyUser")
	public AddUserInfoResponse addSurveyInfo(@RequestBody AddUserInfoRequest request) {
		
		return userInfoService.addSurveyInfo(request);
	}
	
	@PostMapping(value = "show_userInfo")
	public ShowUserInfoResponse addSdurveyInfo(@RequestBody ShowUserInfoRequest request) {
		
		return userInfoService.ShowSurveyInfo(request);
	}
	
	
	@PostMapping(value = "show_allInfo")
	public ShowAllInfoResponse addSsdadurveyInfo(@RequestBody ShowAllInfoRequest request) {
		
		return userInfoService.ShowAllInfo(request);
	}
	

}
