package com.example.survey_system.vo;

import java.util.List;

public class DeleteQuestionRequest {
	
	private List<Integer> questionNumber;
	
	

	public DeleteQuestionRequest() {
		super();
	}

	public DeleteQuestionRequest(List<Integer> questionNumber) {
		super();
		this.questionNumber = questionNumber;
	}

	public List<Integer> getQuestionNumber() {
		return questionNumber;
	}

	public void setQuestionNumber(List<Integer> questionNumber) {
		this.questionNumber = questionNumber;
	}
	
	


}
