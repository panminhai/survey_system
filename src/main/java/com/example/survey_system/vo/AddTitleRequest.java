package com.example.survey_system.vo;

import java.util.List;

import com.example.survey_system.entity.SurveyBack;
import com.fasterxml.jackson.annotation.JsonFormat;

// ‰Á“üJsonŠi®
public class AddTitleRequest {
	
	/*
	 * —aİ–Í®: Œ»İ“úŠúˆ×€ 
	 */
	private List<SurveyBack> addSurvey;
	
	private String title;
	
	private int tNumber;

	private String comment;
	
	//	‘O’[: i˜Ò“I‘—¿çz¬jasonŠi®
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private String start_time;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private String end_time;
	
	private int status;
	
	
	public AddTitleRequest() {
		super();
	}

	public AddTitleRequest(List<SurveyBack> addSurvey) {
		super();
		this.addSurvey = addSurvey;
	}
	



//	public AddTitleRequest(String title, String comment, String start_time, String end_time, int status) {
//		super();
//		this.title = title;
//		this.comment = comment;
//		this.start_time = start_time;
//		this.end_time = end_time;
//		this.status = status;
//	}

	

	public List<SurveyBack> getAddSurvey() {
		return addSurvey;
	}

	public AddTitleRequest(String title, int tNumber, String comment, String start_time, String end_time, int status) {
		super();
		this.title = title;
		this.tNumber = tNumber;
		this.comment = comment;
		this.start_time = start_time;
		this.end_time = end_time;
		this.status = status;
	}

	public void setAddSurvey(List<SurveyBack> addSurvey) {
		this.addSurvey = addSurvey;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
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

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int gettNumber() {
		return tNumber;
	}

	public void settNumber(int tNumber) {
		this.tNumber = tNumber;
	}




	

	
	
	

}
