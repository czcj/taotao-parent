package com.meng.taotaouserservice.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.meng.taotaouserservice.entity.TbUser;
import com.meng.taotaouserservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("taotao/user")
public class TestController {

  @Autowired
  private UserService userService;
  @RequestMapping("getUser")
  public String getUser(){
    ObjectMapper objectMapper = new ObjectMapper();
    String result = "";
    try {
      result = objectMapper.writeValueAsString(userService.getUser());
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }
    return result;
  }
}
