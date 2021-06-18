package com.example.demo_timestore.repository;

import com.example.demo_timestore.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
  Category findCategoryById(long id);
}
