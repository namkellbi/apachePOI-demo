package com.example.demo_timestore;

import com.example.demo_timestore.entity.Batch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
@SpringBootApplication
public class DemoTimestoreApplication{

  public static void main(String[] args) {
    SpringApplication.run(DemoTimestoreApplication.class, args);
  }
}
