package part3.se.day06.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * @author: 多俊睿
 * @data: 2019年3月15日 上午10:53:42
 * @Description: 缓冲字符流
 * java.io.BufferedWriter
 * java.io.BufferedReader
 * 内部有缓冲区，可以块读写字符。并且可以按行进行读写字符串操作。
 * 
 * java.io.PrintWriter
 * 具有自动行刷新的缓冲字符输出流，内部总是会连接
 * BufferedWriter作为缓冲操作
 */
public class PrintWriteDemo {

	public static void main(String[] args) throws IOException, UnsupportedEncodingException {
		/**
		 * PrintWriter提供了直接对文件写操作的构造方法
		 * PrintWriter(String path)
		 * PrintWriter(File file)
		 */
		//向pw.txt文件中写出字符串
		PrintWriter pw = new PrintWriter("pw.txt", "GBK");
		
		pw.println("你在南方的艳阳里，大雪纷飞。");
		pw.println("我在北方的寒夜里，四季如春。");
		
		System.out.println("写出完毕！");
		
		pw.close();
	}

}
