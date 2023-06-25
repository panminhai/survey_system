package com.example.survey_system;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.CollectionUtils;

import com.example.survey_system.entity.SurveyBack;
import com.example.survey_system.repository.SurveyBackDao;
import com.example.survey_system.service.ifs.SurveyBackService;
import com.example.survey_system.vo.SearchTitleRequest;

@SpringBootTest(classes = SurveySystemApplication.class)
public class SurveyTest {
	
	@Autowired
	private SurveyBackService backService;
	
	@Autowired
	private SurveyBackDao backDao;
	
	private SearchTitleRequest request;
	
	@Test
	public void searchTitle() {
		
		String inputName = "the survey";
		
		request.setTitleName(inputName);
//		
//		request.getTitleName(a);
		
		backService.searchTitle(request);
		
	}
	
	@Test
	public void searchDate() {
		
		String tStart = "2023-07-01";
		String tEnd = "2023-07-15";
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate tStartLocal = LocalDate.parse(tStart, formatter);        
        LocalDate tEndLocal = LocalDate.parse(tEnd, formatter);
 
		
		List<SurveyBack> result = backDao.findByTitleTime(tStartLocal, tEndLocal);
		
		if(!CollectionUtils.isEmpty(result)) {
			
			System.out.println("result is exists!!");
		}
		else {
			System.out.println("result is null!!");

		}

	}


}
