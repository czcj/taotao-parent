package com.meng.taotaomanager.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "taotao-order-service")
public interface TaotaoOrderFeignClient {

}
