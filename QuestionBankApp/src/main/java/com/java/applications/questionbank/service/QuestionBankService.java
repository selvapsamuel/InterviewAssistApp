package com.java.applications.questionbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.applications.questionbank.dao.QuestionBankDAO;
import com.java.applications.questionbank.vo.Criteria;
import com.java.applications.questionbank.vo.Questions;

@Service
public class QuestionBankService {

	@Autowired
	private QuestionBankDAO questionBankDAO;

	public Questions getQuestions(Criteria criteria) {
		Questions questions = questionBankDAO.getQuestions(criteria);
		return questions;
	}

	public QuestionBankDAO getQuestionBankDAO() {
		return questionBankDAO;
	}

	public void setQuestionBankDAO(QuestionBankDAO questionBankDAO) {
		this.questionBankDAO = questionBankDAO;
	}
	
	
}
