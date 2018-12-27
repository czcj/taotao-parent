package com.meng.taotaocontentservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.meng.taotaocontentservice.dao")
public class TaotaoContentServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(TaotaoContentServiceApplication.class, args);
  }

}

