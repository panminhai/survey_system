package com.example.survey_system.repository;

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
			@Param("inputTitle") String inputTitle,
			@Param("inputStartTime") String inputtStart,
			@Param("inputEndTime") String inputtEnd);
	
	
}
