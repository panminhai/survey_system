package com.example.survey_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.survey_system.entity.BackQuestion;

public interface BackQuestionDao extends JpaRepository <BackQuestion, Integer>{

	@Transactional
	@Modifying
	@Query(value = "insert into survey_question(question,category)" + 
	"select :inputQuestion, :inputCategory", nativeQuery = true)
	public int addQuestion(
			@Param("inputQuestion") String inputQuestion,
			@Param("inputCategory")String inputCategory);
		
	
}
