package com.java.applications.questionbank.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.java.applications.questionbank.vo.Criteria;
import com.java.applications.questionbank.vo.Questions;

@Repository
public class QuestionBankDAO {

	public Questions getQuestions(Criteria criteria) {
		 Questions questions = new Questions();
		 List<String> questionlist = new ArrayList<>();
		 questionlist.add("what is polymorphism?");
		 questionlist.add("what is encapsulation?");
		 questionlist.add("what is inheritence?");
		 questionlist.add("Explain SOLID design principles");
		 
		 questions.setQuestions(questionlist);
		 questions.setCriteria(criteria);
		 
		return questions;
	}
}
