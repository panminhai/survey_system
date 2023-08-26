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
	
	@Column(name = "q_number")
	private int qNumber;
	
	
	@Column(name = "question")
	private String question;
	
	@Column(name = "options")
	private String options;
	
	
	@Column(name = "category")
	private String category;


	public BackQuestion() {
		super();
	}


	public BackQuestion(int number, int q_number, String question, String options, String category) {
		super();
		this.number = number;
		this.qNumber = q_number;
		this.question = question;
		this.options = options;
		this.category = category;
	}


	public BackQuestion(String question, String options) {
		super();
		this.question = question;
		this.options = options;
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


	public int getQ_number() {
		return qNumber;
	}


	public void setQ_number(int q_number) {
		this.qNumber = q_number;
	}



	public String getOptions() {
		return options;
	}



	public void setOptions(String options) {
		this.options = options;
	}
	
	
	
	
	
	
	
}
