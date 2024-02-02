package com.bvr.ecommdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bvr.ecommdemo.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>  {

}
