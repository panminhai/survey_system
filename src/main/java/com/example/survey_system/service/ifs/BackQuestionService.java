package com.example.survey_system.service.ifs;

import javax.servlet.http.HttpSession;

import com.example.survey_system.vo.AddQuestionRequest;
import com.example.survey_system.vo.AddQuestionResponse;

public interface BackQuestionService {

	public AddQuestionResponse addQuestion(AddQuestionRequest request);
}
