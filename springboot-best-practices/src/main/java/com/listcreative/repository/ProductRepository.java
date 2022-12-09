package com.listcreative.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.listcreative.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
   // Product findBySupplierCode(String supplierCode);
}
