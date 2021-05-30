package com.example.demo_timestore.repository;

import com.example.demo_timestore.entity.Batch;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BatchRepository extends JpaRepository<Batch, Long> {
  @Query(value = "select b from Batch b where (b.batchCode = :lotCode or :lotCode is null or :lotCode ='') " +
    "and ( b.expiryDate = :expireDate or :expireDate is null) " +
    "and ( b.importDate = :importDate or :importDate is null)")
  Page<Batch> getListBatchOfOption(@Param("lotCode") String lotCode, @Param("expireDate") Long expDate,
    @Param("importDate") Long importDate, Pageable pageable);
}
