package com.example.demo_timestore.service.Impl;

import com.example.demo_timestore.entity.Batch;
import com.example.demo_timestore.model.BatchResponse;
import com.example.demo_timestore.repository.BatchRepository;
import com.example.demo_timestore.service.BatchService;
import com.example.demo_timestore.utils.Enums;
import com.example.demo_timestore.utils.Pagination;
import com.example.demo_timestore.utils.ResponseDataPagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BatchServiceImpl implements BatchService {
  @Autowired
  BatchRepository batchRepository;

  @Override
  public List<Batch> findAllBatch() {
    return batchRepository.findAll();
  }

  @Override
  public ResponseDataPagination getListBatchOfOption(String lotCode, Long expireDate, Long importDate, int page,
    int size) throws Exception {
    int pageReq = page >= 1 ? page - 1 : page;
    Pageable pageable = PageRequest.of(pageReq, size);
    System.out.println(expireDate+"expire");
    Page<Batch> batchPage = batchRepository.getListBatchOfOption(lotCode, expireDate,importDate,pageable);
    List <Batch> batchList = batchPage.getContent();
    List <BatchResponse> list = new ArrayList<>();
    for (Batch b: batchList) {
      BatchResponse res = new BatchResponse();
      res.setId(b.getId());
      res.setLotCode(b.getBatchCode());
      res.setExpireDate(b.getExpiryDate());
      res.setMenuQuantity(b.getMenuQuantity());
      res.setPurchasePrice(b.getImportPrice());
      res.setImportDate(b.getImportDate());
      list.add(res);
    }
    ResponseDataPagination responseDataPagination = new ResponseDataPagination();
    Pagination pagination = new Pagination();
    responseDataPagination.setData(list);
    pagination.setCurrentPage(page);
    pagination.setPageSize(size);
    pagination.setTotalPage(batchPage.getTotalPages());
    pagination.setTotalRecords(Integer.parseInt(String.valueOf(batchPage.getTotalElements())));
    responseDataPagination.setStatus(Enums.ResponseStatus.SUCCESS.getStatus());
    responseDataPagination.setPagination(pagination);
    return responseDataPagination;
  }
}
