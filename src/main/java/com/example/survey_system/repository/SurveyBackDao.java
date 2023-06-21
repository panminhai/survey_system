package com.example.survey_system.repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.survey_system.entity.SurveyBack;

@Repository
public interface SurveyBackDao extends JpaRepository <SurveyBack, Integer>{

	@Transactional
	@Modifying
	@Query(value = "insert into survey_title(title,start_time,end_time) " +
			" select :inputTitle, :inputStartTime, :inputEndTime ", nativeQuery = true)
	public int addSurveyTitle(
			//	@Param(欲變更值的欄位)		
			@Param("inputTitle") String inputTitle,
			@Param("inputStartTime") LocalDate inputTStart,
			@Param("inputEndTime") LocalDate inputTEnd);
	
	
}
