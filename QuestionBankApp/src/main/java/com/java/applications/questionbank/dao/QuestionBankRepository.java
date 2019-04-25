package com.java.applications.questionbank.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.java.applications.questionbank.entities.Question;

@Repository
public interface QuestionBankRepository extends CrudRepository<Question, Integer> {
	@Query("SELECT q.questionText FROM Question q WHERE q.skillId=?1 and q.subSkillId=?2  and q.type=?3 and q.complexity=?4")
	List<String> findByCriteria(int skillId, int subSkillId,
				String type, String complexity);
}
