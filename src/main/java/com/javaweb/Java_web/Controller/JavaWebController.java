package com.javaweb.Java_web.Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Controller
class ProductController {
    @GetMapping("/")
    public String getProducts(Model model) {
        List<String> products = List.of("Cà phê đen", "Cà phê sữa", "Trà xanh", "Sinh tố bơ");
        model.addAttribute("products", products);
        return "products";
    }
}