package part3.se.day06.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: 多俊睿
 * @data: 2019年3月15日 上午10:36:05
 * @Description: 转换流 读取字符
 */
public class InputStreamReaderDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("osw.txt");
		InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
		
		/**
		 * 按字符一个一个读
		 */
//		int d = -1;
//		while ((d = isr.read()) != -1) {
//			System.out.print((char) d);
//		}
		
		//按数组，一组一组读
		char[] data = new char[30];
		int len = -1;
		while ((len = isr.read(data)) != -1) {
			String string = new String(data, 0, len);
			System.out.println(string);
		}
		
		isr.close();
	}

}
