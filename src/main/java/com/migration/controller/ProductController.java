package com.migration.controller;

import com.migration.entity.Product;
import com.migration.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository repo;

    public ProductController(ProductRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Product save(@RequestBody Product p) {
        return repo.save(p);
    }

    @GetMapping
    public List<Product> getAll() {
        return repo.findAll();
    }
}