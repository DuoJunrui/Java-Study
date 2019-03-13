package part3.se.day03.file;

import java.io.File;
import java.io.IOException;

/**
 * @author: 多俊睿
 * @data: 2019年3月13日 上午10:50:12
 * @Description: 使用File创建一个文件
 */
public class CreateNewFileDemo {

	public static void main(String[] args) throws IOException {
		/**
		 * 当前目录下创建test.txt文件
		 */
		File file = new File("./test.txt");
		
		/**
		 * boolean exists()
		 * 判断当前File表示的文件或目录是否已经存在
		 */
		if (!file.exists()) {
			file.createNewFile(); //创建文件
			System.out.println("创建完毕。");
		}else {
			System.out.println("文件已存在。");
		}

	}

}
