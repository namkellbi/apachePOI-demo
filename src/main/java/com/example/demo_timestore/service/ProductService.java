package com.example.demo_timestore.service;

import com.example.demo_timestore.model.ProductResponse;

import java.util.List;

public interface ProductService {
  List<ProductResponse> getListProducts(List<Long> listIdSelected) throws Exception ;
}
