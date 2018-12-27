package com.meng.taotaouserservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.meng.taotaouserservice.dao")
public class TaotaoUserServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(TaotaoUserServiceApplication.class, args);
  }

}

