package com.codewithmosh.store.dtos;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductDto {
    private long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Byte categoryId;
}
