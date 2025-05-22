package com.subash.product_jwt.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CartItemDTO {
    private Long id;
    private Long productId;
    private String productName;
    private String imageUrl;
    private Double actualPrice;
    private Double totalPrice;
    private Integer quantity;
}