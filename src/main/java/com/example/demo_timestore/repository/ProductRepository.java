package com.example.demo_timestore.repository;

import com.example.demo_timestore.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
