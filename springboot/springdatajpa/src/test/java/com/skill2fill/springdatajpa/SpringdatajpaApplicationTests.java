package com.skill2fill.springdatajpa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.skill2fill.springdatajpa.entities.Student;
import com.skill2fill.springdatajpa.repository.StudentRepository;

@SpringBootTest
class SpringdatajpaApplicationTests {
	
	@Autowired
	private StudentRepository studentRepository;

	@Test
	void testStudent() {
		Student st = new Student();
		st.setName("Pujitha");
		st.setTestscore(100);
		studentRepository.save(st);
		
		Student saveStudent= studentRepository.findById(0l).get();
		assertNotNull(saveStudent);
	}

}
