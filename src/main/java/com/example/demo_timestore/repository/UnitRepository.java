package com.example.demo_timestore.repository;

import com.example.demo_timestore.entity.Unit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnitRepository extends JpaRepository<Unit, Long> {
  Unit findUnitById(long id);
}
