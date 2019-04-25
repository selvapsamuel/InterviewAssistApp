package com.java.applications.questionbank.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Question")
public class Question {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	
	
}
