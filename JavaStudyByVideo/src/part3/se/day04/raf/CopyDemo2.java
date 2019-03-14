package part3.se.day04.raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author: 多俊睿
 * @data: 2019年3月14日 上午10:30:59
 * @Description: 提高每次读写的数据量，减少实际读写的次数，可以提高读写效率
 * 对于硬盘（磁盘）而言，随机读写效率差是缺点。但是硬盘块读写效率还是可以保证的。
 * 随机读写：单字节读写
 * 块读写：一组一组字节读写
 */
public class CopyDemo2 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile src = new RandomAccessFile("D:/插件/TFS.zip", "r");
		RandomAccessFile desc = new RandomAccessFile("D:/插件/TFS_2.zip", "rw");
		
		/**
		 *int  read(byte[] data)
		 *一次性读取给定的字节数组长度的字节量
		 *并存入到该数组中，返回值为实际读取到的字节量。
		 *若返回值为-1，则是文件末尾
		 *
		 *void write(byte[] data)
		 *一次性将给定的字节数组中所有的字节写出
		 *
		 *void write(byte[] data, int index, int len)
		 *将给定的字节数组从下标index处开始的连续len个字节一次性写出
		 */
		byte[] buf = new byte[1024*10]; //10KB
		int len = -1;
		
		long start = System.currentTimeMillis();
		while ((len = src.read(buf))!=-1) {
//			desc.write(buf);
			desc.write(buf, 0, len);
		}
		long end = System.currentTimeMillis();
		System.out.println("复制完毕！耗时：" + (end - start) + "ms");
		
		src.close();
		desc.close();
	}

}
