package com.example.survey_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.survey_system.service.ifs.SurveyBackService;
import com.example.survey_system.vo.AddTitleRequest;
import com.example.survey_system.vo.AddTitleResponse;


@RestController
@CrossOrigin
public class SurveyBackController {
    
	@Autowired
	private SurveyBackService surveyBackService;
	
	@PostMapping(value = "add_title")
	public AddTitleResponse addTitle(@RequestBody AddTitleRequest request) {
		
		return surveyBackService.addTitle(request);
	}
	
	
}