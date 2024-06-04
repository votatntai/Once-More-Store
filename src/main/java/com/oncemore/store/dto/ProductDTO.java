package com.oncemore.store.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class ProductDTO {
    private UUID id;
    private String name;
    private BigDecimal price;
    private String url;
    private String description;
    private int quantity;

    public ProductDTO(UUID id, String name, BigDecimal price, String url) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.url = url;
    }
}