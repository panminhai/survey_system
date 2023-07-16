package com.example.survey_system.repository;

import java.time.LocalDateTime;
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
public interface UserInfoDao extends JpaRepository <UserInfo, Integer> {
	
	
//	ñ‚åîìUõçäÆå„ëóèoå„óßçèó¨ì¸éëóøå…
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
	
	
//	@Query(select new com.example.survey_system.vo.)
//	public List<SurveyInfo> findAllSurveyUserInfo();

}


