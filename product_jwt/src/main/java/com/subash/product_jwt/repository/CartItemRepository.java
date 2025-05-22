package com.subash.product_jwt.repository;

import com.subash.product_jwt.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}