package com.java.applications.questionbank.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.java.applications.questionbank.entities.Question;
import com.java.applications.questionbank.vo.Criteria;
import com.java.applications.questionbank.vo.Questions;

@Component
public class QuestionBankDAO {

	@Autowired
	private QuestionBankRepository questionBankRepository;

	public Questions getQuestions(Criteria criteria) {
		Questions questions = new Questions();

		List<String> questionList = questionBankRepository.findByCriteria(criteria.getSkillId(),
				criteria.getSubSkillId(), criteria.getQuestionType().name(), criteria.getComplexity().name());

		questions.setQuestions(questionList);
		questions.setCriteria(criteria);

		return questions;
	}

	public Question saveQuestion(Question question) {
		Question savedQuestion = questionBankRepository.save(question);
		
		return savedQuestion;
	}
	public QuestionBankRepository getQuestionBankRepository() {
		return questionBankRepository;
	}

	public void setQuestionBankRepository(QuestionBankRepository questionBankRepository) {
		this.questionBankRepository = questionBankRepository;
	}
}
