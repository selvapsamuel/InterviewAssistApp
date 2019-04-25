package com.java.applications.questionbank.vo;

public class Criteria {

	private int skillId;
	private int subSkillId;
	private Type questionType;
	private Complexity complexity;
	private String tags;
	
	public int getSkillId() {
		return skillId;
	}
	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}
	public int getSubSkillId() {
		return subSkillId;
	}
	public void setSubSkillId(int subSkillId) {
		this.subSkillId = subSkillId;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public Type getQuestionType() {
		return questionType;
	}
	public void setQuestionType(Type questionType) {
		this.questionType = questionType;
	}
	public Complexity getComplexity() {
		return complexity;
	}
	public void setComplexity(Complexity complexity) {
		this.complexity = complexity;
	}
	
	
	
	
}
