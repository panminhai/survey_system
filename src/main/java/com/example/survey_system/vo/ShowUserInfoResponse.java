package com.example.survey_system.vo;

import java.time.LocalDateTime;
import java.util.List;

import com.example.survey_system.entity.UserInfo;

public class ShowUserInfoResponse {
	
	
	private List<LocalDateTime> writeTime;
	
	private List<String> userName;
	
	private String message;
	

	
	public ShowUserInfoResponse() {
		super();
	}
	


	public ShowUserInfoResponse(List<String> userName, List<LocalDateTime> writeTime, String message) {
		super();
		this.writeTime = writeTime;
		this.userName = userName;
		this.message = message;
	}


	public ShowUserInfoResponse(String message) {
		super();
		this.message = message;
	}

	public List<LocalDateTime> getWriteTime() {
		return writeTime;
	}

	public void setWriteTime(List<LocalDateTime> writeTime) {
		this.writeTime = writeTime;
	}

	public List<String> getUserName() {
		return userName;
	}

	public void setUserName(List<String> userName) {
		this.userName = userName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	


	
	

}
