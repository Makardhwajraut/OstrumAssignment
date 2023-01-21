package com.ostrumtech.Product.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ostrumtech.Product.dao.ProductDao;
import com.ostrumtech.Product.model.ProductModel;

@Service
public class ProductService {
	@Autowired
	private ProductDao productDao;

	String line = "";

	public void saveProduct() {
		try {
	 		BufferedReader br = new BufferedReader(new FileReader("src/main/resources/OstrumTech.csv"));
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				ProductModel p = new ProductModel();

				p.setName(data[0]);
				p.setPrice(data[1]);
				p.setQuantity(data[2]);
				productDao.save(p);
			}
		} catch (IOException e) {
			e.getStackTrace();
		}
	}

//	    public List<ProductModel> saveProducts(List<ProductModel> products) {
//	        return productDao.saveAll(products);
//	    }
//
//	    public List<ProductModel> getProducts() {
//	        return productDao.findAll();
//	    }
//
//	    public ProductModel getProductById(int id) {
//	        return productDao.findById(id).orElse(null);
//	    }
//
//	    public ProductModel getProductByName(String name) {
//	        return productDao.findByName(name);
//	    }
//
//	    public String deleteProduct(int id) {
//	    	productDao.deleteById(id);
//	        return "product removed !! " + id;
//	    }
//	    
//	    public ProductModel updateProduct(ProductModel product) {
//			
//	    	ProductModel existingproduct =productDao.findById(product.getId()).orElse(null);
//	    	existingproduct.setName(product.getName());
//	    	existingproduct.setPrice(product.getPrice());
//	    	existingproduct.setQuantity(product.getQuantity());
//	  
//	    	return productDao.save(existingproduct);		
//	    }
//	    

}
