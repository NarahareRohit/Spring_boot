package com.app.service;

import java.util.List;

import com.app.pojos.Product;

public interface ProductServiceInterface {
	List<Product> getAllProduct() ;
	Product addProduct(Product p);
}
