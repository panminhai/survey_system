package com.example.survey_system.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.survey_system.entity.BackQuestion;
import com.example.survey_system.repository.SurveyBackDao;
import com.example.survey_system.service.ifs.BackQuestionService;
import com.example.survey_system.vo.AddQuestionRequest;
import com.example.survey_system.vo.AddQuestionResponse;


@Service
public class BackQuestionServiceImpl implements BackQuestionService{

	@Autowired
	private SurveyBackDao backDao;
	
	@Override
	public AddQuestionResponse addQuestion(AddQuestionRequest request) {

		String question = request.getQuestion();
		String option = request.getOption();
		String type = request.getCategory();
	
		List <BackQuestion> a = new ArrayList<>();
		
		for(BackQuestion item : a) {
			item.setQuestion(question);
			item.setCategory(type);
			
		}
		
		backDao.save(null);;
		
		return null;
	}

}
