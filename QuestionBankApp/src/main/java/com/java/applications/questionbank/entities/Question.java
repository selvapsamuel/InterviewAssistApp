package com.java.applications.questionbank.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "QUESTION")
public class Question {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
    private int id;
	
	@Column(name="SKILLID")
	private int skillId;
	
	@Column(name="SUBSKILLID")
	private int subSkillId;
	
	@Column(name="QUESTIONTEXT")
	private String questionText;
	
	@Column(name="ANSWER")
	private String answer;
	
	@Column(name="TYPE")
	private String type;
	
	@Column(name="COMPLEXITY")
	private String complexity;
	
	@Column(name="TAGS")
	private String tags;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}


	public String getComplexity() {
		return complexity;
	}

	public void setComplexity(String complexity) {
		this.complexity = complexity;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}



	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
