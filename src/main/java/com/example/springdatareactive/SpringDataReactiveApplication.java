package com.example.springdatareactive;

import com.example.springdatareactive.loader.ProductLoader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDataReactiveApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringDataReactiveApplication.class, args);
        ProductLoader productLoader = context.getBean(ProductLoader.class);
        productLoader.load();
    }

}
