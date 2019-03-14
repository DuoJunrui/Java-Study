package part3.se.day05.io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author: 多俊睿
 * @data: 2019年3月14日 下午7:51:32
 * @Description: 文件输入流，用于读取文件数据
 */
public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("fos.txt");
		
		byte[] data = new byte[200];
		
		//获取返回值，得到实际读取的字节量
		int len = fis.read(data);
		
		String str = new String(data, 0, len, "UTF-8");
		System.out.println(str);
		
		fis.close();
	}

}
