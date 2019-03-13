package part3.se.day03.raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author: 多俊睿
 * @data: 2019年3月13日 下午4:59:30
 * @Description: 复制文件
 */
public class CopyDemo {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile src = new RandomAccessFile("./test.txt", "r");
		RandomAccessFile desc = new RandomAccessFile("./test_cp.txt", "rw");
		
		int d = -1; //这的-1没有特殊意义，只是初始化，写多少都可以  他用来记录每次读取的字节数据
		long start = System.currentTimeMillis();
		while ((d = src.read()) != -1) {
			desc.write(d);
		}
		long end = System.currentTimeMillis();
		System.out.println("复制完毕，用时："+(end-start)+ "ms");
		src.close();
		desc.close();

	}

}
