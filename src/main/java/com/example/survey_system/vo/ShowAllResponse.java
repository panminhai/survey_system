package com.example.survey_system.vo;

import java.util.List;

import com.example.survey_system.entity.SurveyBack;

public class ShowAllResponse {
	
	private List<SurveyBack> allSurvey;
	private String message;


	public ShowAllResponse() {
		super();
	}

	public ShowAllResponse(List<SurveyBack> allSurvey, String message) {
		super();
		this.allSurvey = allSurvey;
		this.message = message;
	}
	
	
	public ShowAllResponse(String message) {
		super();
		this.message = message;
	}



	public ShowAllResponse(List<SurveyBack> allSurvey) {
		super();
		this.allSurvey = allSurvey;
	}

	public List<SurveyBack> getAllSurvey() {
		return allSurvey;
	}

	public void setAllSurvey(List<SurveyBack> allSurvey) {
		this.allSurvey = allSurvey;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
	

}
