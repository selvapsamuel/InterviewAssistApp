package com.java.applications.questionbank.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.applications.questionbank.service.QuestionBankService;
import com.java.applications.questionbank.vo.Complexity;
import com.java.applications.questionbank.vo.Criteria;
import com.java.applications.questionbank.vo.Type;
import com.java.applications.questionbank.vo.Questions;

@Controller
public class QuestionBankController {

	@Autowired
	private QuestionBankService questionBankService;

	@GetMapping(path = "/questions", consumes = "application/json", produces = "application/json")
	public @ResponseBody Questions getQuestions(@RequestParam int skillId, @RequestParam int subSkillId,
			@RequestParam String type, @RequestParam String complexity, @RequestParam String tags) {

		Criteria criteria = new Criteria();
		criteria.setSkillId(skillId);
		criteria.setSubSkillId(subSkillId);
		criteria.setQuestionType(Type.valueOf(type));
		criteria.setComplexity(Complexity.valueOf(complexity));
		criteria.setTags(tags);
		
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
