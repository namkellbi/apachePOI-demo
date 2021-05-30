package com.example.demo_timestore.service;

import com.example.demo_timestore.entity.Batch;
import com.example.demo_timestore.utils.ResponseDataPagination;

import java.util.List;

public interface BatchService {
  List<Batch> findAllBatch();

  ResponseDataPagination getListBatchOfOption(String lotCode,Long expireDate, Long importDate, int page, int size) throws Exception;

}
