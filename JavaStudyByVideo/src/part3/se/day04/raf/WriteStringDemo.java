package part3.se.day04.raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class WriteStringDemo {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");
		
		/**
		 * String提供的方法
		 * byte[] getBytes(String csn)
		 * 将当前字符串按照指定字符集转换为一组字节。
		 * 推荐使用这种方式转换字符串，
		 * 因为按照系统默认字符集转换会导致跨平台出现乱码。
		 */
		String str = "让我再看你一遍，从南到北。";
		byte[] data = str.getBytes("UTF-8"); //先转换成字节
		raf.write(data);
		raf.write( "像是北五环路，蒙住了双眼".getBytes("UTF-8") );
		System.out.println("写入完毕！");
		raf.close();

	}

}
