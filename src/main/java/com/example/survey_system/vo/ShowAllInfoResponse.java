package com.example.survey_system.vo;

import java.time.LocalDateTime;
import java.util.List;

public class ShowAllInfoResponse {
	
	/*
	 * 個人訊息: 每個資訊欄位只會有一個結果
	 * 
	 * 個人填寫問券: 會有複數結果(需要用list回傳)
	 */
//	------------------------------------
//	個人資訊
	private String userName;
	
	private String phone;
	
	private String mail;
	
	private int age;
	
	private LocalDateTime writeTime;
	
//	------------------------------------
//	個人填寫問券紀錄
	
	private List<String> question;
	
	private List<String> answer;
//	--------------------------------------
	
	private String message;
	
	
	public ShowAllInfoResponse() {
		super();
	}
	
	
	

	public ShowAllInfoResponse(String message) {
		super();
		this.message = message;
	}

	public ShowAllInfoResponse(String userName, String phone, String mail, int age, LocalDateTime writeTime,
			List<String> question, List<String> answer, String message) {
		super();
		this.userName = userName;
		this.phone = phone;
		this.mail = mail;
		this.age = age;
		this.writeTime = writeTime;
		this.question = question;
		this.answer = answer;
		this.message = message;
	}

	public String getUserName() {
		return userName;
	}

	

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDateTime getWriteTime() {
		return writeTime;
	}

	public void setWriteTime(LocalDateTime writeTime) {
		this.writeTime = writeTime;
	}
	

	public List<String> getQuestion() {
		return question;
	}


	public void setQuestion(List<String> question) {
		this.question = question;
	}


	public List<String> getAnswer() {
		return answer;
	}




	public void setAnswer(List<String> answer) {
		this.answer = answer;
	}




	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}	
	
	
	
}
