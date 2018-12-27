package com.meng.taotaocontentservice.service.impl;

import com.meng.taotaocontentservice.dao.TbContentMapper;
import com.meng.taotaocontentservice.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TbContentServiceImpl implements TbContentService {

  @Autowired
  private TbContentMapper tbContentMapper;


}
