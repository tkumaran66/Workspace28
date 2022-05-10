package com.tkcomp.product.bo;

import com.tkcomp.product.dao.ProductDAO;
import com.tkcomp.product.dao.ProductDAOImpl;
import com.tkcomp.product.dto.Product;

public class ProductBOImpl implements ProductBO {
	
	private static ProductDAO dao = new ProductDAOImpl();
	
	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
