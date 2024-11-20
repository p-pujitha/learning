package com.skill2fill.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skill2fill.core.dao.PaymentDAO;

@Service
public class PaymentServiceImpl implements PaymentService{

	@Autowired
	private PaymentDAO dao;
	
	public int addition(int a, int b) {
		return a+b;
	}
}
