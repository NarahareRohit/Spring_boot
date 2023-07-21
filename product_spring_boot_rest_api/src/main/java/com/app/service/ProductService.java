package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.ProductDao;
import com.app.pojos.Product;

@Service
@Transactional
public class ProductService implements ProductServiceInterface{
	public ProductService() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private ProductDao pdao;

	@Override
	public List<Product> getAllProduct() {
		return pdao.findAll();
	}
	

	@Override
	public Product addProduct(Product p) {
		return pdao.save(p);
	}
	
	
	
}
