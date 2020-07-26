package com.example.springdatareactive.repository.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Getter
@RequiredArgsConstructor
@Document(indexName = "product")
public class Product {
    @Id
    @Field(type = FieldType.Long)
    private final long productId;
    @Field(type = FieldType.Text)
    private final String productName;
}