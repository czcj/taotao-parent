package com.meng.taotaomanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableFeignClients
public class TaotaoManagerApplication {

  public static void main(String[] args) {
    SpringApplication.run(TaotaoManagerApplication.class, args);
  }

}

