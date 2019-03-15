package part3.se.day06.io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author: 多俊睿
 * @data: 2019年3月15日 上午11:21:21
 * @Description: 使用PrintWriter，用流连接形式创建
 * 完成记事本功能
 * 将控制台输入的每一行字符串写入到文件notepad.txt文件中。
 */
public class NotepadDemo {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		System.out.println("请输入您的内容，输入exit退出");
		
		FileOutputStream fos = new FileOutputStream("notepad.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter pw = new PrintWriter(bw,true); //true每次写完进行flush
		/**
		 * PrintWriter的构造方法若，第一个参数是一个流，那么就支持第二个参数，该参数为boolean型，
		 * 若值为true时，那么pw就具有了自动行刷新功能。
		 * 即，每当使用println方法写出一行字符串后会自动flush。
		 * 注意，调用print方法是不会自动行刷新的！！
		 */
		
		
		
		while (true) {
			String input = scan.nextLine();
			if ("exit".equals(input.toLowerCase())) {
				break;
			}
			
			//自动行刷新的话，这里会自动flush
			pw.println(input);
			//pw.flush();//达不到缓冲流的容量，需要强制推送
		}
		System.out.println("写入完成！");
		pw.close();
	}
}
