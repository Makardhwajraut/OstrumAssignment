package com.ostrumtech.Product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ostrumtech.Product.model.ProductModel;
import com.ostrumtech.Product.service.ProductService;
@RestController
public class ProductController {
	 @Autowired
	    private ProductService service;
	

	    @RequestMapping(path="feedProductData")
	    public void addProductDataInDB() {
	    	service.saveProduct();
	    }
//
//	    @PostMapping("/addProducts")
//	    public List<ProductModel> addProducts(@RequestBody List<ProductModel> products) {
//	        return service.saveProducts(products);
//	    }
//
//	    @GetMapping("/products")
//	    public List<ProductModel> findAllProducts() {
//	        return service.getProducts();
//	    }
//
//	    @GetMapping("/productById/{id}")
//	    public ProductModel findProductById(@PathVariable int id) {
//	        return service.getProductById(id);
//	    }
//
//	    @GetMapping("/product/{name}")
//	    public ProductModel findProductByName(@PathVariable String name) {
//	        return service.getProductByName(name);
//	    }
//
//	    @PutMapping("/update")
//	    public ProductModel updateProduct(@RequestBody ProductModel product) {
//	        return service.updateProduct(product);
//	    }
//
//	    @DeleteMapping("/delete/{id}")
//	    public String deleteProduct(@PathVariable int id) {
//	        return service.deleteProduct(id);
//	    }

}
