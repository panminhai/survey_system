package com.example.survey_system.vo;

import java.util.List;


public class DeleteTitleRequest {
	
	private List<Integer> surveyNumber;
	
	

	public DeleteTitleRequest() {
		super();
	}

	public DeleteTitleRequest(List<Integer> surveyNumber) {
		super();
		this.surveyNumber = surveyNumber;
	}

	public List<Integer> getSurveyNumber() {
		return surveyNumber;
	}

	public void setSurveyNumber(List<Integer> surveyNumber) {
		this.surveyNumber = surveyNumber;
	}


}
