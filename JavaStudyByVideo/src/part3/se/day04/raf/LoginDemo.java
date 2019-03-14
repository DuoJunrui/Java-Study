package part3.se.day04.raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class LoginDemo {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("欢迎登陆\n请输入用户名：");
		
		String username = scan.nextLine();
		
		System.out.println("请输入密码：");
		String pass = scan.nextLine();
		
		RandomAccessFile raf = new RandomAccessFile("user.dat", "r");
		
		//加一个开关，用来标记是否验证通过
		boolean check = false;
		for (int i = 0; i < raf.length()/100; i++) {
			raf.seek(i*100);
			
			//读取用户名
			byte[] data = new byte[32];
			raf.read(data);
			String name = new String(data, "UTF-8").trim();
			if (name.equals(username)) {
				//找到此人，然后匹配密码
				raf.read(data);
				String pwd = new String(data,"UTF-8").trim();
				if (pwd.equals(pass)) {
					System.out.println("登陆成功！");
					check = true;
				}
				break;
			}
		}
		if (!check) {
			System.out.println("用户名或者密码不正确。");
		}
		raf.close();
	}

}
