package com.example.survey_system.service.ifs;

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

public interface SurveyBackService {
	
	public ShowAllResponse showAllSurvey();
	
	public AddTitleResponse addTitle(AddTitleRequest request);
	
	public DeleteTitleResponse deleteTitle(DeleteTitleRequest request);

	public SearchTitleResponse searchTitle(SearchTitleRequest request);

	public SearchTitleResponse searchDate(SearchTitleRequest request);

	//	γδ: βΙρι^χ\(θϋ¦UίβILl&ϊϊ), pβWθrqUl&ϊϊ
	public WriterSurveyResponse showWriterSurvey(WriterSurveyRequest request);

		
	
	
}
