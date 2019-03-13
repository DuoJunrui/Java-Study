package part3.se.day03.file;

import java.io.File;

/**
 * @author: 多俊睿
 * @data: 2019年3月13日 下午1:41:49
 * @Description: 删除目录
 * 由于delete方法删除目录是要求必须是一个空目录
 * 那么在实际情况中，我们需要先将一个要删除的目录清空才可以将其删除
 */
public class DeleteDirsDemo {

	public static void main(String[] args) {
		File dir = new File("./demo");
		delete(dir);

	}
	
	/**
	 * 删除给定的File所表示的文件或目录
	 * @param file
	 */
	public static void delete(File file) {
		if (file.isDirectory()) {
			/**
			 * 先将该目录清空
			 * 1、获取该目录中所有子项
			 * 2、遍历将他们一个一个删除
			 */
			File[] subs = file.listFiles();
			for (int i = 0; i < subs.length; i++) {
				delete(subs[i]);
			}
		}
		file.delete();
		System.out.println("删除结束");
	}

}
