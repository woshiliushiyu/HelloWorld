package com.liushiyu.bean;

import com.liushiyu.dao.WechatDao;
import com.liushiyu.dao.WechatDaoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WechatDaoMapper {
    int deleteByExample(WechatDaoExample example);

    int insert(WechatDao record);

    int insertSelective(WechatDao record);

    List<WechatDao> selectByExample(WechatDaoExample example);

    int updateByExampleSelective(@Param("record") WechatDao record, @Param("example") WechatDaoExample example);

    int updateByExample(@Param("record") WechatDao record, @Param("example") WechatDaoExample example);
}