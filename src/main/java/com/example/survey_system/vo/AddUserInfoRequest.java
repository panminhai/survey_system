package com.example.survey_system.vo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.example.survey_system.entity.UserInfo;

public class AddUserInfoRequest {

/*
 * 使用者瑱寫完送出後將填入資訊&使用者情報存入資料庫
 */
	
	private List<UserInfo> reqUserInfo;
	
	private String userName;	
	
	private int surveyNum;
	
	private LocalDateTime writeTime = LocalDateTime.now();
	
	

	public AddUserInfoRequest() {
		super();
	}

	

	public AddUserInfoRequest(List<UserInfo> reqUserInfo) {
		super();
		this.reqUserInfo = reqUserInfo;
	}


	public AddUserInfoRequest(String userName, int surveyNum, LocalDateTime writeTime) {
		super();
		this.userName = userName;
		this.surveyNum = surveyNum;
		this.writeTime = writeTime;
	}



	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getSurveyNum() {
		return surveyNum;
	}

	public void setSurveyNum(int surveyNum) {
		this.surveyNum = surveyNum;
	}

	public LocalDateTime getWriteTime() {
		return writeTime;
	}

	public void setWriteTime(LocalDateTime writeTime) {
		this.writeTime = writeTime;
	}



	public List<UserInfo> getReqUserInfo() {
		return reqUserInfo;
	}



	public void setReqUserInfo(List<UserInfo> reqUserInfo) {
		this.reqUserInfo = reqUserInfo;
	}
	
	
	
	
	
	
	
}
