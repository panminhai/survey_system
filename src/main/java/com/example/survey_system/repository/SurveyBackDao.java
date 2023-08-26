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
import com.example.survey_system.entity.UserInfo;

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
	@Query(value = "insert into survey_title(title,t_number,comment,status,start_time,end_time) " +
			" select :inputTitle, :inputTNumber, :inputComment, :inputStatus, :inputStartTime, :inputEndTime ", nativeQuery = true)
	public int addTitleWithStatus(
			@Param("inputTitle") String inputTitle,
			@Param("inputTNumber") int inputTNumber,
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
	
	/*
	 * 用標題明找對應編號(t_number)	
	 */
	@Query(value = "select new SurveyBack(s.t_number) from SurveyBack s " + 
	"where s.title = :inputTitle")
	public List<SurveyBack> findTNumberByTitle(
			@Param("inputTitle") String inputTitle);
	
	
	/*	用t_number查詢寫過問券的填寫人(UserInfo表單) */
	//	nativeQuery為預設(false): 搜尋(Query)時欄位名以entity為主(取部分資料時也需要專門的建構式)
	//	建構式(new UserInfo): 在entity內生成一個符合欲取得參數的建構式
	@Query(value = "select new UserInfo(u.userName, u.write_time) from UserInfo u " + 
	"where u.t_number = :inputTNum")
	public List<UserInfo> findWriterSurvey(
			@Param("inputTNum") int TNum);
	

	
	//	用t_number查詢填寫人資訊(user_info表單)
	//	nativeQuery為預設(false): 欄位名以entity為主
	//	建構式(new UserInfo): 在entity內生成一個符合欲取得參數的建構式
//	@Query(value = "select new UserInfo(u.userName, u.phone, u.mail, u.age, u.write_time) from UserInfo u " + 
//	"where u.t_number = :inputTNum")
//	public List<UserInfo> findUserInfo(
//			@Param("inputTNum") int TNum);
	
//	問卷開放時，不能刪除題目(survey_question)的Dao
//	@Query(value = "select start_time, end_time from survey_title")
//	
//	
//	public List<SurveyBack> findEndTimebyNumber(Integer Num);
//	
	
	


	
	
}
