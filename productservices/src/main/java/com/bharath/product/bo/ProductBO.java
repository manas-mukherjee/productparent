package com.bharath.product.bo;

import com.bharath.product.dto.Product;

public interface ProductBO {
	public void create(Product product);
	public Product find(int productid);
}
