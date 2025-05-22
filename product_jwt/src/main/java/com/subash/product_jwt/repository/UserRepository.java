package com.subash.product_jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subash.product_jwt.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    Optional<User> findByMobile(String mobile);
    boolean existsByEmail(String email);
    boolean existsByMobile(String mobile);
}
