package part3.se.day06.io;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
/**
 * @author: 多俊睿
 * @data: 2019年3月15日 上午11:20:19
 * @Description: 流连接的使用
 */
public class PrintWriterDemo2 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("pw2.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK");
		BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter pw = new PrintWriter(bw);
		
		pw.println("的好的好的好的");
		pw.println("我是一个粉刷匠");
		
		System.out.println("写出完成！");
		pw.close();
	}

}
