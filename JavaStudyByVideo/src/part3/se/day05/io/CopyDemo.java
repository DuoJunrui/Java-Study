package part3.se.day05.io;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * @author: 多俊睿
 * @data: 2019年3月14日 下午8:01:25
 * @Description: 使用文件流完成文件的复制操作
 */
public class CopyDemo {

	public static void main(String[] args) throws IOException {

		/**
		 * 使用文件输入流读取源文件，使用文件输出流往新文件里面写。
		 * 使用块读写形式将源文件数据写入到新文件完成复制操作
		 */
		FileInputStream fis = new FileInputStream("fos.txt");
		FileOutputStream fos = new FileOutputStream("fos_2.txt");
		
		byte[] buf = new byte[1024*10]; //块读写  10KB
		int len = -1; //接收读取的长度，如果为-1则到文件末尾
		
		while ((len = fis.read(buf)) != -1) {
			fos.write(buf, 0, len);
		}
		System.out.println("复制完毕");
		fis.close();
		fos.close();
	}

}
