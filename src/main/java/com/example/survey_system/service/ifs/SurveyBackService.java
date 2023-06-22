package com.example.survey_system.service.ifs;

import com.example.survey_system.vo.AddTitleRequest;
import com.example.survey_system.vo.AddTitleResponse;
import com.example.survey_system.vo.DeleteTitleRequest;
import com.example.survey_system.vo.DeleteTitleResponse;

public interface SurveyBackService {
	
	public AddTitleResponse addTitle(AddTitleRequest request);
	
	public DeleteTitleResponse deleteTitle(DeleteTitleRequest request);
	
		
	
	
}
