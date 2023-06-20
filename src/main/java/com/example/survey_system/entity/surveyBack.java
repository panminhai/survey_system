package com.example.survey_system.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "survey_title")

public class surveyBack {
	
	@Id
	@Column(name = "number")
	private int number;
	
	
	@Column(name = "title")
	private String title;
	
	
	@Column(name = "status")
	private boolean status;
	
	
	@Column(name = "start_time")
	private LocalDate start_time;
	

	@Column(name = "end_time")
	private LocalDate end_time;
	
//	@Column(name = "statistic")
//	private String statistic;
	

}
