package part3.se.day04.raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: 多俊睿
 * @data: 2019年3月14日 下午2:12:30
 * @Description: 完成用户注册业务操作
 * 其中年龄是int值，其他三项为字符串
 * 
 * 每个用户的信息都要写入文件user.dat中保存
 * 每条记录的长度固定为100字节
 * 其中用户名、密码、昵称三项各占32个字节，年龄int值固定为4字节
 * 
 * 字符串“留白”操作便于修改内容。不会影响整个文件的格式
 */
public class RegisterDemo {

	public static void main(String[] args) throws IOException {

		System.out.println("欢迎注册！");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入用户名：");
		String userName = scan.nextLine();
		
		System.out.println("请输入密码：");
		String password = scan.nextLine();
		
		System.out.println("请输入昵称：");
		String nickName = scan.nextLine();
		
		System.out.println("请输入年龄：");
		int age = Integer.parseInt(scan.nextLine());
		
		//打桩测试
		System.out.println("userName:"+userName);
		System.out.println("password:"+password);
		System.out.println("nickName:"+nickName);
		System.out.println("age:"+age);
		
		RandomAccessFile raf = new RandomAccessFile("user.dat", "rw");
		
		//先将指针移动到文件末尾
		raf.seek(raf.length());
		
		//写用户名
		byte[] data = userName.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		
		//写密码
		data = password.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		
		//写昵称
		data = nickName.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		
		//写年龄
		raf.writeInt(age);  //4个字节
		
		System.out.println("注册完毕！");
		raf.close();
	}

}
