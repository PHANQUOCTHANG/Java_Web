package com.javaweb.Java_web.controller;


import com.javaweb.Java_web.dto.ProductDTO;
import com.javaweb.Java_web.entity.ProductEntity;
import com.javaweb.Java_web.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService ;

    //[GET] all product .
    @GetMapping
    public List<ProductEntity> listProduct() {
        return productService.listProduct() ;
    }

    //[GET] edit product .
    @GetMapping("/edit/{productId}")
    public ProductEntity editProduct(@PathVariable("productId") String productId) {
        return productService.editProduct(productId) ;
    }

    //[GET] detail product .
    @GetMapping("/detail/{productId}")
    public ProductEntity detailProduct(@PathVariable("productId") String productId) {
        return productService.detailProduct(productId) ;
    }


    //[POST] create product .
    @PostMapping("/create")
    public ProductEntity createProduct (@RequestBody ProductDTO productDTO) {
        return productService.createProduct(productDTO) ;
    }

}
