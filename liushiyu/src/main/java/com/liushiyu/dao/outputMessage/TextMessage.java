package com.liushiyu.dao.outputMessage;

import com.liushiyu.util.ResponseMessageType;
import lombok.Data;

@Data
public class TextMessage extends BaseOutputMessage {

    // 文本消息
    private String Content;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    @Override
    public String getMsgType() {
        return ResponseMessageType.RESP_MESSAGE_TYPE_TEXT.toString();
    }
}
