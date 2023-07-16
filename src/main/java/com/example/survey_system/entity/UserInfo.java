package com.example.survey_system.entity;


import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_info")
public class UserInfo {
	
	
	@Id
	@Column(name = "number")
	//	@GeneratedValue: éëóøå…ó°óLê›íuó¨êÖê¸ù…éöéûóp
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int number;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "mail")
	private String mail;

	@Column(name = "age")
	private int age;
	
	@Column(name = "t_number")
	private int t_number;
	
	@Column(name = "question")
	private String question;
	
	@Column(name = "answer")
	private String answer;
	
	@Column(name = "write_time")
	private LocalDateTime write_time = LocalDateTime.now();;
	
	
	public UserInfo() {
		super();
	}



	public UserInfo(int number, String userName, String phone, String mail, int age, int t_number, String question,
			String answer, LocalDateTime write_time) {
		super();
		this.number = number;
		this.userName = userName;
		this.phone = phone;
		this.mail = mail;
		this.age = age;
		this.t_number = t_number;
		this.question = question;
		this.answer = answer;
		this.write_time = write_time;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
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


	public int getT_number() {
		return t_number;
	}


	public void setT_number(int t_number) {
		this.t_number = t_number;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public LocalDateTime getWrite_time() {
		return write_time;
	}


	public void setWrite_time(LocalDateTime write_time) {
		this.write_time = write_time;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	

	
	
	
	


	
	
	
}

