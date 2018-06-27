package com.zaki;

import com.zaki.server.WebSocketServer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebsocketApplicationTests {

	@Test
	public void contextLoads() {
		try {
			WebSocketServer.sendInfo("来自服务器的消息！！！",null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
