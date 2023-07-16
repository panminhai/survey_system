package com.example.survey_system.vo;

public class ShowAllInfoRequest {
	
	private String userName;
	
	
	public ShowAllInfoRequest() {
		super();
	}

	public ShowAllInfoRequest(String userName) {
		super();
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	

}
