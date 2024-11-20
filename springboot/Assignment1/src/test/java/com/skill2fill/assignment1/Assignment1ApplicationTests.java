package com.skill2fill.assignment1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.skill2fill.assignment1addition.Addition;

@SpringBootTest
class Assignment1ApplicationTests {

	@Autowired
	Addition addition;

	@Test
	void addition() {
		assertEquals(addition.add(2, 3),5);
	}

}
