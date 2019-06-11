package com.liushiyu.service.impl;

import com.liushiyu.bean.WechatDaoMapper;
import com.liushiyu.dao.WechatDao;
import com.liushiyu.dao.WechatDaoExample;
import com.liushiyu.dao.outputMessage.Articles;
import com.liushiyu.dao.outputMessage.NewsOutputMessage;
import com.liushiyu.dao.outputMessage.TextMessage;
import com.liushiyu.service.WechatService;
import com.liushiyu.util.ReplyMessageUtil;
import com.liushiyu.util.ResponseMessageType;
import com.liushiyu.util.XmlUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class WechatServiceImpl implements WechatService {

    private static final Logger logger = LoggerFactory.getLogger(WechatServiceImpl.class);

    @Autowired
    private WechatDaoMapper wechatHomeMapper;

    /**
     * 对发送消息进行处理
     * @param map
     * @return
     */
    @Override
    public String parseMessage(Map<String, String> map) {
        String respXml = null;
        try {
            // 发送方帐号
            String fromUserName = map.get("FromUserName");
            // 开发者微信号
            String toUserName = map.get("ToUserName");
            // 取得消息类型
            String MsgType = map.get("MsgType");
            //获取消息内容
            String msgContent = map.get("Content");

            logger.info("客户端发来的消息进行打印"+map.toString());

            if (MsgType.equals(ResponseMessageType.TEXT_MESSAGE)) {

                NewsOutputMessage message01 = new NewsOutputMessage();
                message01.setToUserName(fromUserName);
                message01.setFromUserName(toUserName);
                message01.setCreateTime(new Date().getTime());
                message01.getMsgType();

                WechatDaoExample example = new WechatDaoExample();
                WechatDaoExample.Criteria criteria = example.createCriteria();
                criteria.andContentEqualTo(msgContent);
                WechatDao bean = wechatHomeMapper.selectByExample(example).get(0);

                if (bean != null) {

                    Articles article00 = new Articles();
                    article00.setDescription(bean.getResdesc()); // 图文消息的描述
                    article00.setPicUrl(bean.getResimage()); // 图文消息图片地址
                    article00.setTitle(bean.getResname()); // 图文消息标题
                    article00.setUrl(bean.getResurl()); // 图文 url 链接

                    List<Articles> list = new ArrayList<Articles>();
                    list.add(article00);// 这里发送的是单图文，如果需要发送多图文则在这里 list 中加入多个

                    message01.setArticleCount(list.size());
                    message01.setArticles(list);
                    respXml = ReplyMessageUtil.sendImageTextMessage(message01);
                } else {
                    respXml = respWithXml(fromUserName, toUserName, MsgType, msgContent);
                }

            }else if (MsgType.equals(ResponseMessageType.LINK_MESSAGE)) {

            } else {
                respXml = respWithXml(fromUserName,toUserName,MsgType,msgContent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return respXml;
    }

    /**
     * 对未知消息进行处理
     * @param fromUserName
     * @param toUserName
     * @param MsgType
     * @param msgContent
     * @return
     */
    public String respWithXml(String fromUserName,String toUserName,String MsgType,String msgContent) {

        Map<String, String> replyMap = new HashMap<String, String>();
        replyMap.put("ToUserName", fromUserName);
        replyMap.put("FromUserName", toUserName);
        replyMap.put("CreateTime", String.valueOf(new Date().getTime()));

        TextMessage textMessage = new TextMessage();
        textMessage.setToUserName(fromUserName);
        textMessage.setFromUserName(toUserName);
        textMessage.setCreateTime(new Date().getTime());
        textMessage.setContent("现在发这些我还不知道怎么做呢?");
        textMessage.getMsgType();
        String respXml = ReplyMessageUtil.sendTextMessage(textMessage);
        replyMap.put("MsgType", ResponseMessageType.RESP_MESSAGE_TYPE_TEXT);
        replyMap.put("Content", "现在发这些我还不知道怎么做呢?");
        respXml = XmlUtil.xmlFormat(replyMap, true);

        return respXml;
    }

    /**
     * 事件消息业务分发(暂时未用)
     * @param map
     * @return
     */
    @Override
    public String parseEvent(Map<String, String> map) {
        String respXml = null;
        try {
            // 发送方帐号
            String fromUserName = map.get("FromUserName");
            // 开发者微信号
            String toUserName = map.get("ToUserName");
            // 取得消息类型
            String MsgType = map.get("MsgType");
            //获取事件类型
            String eventType = map.get("Event");

            // 发现直接把要返回的信息直接封装成replyMap集合，然后转换成 xml文件，是不是实体类可以不用了
            Map<String, String> replyMap = new HashMap<String, String>();
            replyMap.put("ToUserName", fromUserName);
            replyMap.put("FromUserName", toUserName);
            replyMap.put("CreateTime", String.valueOf(new Date().getTime()));
            if (eventType.equals(ResponseMessageType.EVENT_TYPE_SUBSCRIBE)) {// 关注
                // 用map集合封装
                replyMap.put("MsgType", ResponseMessageType.RESP_MESSAGE_TYPE_TEXT);
                replyMap.put("Content", "亲爱的,想死我了.你先回复<男人产假><北京看病>试试,其他的还没支持");
                respXml = XmlUtil.xmlFormat(replyMap, true);
            }
            if (eventType.equals(ResponseMessageType.EVENT_TYPE_UNSUBSCRIBE)) {// 取消关注

            }
            if (eventType.equals(ResponseMessageType.EVENT_TYPE_SCAN)) {// 用户已关注时的扫描带参数二维码

            }
            if (eventType.equals(ResponseMessageType.EVENT_TYPE_LOCATION)) {// 上报地理位置

            }
            if (eventType.equals(ResponseMessageType.EVENT_TYPE_CLICK)) {// 自定义菜单

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return respXml;
    }

    @Override
    public void insertData(int id, String content, String resName, String resType, String resImage, String resUrl, String resDesc) {

        WechatDao bean = new WechatDao();
        bean.setId(id);
        bean.setContent(content);
        bean.setResdesc(resDesc);
        bean.setResimage(resImage);
        bean.setResname(resName);
        bean.setRestype(resType);
        bean.setResurl(resUrl);
        wechatHomeMapper.insert(bean);
    }

}
