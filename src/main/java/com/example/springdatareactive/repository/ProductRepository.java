package com.example.springdatareactive.repository;

import com.example.springdatareactive.repository.model.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProductRepository extends ReactiveCrudRepository<Product, Long> {
}
