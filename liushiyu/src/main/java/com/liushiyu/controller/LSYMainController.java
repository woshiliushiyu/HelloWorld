package com.liushiyu.controller;

import com.liushiyu.dao.UserDao;
import com.liushiyu.service.UserService;
import com.liushiyu.service.WechatService;
import com.liushiyu.util.ResponseMessageType;
import com.liushiyu.util.WebChatUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;


@Api(description = "管理接口")
@RestController
@RequestMapping(value = "/auth")
public class LSYMainController {

    private static final Logger logger = LoggerFactory.getLogger(LSYMainController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private WechatService wechatService;

    /**
     * 测试 GET 请求
     * @return
     */
    @ApiOperation(value = "专项管理", notes = "notes", httpMethod = "GET")
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody
    public List getUserDao() {
        logger.info("获取所有数据");
        return userService.getAllData();
    }

    @ApiOperation(value = "测试链接", notes = "notes", httpMethod = "GET")
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    @ResponseBody
    public String index() {
        logger.info("请求成功");
        return "connection successful";
    }


    /**
     * 测试 POST 请求
     * @param name
     * @param id
     */
    @ApiOperation(value = "更新数据",notes = "update", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "数据 ID", required = true),
            @ApiImplicitParam(name = "name", value = "更改数据", required = true)
    })
    @RequestMapping(value = "/check",method = RequestMethod.POST)
    @ResponseBody
    public int update(@RequestParam("name") String name, @RequestParam("id") Integer id) {
        logger.info("获取的数据"+name+"  "+id);
        return userService.updataHome(name,id);
    }



    /**
     * 对微信请求进行验证
     * @param request
     * @param response
     * @throws IOException
     */
    @ApiOperation(value = "微信返回验证")
    @RequestMapping(method = RequestMethod.GET)
    public void getWeChat(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //消息来源可靠性验证
        String signature = request.getParameter("signature");// 微信加密签名
        String timestamp = request.getParameter("timestamp");// 时间戳
        String nonce = request.getParameter("nonce");       // 随机数
        String echostr = request.getParameter("echostr");//成为开发者验证
        //确认此次GET请求来自微信服务器，原样返回echostr参数内容，则接入生效，成为开发者成功，否则接入失败
        PrintWriter out = response.getWriter();
        if(WebChatUtil.checkSignature(signature, timestamp, nonce)){
            logger.info("=======请求校验成功======" + echostr);
            out.print(echostr);
        }
        out.close();
        out = null;
    }

    /**
     * 对微信发来消息进行处理
     * @param request
     * @param response
     * @throws IOException
     */
    @ApiOperation(value = "对微信发来消息进行处理")
    @RequestMapping(method = RequestMethod.POST)
    public void postWeChat(HttpServletRequest request,HttpServletResponse response) throws  IOException {
        // TODO 消息的接收、处理、响应
        //消息来源可靠性验证
        String signature = request.getParameter("signature");// 微信加密签名
        String timestamp = request.getParameter("timestamp");// 时间戳
        String nonce = request.getParameter("nonce");       // 随机数
        //确认此次GET请求来自微信服务器，原样返回echostr参数内容，则接入生效，成为开发者成功，否则接入失败
        if (!WebChatUtil.checkSignature(signature, timestamp, nonce)) {
            //消息不可靠，直接返回
            response.getWriter().write("");
            return;
        }
        //用户每次向公众号发送消息、或者产生自定义菜单点击事件时，响应URL将得到推送
        try {
            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/xml");
            //调用parseXml方法解析请求消息
            Map<String, String> map = ResponseMessageType.pareXml(request, response);
            String MsgType = map.get("MsgType");
            String xml = null;//处理输入消息，返回结果的xml
            if(ResponseMessageType.REQ_MESSAGE_TYPE_EVENT.equals(MsgType)){
                xml = wechatService.parseEvent(map);
            }else{
                xml = wechatService.parseMessage(map);
            }
            logger.info("生成的 xml"+xml);
            response.getWriter().write(xml);
        } catch (Exception ex) {
            response.getWriter().write("");
        }
    }

}
