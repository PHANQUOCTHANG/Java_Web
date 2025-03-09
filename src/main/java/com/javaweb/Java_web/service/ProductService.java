package com.javaweb.Java_web.service;

import com.javaweb.Java_web.dto.ProductDTO;
import com.javaweb.Java_web.entity.ProductEntity;
import com.javaweb.Java_web.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    //[GET] get all product .
    public List<ProductEntity> listProduct() {
        return productRepository.findAll() ;
    }

    //[GET] edit product
    public ProductEntity editProduct(String productId) {
        return productRepository.findById(productId).orElseThrow(() -> new RuntimeException("Not found"));
    }

    //[GET] detail product
    public ProductEntity detailProduct(String productId) {
        return productRepository.findById(productId).orElseThrow(() -> new RuntimeException("Not found")) ;
    }

    //[POST] create Product
    public ProductEntity createProduct(ProductDTO productDTO) {
        ProductEntity product = new ProductEntity();
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product.setStock(productDTO.getStock());
        return productRepository.save(product) ;
    }
}
