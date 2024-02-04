package com.bvr.ecommdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.bvr.ecommdemo.model.Product;
import com.bvr.ecommdemo.services.ProductService;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable("id") long productId) {
        return productService.getProductById(productId);
    }

    @PostMapping("/products")
    public String addProduct(Product product) {
        productService.addProduct(product);
        return "Product added successfully";

    }

    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable("id") long productId) {
        productService.deleteProduct(productId);
        return "Product deleted successfully";
    }



}
