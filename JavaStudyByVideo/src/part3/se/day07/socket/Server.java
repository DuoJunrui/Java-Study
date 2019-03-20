package part3.se.day07.socket;
import java.io.BufferedReader;
import java.io.BufferedWriter;
/**
 * @author: 多俊睿
 * @data: 2019年3月18日 下午1:55:14
 * @Description: 聊天室服务端
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Arrays;

public class Server {
	
	/**
	 * 运行在服务端的java.net.ServerSocket
	 * 主要有两个作用
	 * 1、向系统申请服务端口，客户端就是通过这个端口与服务端建立连接的
	 * 2、监听服务端口，等待客户端连接。一旦一个客户端通过服务端口语服务端
	 * 建立连接，那么ServerSocket会主动创建一个Socket与客户端进行通讯。
	 */
	private ServerSocket server;
	
	/**
	 * 由于ClientHandler是Server的内部类，那么在Server上定义的属性
	 * 可以被ClientHandler的实例访问，从而可以用于让所有ClientHandler
	 * 共享数据使用
	 */
	private PrintWriter[] allOut = {};
	
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
			while (true) {
				System.out.println("等待客户端连接···");
				//阻塞
				Socket socket = server.accept();
				System.out.println("一个客户端连接了！");
				
				//启动一个线程，处理该客户端交互工作
				ClientHandler handler = new ClientHandler(socket);
				Thread t = new Thread(handler);
				t.start();
			}
			
//			InputStream in = socket.getInputStream();
//			InputStreamReader isr = new InputStreamReader(in,"UTF-8");
//			BufferedReader br =  new BufferedReader(isr);
//			String message = br.readLine();
//			System.out.println("客户端说：" + message);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Server server =  new Server();
		server.start();
	}
	
	//定义内部类  该线程负责处理指定客户端的交互工作
	private class ClientHandler implements Runnable{

		//当前线程通过这个Socket与对应客户端交互
		private Socket socket;
		
		public ClientHandler(Socket socket) {
			this.socket = socket;
		}
		
		@Override //重写接口的run方法
		public void run() {
			PrintWriter pw = null;
			try {
				System.out.println("启动了一个线程，处理客户端交互！");
				
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in,"UTF-8");
				BufferedReader br =  new BufferedReader(isr);
				
				//通过socket 获取输出流，用于给客户端发送消息
				pw = new PrintWriter(
					new BufferedWriter(
						new OutputStreamWriter(
							socket.getOutputStream(),"UTF-8"
						)
					),true
				);
				
				/**
				 * 将输出流存入allOut,以便其他的ClientHandler
				 * 可以将消息发送给当前客户端
				 */
				//防止两个线程同时操作这个数组，给数组对象加一个锁
				synchronized (allOut) {
					//1、先扩容allOut
					allOut = Arrays.copyOf(allOut, allOut.length+1);
					//2、将当前客户端输出流存入数组最后
					allOut[allOut.length-1] = pw;
					System.out.println("当前在线人数：" + allOut.length);
				}
				
				/**
				 * 当客户端与服务器断开连接时，不同系统的客户端在
				 * 服务器这边体现的不太一样。
				 * Windows的客户端断开时，服务端这里br.readLine()方法
				 * 通常会直接抛出异常。
				 * Linux的客户端断开时，服务端br.readLine()方法会返回null.
				 */
				String message = null;
				while ( (message = br.readLine()) != null) {
					System.out.println("客户端说：" + message);
					
					//将消息发送给客户端
//					pw.println("客户端说：" + message);
					
					synchronized (allOut) {
						//遍历allOut，转发消息
						for (int i = 0; i < allOut.length; i++) {
							allOut[i].println("客户端说：" + message);
						}
					}
				}
			} catch (IOException e) {
				//e.printStackTrace();
			} finally {
				//处理客户端断开连接的操作
				
				
				//将该客户端的输出流从共享数组中删除
				//将pw从allOut中删除
				synchronized (allOut) {
					for (int i = 0; i < allOut.length; i++) {
						if (allOut[i]==pw) {
							allOut[i] = allOut[allOut.length-1];
							allOut = Arrays.copyOf(allOut, allOut.length-1);
							break;
						}
					}
				}
				System.out.println("当前在线人数：" + allOut.length);
				
				
				//关闭socket，释放资源
				if (socket != null) {
					try {
						socket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			
		}
		
	}

}
