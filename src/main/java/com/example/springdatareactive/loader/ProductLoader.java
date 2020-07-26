package com.example.springdatareactive.loader;

import com.example.springdatareactive.repository.ProductRepository;
import com.example.springdatareactive.repository.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
public class ProductLoader {
    private final ProductRepository productRepository;

    public void load() {
        List<Product> products = Arrays.asList(
                new Product(1L, "pizza"),
                new Product(2L, "bread")
        );
        productRepository.saveAll(products)
                .subscribe();
    }
}