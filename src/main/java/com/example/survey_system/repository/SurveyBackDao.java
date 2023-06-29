package com.example.survey_system.repository;

import java.time.LocalDate;
import java.util.List;

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
			//	@Param(欲變更值的欄位)		
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
	
	/*
	 * 問券搜尋(模糊搜尋)
	 */
	
	//	%name%: 所有包含"name"內容字串的文字集		// inputName: 輸入關鍵字
	@Query(value = "select * from survey_title where title like %:inputName%", nativeQuery = true)
	public List<SurveyBack> findByTitleLike(
			@Param("inputName") String inputName);
	
	
	//	where: 選取資料欄的篩選條件
	@Query(value = "select * from survey_title " + 
	"where start_time >= :inputSTime and end_time <= :inputETime", nativeQuery = true)
	public List<SurveyBack> findByTitleTime(
			@Param("inputSTime") LocalDate tStartLocal,
			@Param("inputETime") LocalDate tEndLocal);
	
	public List<SurveyBack> findAll();
	
	
}
