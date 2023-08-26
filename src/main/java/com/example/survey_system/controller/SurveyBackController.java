package com.example.survey_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.survey_system.service.ifs.SurveyBackService;
import com.example.survey_system.vo.AddTitleRequest;
import com.example.survey_system.vo.AddTitleResponse;
import com.example.survey_system.vo.DeleteTitleRequest;
import com.example.survey_system.vo.DeleteTitleResponse;
import com.example.survey_system.vo.SearchTitleRequest;
import com.example.survey_system.vo.SearchTitleResponse;
import com.example.survey_system.vo.ShowAllInfoResponse;
import com.example.survey_system.vo.ShowAllResponse;
import com.example.survey_system.vo.WriterSurveyRequest;
import com.example.survey_system.vo.WriterSurveyResponse;


@RestController
@CrossOrigin
public class SurveyBackController {
    
	@Autowired
	private SurveyBackService surveyBackService;
	
	

	@PostMapping(value = "add_title")
	public AddTitleResponse addTitle(@RequestBody AddTitleRequest request) {
		
		return surveyBackService.addTitle(request);
	}
	
	@PostMapping(value = "delete_title")
	public DeleteTitleResponse deleteTitle(@RequestBody DeleteTitleRequest request) {
		
		return surveyBackService.deleteTitle(request);
	}
	
	@PostMapping(value = "search_title")
	public SearchTitleResponse searchTitle(@RequestBody SearchTitleRequest request) {
		
		return surveyBackService.searchTitle(request);
	}
	
	@PostMapping(value = "search_date")
	public SearchTitleResponse searchDate(@RequestBody SearchTitleRequest request) {
		
		return surveyBackService.searchDate(request);
	}
	
	@PostMapping(value = "show_all_survey")
	public ShowAllResponse showAllSurvey() {
		
		return surveyBackService.showAllSurvey();
	}
	
	@PostMapping(value = "show_writer_survey")
	public WriterSurveyResponse showWriterSurvey(@RequestBody WriterSurveyRequest request) {
		
		return surveyBackService.showWriterSurvey(request);
	
	}
	
}
