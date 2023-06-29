package com.example.survey_system.vo;

import java.util.List;

public class AddQuestionRequest {
	
	private String question;

	// šd‘I
	private String option;
	
	// •¡‘I
	private List<String> options;
	
	private String category;
	

	public AddQuestionRequest() {
		super();
	}



	public AddQuestionRequest(String question, String option, List<String> options, String category) {
		super();
		this.question = question;
		this.option = option;
		this.options = options;
		this.category = category;
	}



	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}
	
	
	
}
