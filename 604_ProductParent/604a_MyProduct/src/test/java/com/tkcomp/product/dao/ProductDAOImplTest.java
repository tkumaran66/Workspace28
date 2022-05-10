package com.tkcomp.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tkcomp.product.dto.Product;

public class ProductDAOImplTest {

	@Test
	public void createShouldCreateProduct() {
		ProductDAO dao = new ProductDAOImpl();
		Product product = new Product();
		product.setId(1);
		product.setName("IPhone");
		product.setPrice(8000);
		product.setDesc("Nice phone");
		dao.create(product);

		product.setId(2);
		product.setName("MI");
		product.setPrice(5000);
		product.setDesc("Good phone");
		dao.create(product);
		
		Product result = dao.read(2); 
		assertNotNull(result);
		assertEquals("MI", result.getName());
	}

}
