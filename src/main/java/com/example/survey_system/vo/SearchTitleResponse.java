package com.example.survey_system.vo;

import java.util.List;

import com.example.survey_system.entity.SurveyBack;

public class SearchTitleResponse {
	
	private List<SurveyBack> resTitle;
	
	private String message;
	
	

	public SearchTitleResponse() {
		super();
	}



	public SearchTitleResponse(List<SurveyBack> resTitle, String message) {
		super();
		this.resTitle = resTitle;
		this.message = message;
	}

	


	public SearchTitleResponse(String message) {
		super();
		this.message = message;
	}



	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<SurveyBack> getResTitle() {
		return resTitle;
	}

	public void setResTitle(List<SurveyBack> resTitle) {
		this.resTitle = resTitle;
	}

	
	
	
}
