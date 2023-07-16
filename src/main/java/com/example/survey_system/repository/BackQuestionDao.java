package com.example.survey_system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.survey_system.entity.BackQuestion;

@Repository
public interface BackQuestionDao extends JpaRepository <BackQuestion, Integer>{

	@Transactional
	@Modifying
	@Query(value = "insert into survey_question(question,q_number,options,category,be_write)" + 
	"select :inputQuestion, :inputQNumber, :inputOptions, :inputCategory, :inputBeWrite", nativeQuery = true)
	public int addQuestion(
			@Param("inputQuestion") String inputQuestion,
			@Param("inputQNumber") int QNumber,
			@Param("inputOptions") String inputOptions,
			@Param("inputCategory")String inputCategory,
			@Param("inputBeWrite")boolean inputBeWrite);
	
	
//	public int addQuestionSingleOption();
		
	@Transactional
	@Modifying
	@Query(value = "update survey_question sq set sq.question = :newQuestion, sq.options = :newOptions, sq.category = :newCategory, sq.be_write = :newBeWrite where sq.number = :newNumber", nativeQuery = true)
	public int updateQuestionbByNumber(
			@Param("newNumber") int inputNumber,
			@Param("newQuestion") String inputQuestion,
			@Param("newOptions") String inputOptions,
			@Param("newCategory") String inputCategory,
			@Param("newBeWrite") boolean inputBeWrite);
	
	
//	public List<String> findoptionsByqNumber(List<Integer> tNumber);
	
}
