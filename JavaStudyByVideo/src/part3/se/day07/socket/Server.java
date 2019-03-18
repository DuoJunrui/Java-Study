package part3.se.day07.socket;
import java.io.BufferedReader;
/**
 * @author: 多俊睿
 * @data: 2019年3月18日 下午1:55:14
 * @Description: 聊天室服务端
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	/**
	 * 运行在服务端的java.net.ServerSocket
	 * 主要有两个作用
	 * 1、向系统申请服务端口，客户端就是通过这个端口与服务端建立连接的
	 * 2、监听服务端口，等待客户端连接。一旦一个客户端通过服务端口语服务端
	 * 建立连接，那么ServerSocket会主动创建一个Socket与客户端进行通讯。
	 */
	
	private ServerSocket server;
	//初始化服务端
	public Server(){
		try {
			System.out.println("启动服务端···");
			server = new ServerSocket(8089);
			System.out.println("服务端启动完毕！");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//服务端开始工作的方法
	public void start() {
		
		try {
			/**
			 * ServerSocket提供的方法：
			 * Socket accept()
			 * 该方法是一个阻塞方法，调用后进入阻塞，直到一个客户端连接为止，
			 * 这时该方法会返回一个Socket，通过这个Socket可以与刚建立连接的客户端进行通讯
			 */
			System.out.println("等待客户端连接···");
			//阻塞
			Socket socket = server.accept();
			System.out.println("一个客户端连接了！");
			
			InputStream in = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(in,"UTF-8");
			BufferedReader br =  new BufferedReader(isr);
			String message = br.readLine();
			System.out.println("客户端说：" + message);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Server server =  new Server();
		server.start();
	}

}
