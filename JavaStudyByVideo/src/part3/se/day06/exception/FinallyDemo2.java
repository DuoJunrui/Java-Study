package part3.se.day06.exception;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author: 多俊睿
 * @data: 2019年3月15日 下午10:11:00
 * @Description: 异常处理机制在IO中的使用
 */
public class FinallyDemo2 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("fos.txt");
			int d = fis.read();
			System.out.println(d);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (fis!=null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
