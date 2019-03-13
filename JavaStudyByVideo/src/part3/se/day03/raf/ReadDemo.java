package part3.se.day03.raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author: 多俊睿
 * @data: 2019年3月13日 下午4:38:56
 * @Description: 读取一个字节
 */
public class ReadDemo {

	public static void main(String[] args) throws IOException {

		RandomAccessFile raf = new RandomAccessFile("./test.txt", "r");
		
		/**
		 * int read()
		 * 读取一个字节，并以int形式返回。
		 * 若返回值为-1，则表示读取到了文件末尾。
		 */
		
		int d = raf.read();
		System.out.println(d);
		
		d = raf.read();
		System.out.println(d);
		
		d = raf.read();
		System.out.println(d);
		
		raf.close();
	}

}
