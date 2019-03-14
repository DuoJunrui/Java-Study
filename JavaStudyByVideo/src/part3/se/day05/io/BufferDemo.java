package part3.se.day05.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author: 多俊睿
 * @data: 2019年3月14日 下午9:01:57
 * @Description: 缓冲流: 缓冲流是一对高级流
 * java.io.BufferedOutputStream
 * java.io.BufferedInputStream
 * 缓冲字节输入输出流是用来加快读写效率的
 * 
 * 使用缓冲流完成复制操作
 */
public class BufferDemo {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("fos.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("fos_2.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int d = -1;
		/**
		 * 使用了缓冲流读写时，我们就不在需要关注必须用块读写加快效率了。
		 * 应为缓冲流内部维护了一个字节数组，最终会将我们的读写操作
		* 转换为块读写加快读写的效率
		 */
		while ((d = bis.read()) != -1) {
			bos.write(d);
		}
		System.out.println("复制完毕");
		
		bis.close();
		bos.close();
	}

}
