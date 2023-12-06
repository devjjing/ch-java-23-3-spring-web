package com.example.chjava23springweb.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("products")
public record Product(
        String title,
        @Id
        String id,
        int price
) {
}
