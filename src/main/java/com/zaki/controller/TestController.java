package com.zaki.controller;

import com.zaki.server.WebSocketServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @Auther: zhangh
 * @Date: 2018/6/26.
 * @Description:
 */
@RestController
public class TestController {

    @RequestMapping("/socket/sendMessage")
    public void sendMessage(String message){
        try {
            WebSocketServer.sendInfo(message,"30");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
