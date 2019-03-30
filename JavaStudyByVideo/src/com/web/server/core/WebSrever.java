package com.web.server.core;
/**
 * @author: 多俊睿
 * @data: 2019年3月30日 下午1:31:32
 * @Description: WebServer主类
 */

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

import part3.se.day07.socket.Server;

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
		
		try {
			System.out.println("等待客户端连接···");
			Socket socket = server.accept();
			System.out.println("一个客户端连接了~~~");
			
			InputStream in = socket.getInputStream();
			int d = -1;
			while ((d = in.read())!=-1) {
				System.out.print((char)d);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		WebSrever srever = new WebSrever();
		srever.start();
		
	}

}
