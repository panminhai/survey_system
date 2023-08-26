package com.example.survey_system.vo;

import java.time.LocalDateTime;
import java.util.List;

import com.example.survey_system.entity.UserInfo;

public class WriterSurveyResponse {
	
//	private List<String> userName;
	
//	private List<LocalDateTime> writeTime;
	
	private List<UserInfo> resWritedSurvey;
	
	private String message;


	public WriterSurveyResponse() {
		super();

	}

	
	public WriterSurveyResponse(String message) {
		super();
		this.message = message;
	}



	public WriterSurveyResponse(List<UserInfo> resWritedSurvey, String message) {
		super();
		this.resWritedSurvey = resWritedSurvey;
		this.message = message;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}




	public List<UserInfo> getResWritedSurvey() {
		return resWritedSurvey;
	}




	public void setResWritedSurvey(List<UserInfo> resWritedSurvey) {
		this.resWritedSurvey = resWritedSurvey;
	}

	
	
	
	

}
