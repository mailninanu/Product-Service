package com.example.ecom_project.controller;

import com.example.ecom_project.model.Product;
import com.example.ecom_project.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
@Autowired
    private ProductRepository productRepository;

@PostMapping("/addProduct")
public String saveProduct(@RequestBody Product product){
    productRepository.save(product);
    return "Added product of product id"+product.getId();

}
@GetMapping("/findAllProducts")
public List<Product> getListProduct(){
    return productRepository.findAll();
}
}
