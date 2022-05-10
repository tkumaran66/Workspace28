package com.tkcomp.product.bo;

import com.tkcomp.product.dto.Product;

public interface ProductBO {
	
	void create(Product product);

	Product findProduct(int id);
}
