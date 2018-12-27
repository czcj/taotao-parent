package com.meng.taotaoorderservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.meng.taotaoorderservice.dao")
public class TaotaoOrderServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(TaotaoOrderServiceApplication.class, args);
  }

}

