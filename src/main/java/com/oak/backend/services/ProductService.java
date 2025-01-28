package com.oak.backend.services;

import com.oak.backend.dtos.ProductDTO;
import com.oak.backend.entities.Product;
import com.oak.backend.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product create(ProductDTO data) {
        Product product = new Product(data.name(), data.description(), data.price());
        return productRepository.save(product);
    }

    public List<Product> list() {
        return productRepository.findAll();
    }

    public Product update(Long id) {
        Optional<Product> product = productRepository.findById(id);
        if (product.isEmpty()) return null;
        product.get().toggleAvailable();
        productRepository.save(product.get());
        return product.get();
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
