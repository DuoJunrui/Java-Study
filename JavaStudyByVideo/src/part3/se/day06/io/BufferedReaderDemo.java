package part3.se.day06.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: 多俊睿
 * @data: 2019年3月15日 下午1:58:44
 * @Description: java.io.BufferedReader
 * 缓冲字符输入流，可以按行读取字符串
 */
public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("./src/part3/se/day06/io/BufferedReaderDemo.java");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		/**
		 * BufferedReader 提供了直接读取一行字符串方法：
		 * String readLine()
		 * 该方法会连续读取若干字符，当读取到换行符时，
		 * 会将之前读取的字符以字符串形式返回，
		 * 若返回值为null时，表示流的末尾
		 */
		String line = null;
		while ((line = br.readLine())!= null) {
			System.out.println(line);
		}
		br.close();
	}

}
