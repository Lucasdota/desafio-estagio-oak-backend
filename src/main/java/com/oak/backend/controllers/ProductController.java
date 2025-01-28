package com.oak.backend.controllers;

import com.oak.backend.dtos.ProductDTO;
import com.oak.backend.entities.Product;
import com.oak.backend.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    ResponseEntity<Product> create(@RequestBody ProductDTO data) {
        return ResponseEntity.ok(productService.create(data));
    }

    @GetMapping
    ResponseEntity<List<Product>> list() {
        return ResponseEntity.ok(productService.list());
    }

    @PostMapping("/{id}")
    ResponseEntity<Product> update(@PathVariable Long id) {
        return ResponseEntity.ok(productService.update(id));
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id) {
        productService.delete(id);
    }
}
