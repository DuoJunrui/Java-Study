package com.web.server.core;
/**
 * @author: 多俊睿
 * @data: 2019年3月30日 下午1:31:32
 * @Description: WebServer主类
 */

import java.net.ServerSocket;

public class WebSrever {

	private ServerSocket server;
	
	public WebSrever() {
		try {
			//Tomact默认开启的端口就是8080
			server = new ServerSocket(8080);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void start() {
		
	}

}
