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
	
	/*
	 * è“®—A“ü“úŠú
	 */
	private String title;
	
	//	‘O’[: i˜Ò“I‘—¿çz¬jasonŠi®
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private String start_time;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private String end_time;
	
	
	public AddTitleRequest() {
		super();
	}

	public AddTitleRequest(List<SurveyBack> addSurvey) {
		super();
		this.addSurvey = addSurvey;
	}
	
	

	public AddTitleRequest(String title, String start_time, String end_time) {
		super();
		this.title = title;
		this.start_time = start_time;
		this.end_time = end_time;
	}

	public List<SurveyBack> getAddSurvey() {
		return addSurvey;
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
	
	
	

}
