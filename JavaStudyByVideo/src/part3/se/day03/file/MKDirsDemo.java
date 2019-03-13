package part3.se.day03.file;

import java.io.File;

/**
 * @author: 多俊睿
 * @data: 2019年3月13日 上午11:26:38
 * @Description: 创建多级目录
 */
public class MKDirsDemo {

	public static void main(String[] args) {
		
		/**
		 * 在当前目录下创建demo/a/b/c/d目录
		 */
		File dirs = new File("./demo/a/b/c/d");
		if (!dirs.exists()) {
			dirs.mkdirs();
			System.out.println("多级目录创建完毕。");
		}else {
			System.out.println("多级目录已经存在。");
		}
	}

}
