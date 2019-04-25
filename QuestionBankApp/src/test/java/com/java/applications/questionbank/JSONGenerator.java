package com.java.applications.questionbank;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.applications.questionbank.vo.Complexity;
import com.java.applications.questionbank.vo.Criteria;
import com.java.applications.questionbank.vo.QuestionType;

public class JSONGenerator {

	public static void main(String[] args) {
		JSONGenerator generator = new JSONGenerator();
		generator.run();
	}

	private void printJson(Object object) {

		ObjectMapper mapper = new ObjectMapper();

		try {
			// Convert object to JSON string and pretty print
			String jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
			System.out.println(jsonInString);
			System.out.println();

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void run() {
		Criteria criteria = createCriteria();

		System.out.println("Criteria..\n");
		printJson(criteria);
	}

	private Criteria createCriteria() {
		Criteria criteria = new Criteria();
		criteria.setSkillId(1);
		criteria.setSubSkillId(2);
		criteria.setComplexity(Complexity.HIGH);
		criteria.setQuestionType(QuestionType.THEORETICAL);
		criteria.setTags("client=Intuit,team=QBO");
		return criteria;
	}
}
