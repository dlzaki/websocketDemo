package com.zaki.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @Auther: zhangh
 * @Date: 2018/6/21.
 * @Description:
 */
@Configuration
public class WebSocketConfig {
    // 非内置容器不需要
//    @Bean
//    public ServerEndpointExporter serverEndpointExporter(){
//        return new ServerEndpointExporter();
//    }
}
