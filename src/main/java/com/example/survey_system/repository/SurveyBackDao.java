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
	@Query(value = "insert into survey_title(title,comment,start_time,end_time) " +
			" select :inputTitle, :inputComment, :inputStartTime, :inputEndTime ", nativeQuery = true)
	public int addSurveyTitle(
			@Param("inputTitle") String inputTitle,
			@Param("inputComment") String inputComment,
			@Param("inputStartTime") LocalDate tStartLocal,
			@Param("inputEndTime") LocalDate tEndLocal);
	
	
	@Transactional
	@Modifying
	@Query(value = "insert into survey_title(title,comment,status,start_time,end_time) " +
			" select :inputTitle, :inputComment, :inputStatus, :inputStartTime, :inputEndTime ", nativeQuery = true)
	public int addTitleWithStatus(
			@Param("inputTitle") String inputTitle,
			@Param("inputComment") String inputComment,
			@Param("inputStatus") int inputStatus,
			@Param("inputStartTime") LocalDate tStartLocal,
			@Param("inputEndTime") LocalDate tEndLocal);
	
	
}
