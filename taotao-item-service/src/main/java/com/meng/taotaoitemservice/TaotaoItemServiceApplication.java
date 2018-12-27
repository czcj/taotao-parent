package com.meng.taotaoitemservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.meng.taotaoitemservice.dao")
public class TaotaoItemServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(TaotaoItemServiceApplication.class, args);
  }

}

