package com.example.survey_system.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@Table(name = "survey_question")
public class BackQuestion {

	@Id
	@Column(name = "number")
	private int number;
	
	
	@Column(name = "question")
	private String question;
	
	
	@Column(name = "category")
	private String category;


	public BackQuestion() {
		super();
	}


	public BackQuestion(int number, String question, String category) {
		super();
		this.number = number;
		this.question = question;
		this.category = category;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
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
	
	
	
	
}
