package com.subash.product_jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subash.product_jwt.model.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
