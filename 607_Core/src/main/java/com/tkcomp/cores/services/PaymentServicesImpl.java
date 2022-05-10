package com.tkcomp.cores.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tkcomp.cores.dao.PaymentDAO;

@Service
public class PaymentServicesImpl implements PaymentService {
	@Autowired
	private PaymentDAO dao;

	public PaymentDAO getDao() {
		return dao;
	}

	public void setDao(PaymentDAO dao) {
		this.dao = dao;
	}
}
