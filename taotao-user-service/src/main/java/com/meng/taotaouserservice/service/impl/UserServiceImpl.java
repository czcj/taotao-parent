package com.meng.taotaouserservice.service.impl;

import com.meng.taotaouserservice.dao.TbUserMapper;
import com.meng.taotaouserservice.entity.TbUser;
import com.meng.taotaouserservice.entity.TbUserExample;
import com.meng.taotaouserservice.entity.TbUserExample.Criteria;
import com.meng.taotaouserservice.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private TbUserMapper tbUserMapper;

  @Override
  public TbUser getUser() {
    TbUserExample example = new TbUserExample();
    Criteria criteria = example.createCriteria();
    List<TbUser> tbUsers = tbUserMapper.selectByExample(example);
    return tbUsers.get(0);
  }
}
