package com.example.survey_system.vo;

import java.util.List;

public class AddQuestionRequest {
	
	private String question;

	// šd•¡‘I
	private String options;
	
	private boolean be_write;
	
	private String category;
	

	public AddQuestionRequest() {
		super();
	}


	public AddQuestionRequest(String question, String options, boolean be_write, String category) {
		super();
		this.question = question;
		this.options = options;
		this.be_write = be_write;
		this.category = category;
	}


	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}


	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}



	public String getOptions() {
		return options;
	}


	public void setOptions(String options) {
		this.options = options;
	}


	public boolean isBe_write() {
		return be_write;
	}

	public void setBe_write(boolean be_write) {
		this.be_write = be_write;
	}
	
	
	
	
	
}
