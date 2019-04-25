package com.java.applications.questionbank.vo;

import java.util.List;

public class Questions {

	private List<String> questions;
	private Criteria criteria;
	
	
	public Criteria getCriteria() {
		return criteria;
	}
	public void setCriteria(Criteria criteria) {
		this.criteria = criteria;
	}
	public List<String> getQuestions() {
		return questions;
	}
	public void setQuestions(List<String> questions) {
		this.questions = questions;
	}
	
	
	
}
