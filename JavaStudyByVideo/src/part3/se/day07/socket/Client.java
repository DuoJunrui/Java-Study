package part3.se.day07.socket;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
/**
 * @author: 多俊睿
 * @data: 2019年3月18日 下午12:55:17
 * @Description: 聊天室客户端
 */
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	/**
	 * java.net.Socket 套接字
	 * 封装了TCP协议通讯。使用它可以很方便的以TCP协议为通讯方式进行数据传输
	 */
	private Socket socket;
	
	public Client() {
		try {
			/**
			 * 实例化Socket时需要传入两个参数
			 * 1、服务端IP地址
			 * 2、服务端端口号
			 * 通过IP地址可以找到服务端计算机，通过端口可以找到运行在
			 * 服务端计算机上的服务端应用程序。
			 * 实例化的过程就是连接的过程，若连接失败
			 * 那么这里会抛出异常
			 */
			System.out.println("正在连接服务端···");
			socket = new Socket("localhost", 8089);
			System.out.println("已连接！");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//客户端开始工作的方法
	public void strat() {
		try {
			BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in) 
			);
			
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");
			BufferedWriter bs = new BufferedWriter(osw);
			PrintWriter pw = new PrintWriter(bs,true);
			
			System.out.println("开始聊天吧！");
			String message = null;
			while (true) {
				message = br.readLine();
				pw.println(message);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Client client = new Client();
		client.strat();
	}
}
