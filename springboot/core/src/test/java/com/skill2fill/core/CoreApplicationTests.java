package com.skill2fill.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.skill2fill.core.services.PaymentService;
import com.skill2fill.core.services.PaymentServiceImpl;

@SpringBootTest
class CoreApplicationTests {
	
	@Autowired
	PaymentServiceImpl paymentService;
	
	@Test
	void testDependencyInjection() {
		assertNotNull(paymentService);
	}

	@Test
	void testAddition() {
		assertEquals(paymentService.addition(1, 2),3);
	}
	

}
