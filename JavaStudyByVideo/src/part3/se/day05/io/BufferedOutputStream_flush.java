package part3.se.day05.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author: 多俊睿
 * @data: 2019年3月14日 下午9:23:56
 * @Description: 缓冲输出流写数据时的缓冲区问题
 */
public class BufferedOutputStream_flush {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("bos.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		String line = "夜空中最亮的星。";
		byte[] data = line.getBytes("UTF-8");
		
		bos.write(data);
		//强制将缓冲区中的数据一次性写出
		bos.flush();
		System.out.println("写出完毕！");
		
		bos.close();
	}

}
