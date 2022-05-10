package com.tkcomp.cores;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tkcomp.cores.services.PaymentService;
import com.tkcomp.cores.services.PaymentServicesImpl;

@SpringBootTest
class ApplicationTests {

	
	PaymentServicesImpl service;
	
	@Test
	void testDependencyInjection() {
		assertNotNull(service.getDao());
	}

}