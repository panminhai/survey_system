package com.example.survey_system.service.ifs;

import com.example.survey_system.vo.AddUserInfoRequest;
import com.example.survey_system.vo.AddUserInfoResponse;
import com.example.survey_system.vo.ShowAllInfoRequest;
import com.example.survey_system.vo.ShowAllInfoResponse;
import com.example.survey_system.vo.ShowUserInfoRequest;
import com.example.survey_system.vo.ShowUserInfoResponse;

public interface UserInfoService {
	
	public AddUserInfoResponse addSurveyInfo(AddUserInfoRequest request);
	
	public ShowUserInfoResponse showWriterDate(ShowUserInfoRequest request);
	
	// γ‘δ: –β™Ι‰ρι^χ”\(“U›lΪΧ‘u), —p“U›l–Ό‹rq	
	public ShowAllInfoResponse showWriterInfo(ShowAllInfoRequest request);
	
	
	
	
}
