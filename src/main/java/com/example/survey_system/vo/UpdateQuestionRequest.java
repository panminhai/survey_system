package com.example.survey_system.vo;

public class UpdateQuestionRequest {
	
	private String question;
	
	private int number;

	// šd•¡‘I
	private String options;
	
	private boolean be_write;
	
	private String category;
	
	
	public UpdateQuestionRequest() {
		super();
	}

	

	public UpdateQuestionRequest(String question, int number, String options, boolean be_write, String category) {
		super();
		this.question = question;
		this.number = number;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
	
	
	

}
