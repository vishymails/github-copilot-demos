package com.bvr.ecommdemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bvr.ecommdemo.model.Product;
import com.bvr.ecommdemo.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    //this class will call ProductRepository to perform CRUD operations

    @Autowired
    private ProductRepository productRepository;

    public Product getProductById(long productId) {
        return productRepository.findById(productId).get();
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(long productId) {
        productRepository.deleteById(productId);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

}
