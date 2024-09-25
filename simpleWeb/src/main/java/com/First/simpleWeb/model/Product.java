package com.First.simpleWeb.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private int productId;
    private String productName;
    private int productPrice;
}