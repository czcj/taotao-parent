package com.meng.taotaomanager.controller;

import com.meng.taotaomanager.service.TaotaoUserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/taotao/manager")
public class TaotaoManagerController {

  @Autowired
  private TaotaoUserFeignClient userFeignClient;

  @RequestMapping("/test")
  public String getUser(){
    return userFeignClient.getUser();
  }
}
