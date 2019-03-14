package part3.se.day04.raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author: 多俊睿
 * @data: 2019年3月14日 下午2:50:07
 * @Description: 独处用户所有信息
 */
public class ReadDemo {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("user.dat", "r");
		
		for (int i = 0; i < raf.length()/100; i++) {
			
			raf.seek(i*100);
			
			byte[] data = new byte[32];
			//读取用户名
			raf.read(data);
			String userName = new String(data, "UTF-8").trim();
			//读取密码
			raf.read(data);
			String pass = new String(data, "UTF-8").trim();
			//读取昵称
			raf.read(data);
			String nick = new String(data,"UTF-8").trim();
			//读取年龄
			int age  = raf.readInt();
			System.out.println(userName+","+pass+","+nick+","+age);
		}
	}

}
