package com.example.survey_system.service.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.survey_system.constants.RtnCode;
import com.example.survey_system.entity.BackQuestion;
import com.example.survey_system.entity.SurveyBack;
import com.example.survey_system.repository.BackQuestionDao;
import com.example.survey_system.repository.SurveyBackDao;
import com.example.survey_system.service.ifs.BackQuestionService;
import com.example.survey_system.vo.AddQuestionRequest;
import com.example.survey_system.vo.AddQuestionResponse;
import com.example.survey_system.vo.DeleteQuestionRequest;
import com.example.survey_system.vo.DeleteQuestionResponse;
import com.example.survey_system.vo.UpdateQuestionRequest;
import com.example.survey_system.vo.UpdateQuestionResponse;


@Service
public class BackQuestionServiceImpl implements BackQuestionService{

	@Autowired
	private SurveyBackDao backDao;
	
	@Autowired
	private BackQuestionDao questionDao;
	
	@Override
	public AddQuestionResponse addQuestion(AddQuestionRequest request) {

		String question = request.getQuestion();
		String options = request.getOptions();
		String type = request.getCategory();
		int qNum = request.getqNumber();
		
	//----------------------------------------------
		// ï™äÑéöã¯ë™éé
//		String[] divOption = options.split(";\\s");
//		for(String item: divOption) {
//			System.out.println("ëIçÄ:" + item);
//		}
		
	//-----------------------------------------------
		if(!StringUtils.hasText(question) || !StringUtils.hasText(options)) {
			
			return new AddQuestionResponse(RtnCode.NOT_ENOUGH.getMessage());
		}
		
		if(request.isBe_write() == true) {
			 
			questionDao.addQuestion(question, qNum, options, type, true);
		}
		
		else {

			questionDao.addQuestion(question, qNum, options, type, false);			
		}
		
		
		
		return new AddQuestionResponse(RtnCode.SUCCESSFUL.getMessage()) ;
	}

	@Override
	public DeleteQuestionResponse deleteQuestion(DeleteQuestionRequest request) {
		
		LocalDate today = LocalDate.now();
		List<Integer> questionNum = request.getQuestionNumber();
		
		for(Integer item: questionNum) {
			
			
//			List<SurveyBack> res = backDao.findEndTimebyNumber(item);
			
			Optional<BackQuestion> op = questionDao.findById(item);
			
			if(op.isPresent()) {
				questionDao.deleteById(item);
			}
			
			else {
				return new DeleteQuestionResponse(RtnCode.NOT_FOUND.getMessage());
			}


		}
		
		
		return new DeleteQuestionResponse(RtnCode.SUCCESSFUL.getMessage());
	}

	@Override
	public UpdateQuestionResponse updateQuestion(UpdateQuestionRequest request) {

		String question = request.getQuestion();
		String options = request.getOptions();
		String type = request.getCategory();
		int number = request.getNumber();
		
		if(number == 0 || number < 0) {
			return new UpdateQuestionResponse(RtnCode.CANNOT_EMPTY.getMessage());
		}
		
		Optional<BackQuestion> res = questionDao.findById(number);
		
		if(res.isEmpty()) {
			
			return new UpdateQuestionResponse(RtnCode.NOT_FOUND.getMessage());
		}
		
		if(request.isBe_write() == true) {
			
			questionDao.updateQuestionbByNumber(number, question, options, type, true);

		}
		else {

			questionDao.updateQuestionbByNumber(number, question, options, type, false);
			
		}
		
		
		return new UpdateQuestionResponse(RtnCode.SUCCESSFUL.getMessage());
	}

}
