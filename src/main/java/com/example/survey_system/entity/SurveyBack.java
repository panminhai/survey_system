package com.example.survey_system.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "survey_title")
public class SurveyBack {
	
	@Id
	@Column(name = "number")
	private int number;
	
	@Column(name = "t_number")
	private int t_number;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "comment")
	private String comment;
	
	//問卷狀態 0: 未開啟, 1: 啟用中, 2: 已關閉
	@Column(name = "status")
	private int status;
	
	@Column(name = "start_time")
	private LocalDate start_time = LocalDate.now();
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@Column(name = "end_time")
	private LocalDate end_time = start_time.plusDays(7) ;
	
//	@Column(name = "statistic")
//	private String statistic;
	
//	----------------------------------------------------
	

	public SurveyBack() {
		super();
	}
	
	public SurveyBack(int number, int t_number, String title, String comment, int status, LocalDate start_time,
			LocalDate end_time) {
		super();
		this.number = number;
		this.t_number = t_number;
		this.title = title;
		this.comment = comment;
		this.status = status;
		this.start_time = start_time;
		this.end_time = end_time;
	}


	
	

//	public SurveyBack(String describe) {
//		super();
//		this.describe = describe;
//	}
	
//	-------------------------------------------------



	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}

	public LocalDate getStart_time() {
		return start_time;
	}

	public void setStart_time(LocalDate start_time) {
		this.start_time = start_time;
	}

	public LocalDate getEnd_time() {
		return end_time;
	}

	public void setEnd_time(LocalDate end_time) {
		this.end_time = end_time;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	public int getT_number() {
		return t_number;
	}


	public void setT_number(int t_number) {
		this.t_number = t_number;
	}

	
	


	


	

	
	

}
