package com.java.applications.questionbank.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.applications.questionbank.service.QuestionBankService;
import com.java.applications.questionbank.vo.Criteria;
import com.java.applications.questionbank.vo.Questions;

@Controller
public class QuestionBankController {

	@Autowired
	private QuestionBankService questionBankService;

	@PostMapping(path = "/questions", consumes = "application/json", produces = "application/json")
	public @ResponseBody Questions getQuestions(@RequestBody Criteria criteria) {

		Questions questions = questionBankService.getQuestions(criteria);
		
		return questions;
	}

	public QuestionBankService getQuestionBankService() {
		return questionBankService;
	}

	public void setQuestionBankService(QuestionBankService questionBankService) {
		this.questionBankService = questionBankService;
	}
}
