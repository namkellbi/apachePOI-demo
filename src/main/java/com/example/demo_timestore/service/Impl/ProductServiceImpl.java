package com.example.demo_timestore.service.Impl;

import com.example.demo_timestore.entity.Category;
import com.example.demo_timestore.entity.Product;
import com.example.demo_timestore.entity.Unit;
import com.example.demo_timestore.model.ProductExportRequest;
import com.example.demo_timestore.model.ProductResponse;
import com.example.demo_timestore.repository.CategoryRepository;
import com.example.demo_timestore.repository.ProductRepository;
import com.example.demo_timestore.repository.UnitRepository;
import com.example.demo_timestore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
  @Autowired
  ProductRepository productRepository;

  @Autowired
  UnitRepository unitRepository;

  @Autowired
  CategoryRepository categoryRepository;

  @Override
  public List<ProductResponse> getListProducts(List<Long> listIdSelected) throws Exception {
    ProductExportRequest productExportRequest = new ProductExportRequest();
    productExportRequest.setListIdSelected(listIdSelected);

    List <Product> productList = new ArrayList<>();
    if(listIdSelected.isEmpty()){
      productList = productRepository.findAll();
    } else {
      productList = productRepository.findAllById(productExportRequest.getListIdSelected());
    }

    List<ProductResponse> productResponses = new ArrayList<>();
    for (Product pr : productList) {
      ProductResponse res = new ProductResponse();
      Unit unit = unitRepository.findUnitById(pr.getUnitId());
      Category category = categoryRepository.findCategoryById(pr.getCategoryId());
      res.setId(pr.getId());
      res.setName(pr.getName());
      res.setUnitName(unit.getName());
      res.setDescription(pr.getDescription());
      res.setCategoryName(category.getName());
      productResponses.add(res);
    }
    return productResponses;
  }
}
