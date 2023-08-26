package com.example.survey_system.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.survey_system.entity.BackQuestion;
import com.example.survey_system.entity.SurveyBack;
import com.example.survey_system.entity.UserInfo;


@Repository
public interface UserInfoDao extends JpaRepository <UserInfo, Integer> {
	
	
//	問券填寫完後送出後立刻流入資料庫
//	@Transactional
//	@Modifying
//	@Query(value = "insert into survey_info(userName,surveyNum,write_time)" + 
//	"select :inputUserName, :inputSurveyNum, :inputWriteTime", nativeQuery=true)
//	public int addSurveyInfo(
//			@Param("inputUserName") String UserName,
//			@Param("inputSurveyNum") int SurveyNum,
//			@Param("inputWriteTime") LocalDateTime WriteTime);
	
	@Query(value = "select user_name, write_time from user_info", nativeQuery = true)
	public List<UserInfo> findUserNameAndWriteTime();
	
	@Query(value = "select * from user_info " + " where user_name = :inputUserName", nativeQuery = true)
	public List <UserInfo> finduserInfoByname(
			@Param("inputUserName")String userName);
	
	
	/*	用t_number查詢填寫人寫過的問券(survey_question表單) */
	//	nativeQuery為預設(false): 搜尋(Query)時欄位名以entity為主(取部分資料時也需要專門的建構式)
	//	建構式(new BackQuestion): 在entity內生成一個符合欲取得參數的建構式
	@Query(value = "select new BackQuestion(b.question, b.options) from BackQuestion b " + 
	"where b.qNumber = :inputTNum")
	public List<BackQuestion> findWriterQuestion(
			@Param("inputTNum") int TNum);
	
	

	
	
//	@Query(select new com.example.survey_system.vo.)
//	public List<SurveyInfo> findAllSurveyUserInfo();

}


