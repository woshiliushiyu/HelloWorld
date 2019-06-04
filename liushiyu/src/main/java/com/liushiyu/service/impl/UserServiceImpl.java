package com.liushiyu.service.impl;

import com.liushiyu.bean.UserDaoMapper;
import com.liushiyu.dao.UserDao;
import com.liushiyu.dao.UserDaoExample;
import com.liushiyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDaoMapper userDaoMapper;

    @Override
    public List<UserDao> getAllData() {
        UserDaoExample userDaoExample = new UserDaoExample();
        UserDaoExample.Criteria criteria = userDaoExample.createCriteria();
        criteria.andIdEqualTo(1);
        return userDaoMapper.selectByExample(userDaoExample);
    }

    @Override
    public void updataHome(String name, Integer id) {
        UserDaoExample userDaoExample = new UserDaoExample();
        UserDaoExample.Criteria criteria = userDaoExample.createCriteria();
        criteria.andIdEqualTo(id);
        criteria.andNameEqualTo(name);
        UserDao userDao = new UserDao();
        userDao.setHome(name);
        userDaoMapper.updateByExampleSelective(null,userDaoExample);
    }
}
