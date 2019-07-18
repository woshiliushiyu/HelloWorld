package com.liushiyu.service.impl;

import com.liushiyu.bean.ShzDaoMapper;
import com.liushiyu.dao.ShzDao;
import com.liushiyu.service.ShzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShzServiceImpl implements ShzService {

    @Autowired
    private ShzDaoMapper shzDaoMapper;


    @Override
    public int insert(ShzDao shzDao) {
        return shzDaoMapper.insertSelective(shzDao);
    }
}
