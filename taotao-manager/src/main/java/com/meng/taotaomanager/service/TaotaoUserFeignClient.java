package com.meng.taotaomanager.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "taotao-user-service")
public interface TaotaoUserFeignClient {

  @RequestMapping(value = "/taotao/user/getUser",method = RequestMethod.GET)
  String getUser();
}
