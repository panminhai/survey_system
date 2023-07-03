package com.example.survey_system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.survey_system.entity.BackQuestion;

public interface BackQuestionDao extends JpaRepository <BackQuestion, Integer>{

	@Transactional
	@Modifying
	@Query(value = "insert into survey_question(question,options,category,be_write)" + 
	"select :inputQuestion, :inputOptions, :inputCategory, :inputBeWrite", nativeQuery = true)
	public int addQuestion(
			@Param("inputQuestion") String inputQuestion,
			@Param("inputOptions") String inputOptions,
			@Param("inputCategory")String inputCategory,
			@Param("inputBeWrite")boolean inputBeWrite);
	
	
//	public int addQuestionSingleOption();
		
	
	
}
