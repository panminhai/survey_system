package com.example.survey_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.survey_system.service.ifs.BackQuestionService;
import com.example.survey_system.vo.AddQuestionRequest;
import com.example.survey_system.vo.AddQuestionResponse;
import com.example.survey_system.vo.DeleteQuestionRequest;
import com.example.survey_system.vo.DeleteQuestionResponse;
import com.example.survey_system.vo.UpdateQuestionRequest;
import com.example.survey_system.vo.UpdateQuestionResponse;

@RestController
@CrossOrigin
public class BackQuestionController {
	
	@Autowired
	private BackQuestionService backQuestionService;
	
	
	@PostMapping(value = "add_question")
	public AddQuestionResponse addQuestion(@RequestBody AddQuestionRequest request) {
		
		return backQuestionService.addQuestion(request);
	}
	
	
	@PostMapping(value = "del_question")
	public DeleteQuestionResponse deleteQuestion(@RequestBody DeleteQuestionRequest request) {
		
		return backQuestionService.deleteQuestion(request);
	}
	
	@PostMapping(value = "update_question")
	public UpdateQuestionResponse updateQuestion(@RequestBody UpdateQuestionRequest request) {
		
		return backQuestionService.updateQuestion(request);
	}
	
}
