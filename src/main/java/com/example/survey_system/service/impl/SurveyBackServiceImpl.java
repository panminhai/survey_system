package com.example.survey_system.service.impl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import com.example.survey_system.constants.RtnCode;
import com.example.survey_system.entity.SurveyBack;
import com.example.survey_system.repository.SurveyBackDao;
import com.example.survey_system.service.ifs.SurveyBackService;
import com.example.survey_system.vo.AddTitleRequest;
import com.example.survey_system.vo.AddTitleResponse;
import com.example.survey_system.vo.DeleteTitleRequest;
import com.example.survey_system.vo.DeleteTitleResponse;


@Service
public class SurveyBackServiceImpl implements SurveyBackService{

	@Autowired
	private SurveyBackDao backDao;
	
	
	@Override
	public AddTitleResponse addTitle(AddTitleRequest request) {

		// 日期輸入格式
		String dateFormat = "\\d{4}-\\d{2}-\\d{2}";
		
		String title = request.getTitle();
		String comment = request.getComment();
		String tStart = request.getStart_time();
		String tEnd = request.getEnd_time();
		int status = request.getStatus();		
		

		
		List<SurveyBack> survey = request.getAddSurvey();
		
		if(CollectionUtils.isEmpty(survey) && (!StringUtils.hasText(tStart) || !StringUtils.hasText(tEnd)
				|| !StringUtils.hasText(title))) {
			
			return new AddTitleResponse(RtnCode.CANNOT_EMPTY.getMessage());
		}
		
		
		//	無輸入日期: 用List"addSurvey"走預設流程	// 輸入日期: 直接變數設置
		if(!StringUtils.hasText(tStart) || !StringUtils.hasText(tEnd)) {
			
			//	預設流程(今天日期~7天後)	//status: 直接啟用	
			for(SurveyBack item : survey) {
				item.setStatus(1);
				// 標題一定要有, 狀態: 以生成時間為準啟用, 統計: 前端用(暫定)			
				if(!StringUtils.hasText(item.getTitle())) {
					
					return new AddTitleResponse(RtnCode.CANNOT_EMPTY.getMessage());
				}
				
			}
		
			backDao.saveAll(survey);
		}
		
		//	手動輸入日期流程	
		else {
			
//<<<<<<< HEAD
//=======
			//	日期格式規制	
			if(!tStart.matches(dateFormat) || !tEnd.matches(dateFormat)) {
				
				return new AddTitleResponse(RtnCode.DATEFORMAT_ERROR.getMessage());
			}
			
			//	localDate轉換器
			//	DateTimeFormatter: 將使用者輸入的日期字串解析為 LocalDate	
			LocalDate today = LocalDate.now();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	        LocalDate tStartLocal = LocalDate.parse(tStart, formatter);        
	        LocalDate tEndLocal = LocalDate.parse(tEnd, formatter);
	        
	        if(!tStartLocal.isBefore(tEndLocal)) {
	        	
	        	return new AddTitleResponse(RtnCode.START_END_DATE.getMessage());
	        }
	        
	        // 開始日期為今日: 啟用
	        if(tStartLocal.isEqual(today)) {
	        	
	        	status = 1;
				backDao.addTitleWithStatus(title, comment, status, tStartLocal, tEndLocal);
	        	return new AddTitleResponse("問卷已啟用");

	        	
	        }

	        else if(tStartLocal.isBefore(today)){
	        	
	        	status = 2;
				backDao.addTitleWithStatus(title, comment, status, tStartLocal, tEndLocal);
	        	return new AddTitleResponse("問卷已結束");
	        }

	        // 開始日期為今日之後: 未開啟
	        else {
	        	
				backDao.addTitleWithStatus(title, comment, status, tStartLocal, tEndLocal);
	        	return new AddTitleResponse("問卷未開啟");

	        }
//>>>>>>> addTitle
		}
		
		
		return new AddTitleResponse(RtnCode.SUCCESSFUL.getMessage());

	}
//<<<<<<< HEAD


	@Override
	public DeleteTitleResponse deleteTitle(DeleteTitleRequest request) {

		List<Integer> surveyNumber = request.getSurveyNumber();
		
		//	沒選擇刪除對象: 不做任何動作	
		if(CollectionUtils.isEmpty(surveyNumber)) {
			
			return new DeleteTitleResponse ("Nothing to Delete!");
		}
		
		for(Integer item : surveyNumber) {
		
			Optional<SurveyBack> op = backDao.findById(item);
			
			//	資料庫找到對應之問卷
			if(op.isPresent()) {
				
				backDao.deleteById(item);	
			}
			else {
				return new DeleteTitleResponse(RtnCode.NOT_FOUND.getMessage());
			}

			
		}
		
		return new DeleteTitleResponse(RtnCode.SUCCESSFUL.getMessage());
	}



}
//=======
//}
//>>>>>>> addTitle
