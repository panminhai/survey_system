package com.example.survey_system.service.ifs;

import javax.servlet.http.HttpSession;

import com.example.survey_system.vo.AddQuestionRequest;
import com.example.survey_system.vo.AddQuestionResponse;
import com.example.survey_system.vo.DeleteQuestionRequest;
import com.example.survey_system.vo.DeleteQuestionResponse;

public interface BackQuestionService {

	public AddQuestionResponse addQuestion(AddQuestionRequest request);

	public DeleteQuestionResponse deleteQuestion(DeleteQuestionRequest request);
	

}
