package part3.se.day03.file;
import java.io.File;
/**
 * @author: 多俊睿
 * @data: 2019年3月13日 上午11:21:03
 * @Description: 使用File创建一个新目录
 */
public class MKDirDemo {
	public static void main(String[] args) {
		/**
		 * 在当前目录下新建一个目录demo
		 */
		File dir = new File("./demo");
		if (!dir.exists()) {
			dir.mkdir(); //不加s和加s有区别，不加S如果创建多级目录，第一个目录必须存在
			System.out.println("目录创建完成。");
		}else {
			System.out.println("目录已经存在。");
		}
	}

}
