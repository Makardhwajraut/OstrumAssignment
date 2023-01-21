package com.ostrumtech.Product.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ostrumtech.Product.model.ProductModel;

@Repository
public interface ProductDao extends JpaRepository<ProductModel,Integer> {
	// ProductModel findByName(String name);

}
