package com.liushiyu.dao.outputMessage;

import com.liushiyu.util.ResponseMessageType;

import java.util.List;

public class NewsOutputMessage extends BaseOutputMessage {

    public int getArticleCount() {
        return ArticleCount;
    }

    public void setArticleCount(int articleCount) {
        ArticleCount = articleCount;
    }

    public List<com.liushiyu.dao.outputMessage.Articles> getArticles() {
        return Articles;
    }

    public void setArticles(List<com.liushiyu.dao.outputMessage.Articles> articles) {
        Articles = articles;
    }

    // 图文消息个数，限制为10条以内
    private int ArticleCount;
    // 多条图文消息信息，默认第一个item为大图
    private List<Articles> Articles;

    @Override
    public String getMsgType() {
        return ResponseMessageType.RESP_MESSAGE_TYPE_NEWS.toString();
    }
}
