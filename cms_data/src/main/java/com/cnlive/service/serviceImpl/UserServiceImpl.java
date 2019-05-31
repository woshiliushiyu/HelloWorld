package com.cnlive.service.serviceImpl;

import com.cnlive.bean.UserBean;
import com.cnlive.dao.UserBeanMapper;
import com.cnlive.dao.UserDaoMapper;
import com.cnlive.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserBeanMapper userBeanMapper;

    @Autowired
    private UserDaoMapper userDaoMapper;

    @Override
    public List<UserBean> getAllBean() {
        return userBeanMapper.selectByExample(null);
    }

    @Override
    public void insertUserDao() {
//        UserDao userDao = new UserDao();
////        userDao.setId(3);
//        userDao.setHome("关东");
//        userDao.setInfo("哈哈哈");
//        userDao.setName("侯亮");
//        userDao.setPwd("666666");
//        userDao.setSex("未知");
//        userDaoMapper.insert(userDao);

        UserBean userDao = new UserBean();
//        userDao.setId(3);
        userDao.setHome("关东");
        userDao.setInfo("哈哈哈");
        userDao.setName("侯亮");
        userDao.setPwd("666666");
        userDao.setSex("未知");
        userBeanMapper.insert(userDao);
    }
}
