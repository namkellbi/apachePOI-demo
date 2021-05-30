package com.example.demo_timestore.controller;

import com.example.demo_timestore.entity.Batch;
import com.example.demo_timestore.service.BatchService;
import com.example.demo_timestore.utils.Enums;
import com.example.demo_timestore.utils.ResponseData;
import com.example.demo_timestore.utils.ResponseDataPagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/batch")
public class BatchController {
  @Autowired
  BatchService batchService;

  @GetMapping("/list-batch")
  public ResponseData  listBatch() {
    try{
      List <Batch> list = batchService.findAllBatch();
      return new ResponseData("DONE","SUCCESS",list);
    }catch(Exception e){
      e.printStackTrace();
      return new ResponseData("DONE","FAILED");
    }
  }

  @GetMapping("/get-list-batch-of-option")
  public ResponseData getListBatchOfOption(
    @RequestParam (value = "lotCode",   defaultValue = "", required = false) String lotCode,
    @RequestParam(value = "expireDate", defaultValue = "", required = false) Long  expireDate,
    @RequestParam(value = "importDate", defaultValue = "",required = false) Long importDate,
    @RequestParam(name = "page", required = false, defaultValue = "1") int page,
    @RequestParam(name = "size", required = false, defaultValue = "10") int size)
  {
    try{
      ResponseDataPagination response = batchService.getListBatchOfOption(lotCode, expireDate, importDate, page, size);
      return response;
    } catch (Exception e){
      return new ResponseData(Enums.ResponseStatus.ERROR.getStatus(), e.getMessage());
    }
  }
}
