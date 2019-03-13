package part3.se.day03.file;

import java.io.File;

public class DeleteFileDemo {

	public static void main(String[] args) {
		/**
		 * 将当前目录中的test.txt文件彻底删除
		 */
		File file = new File("./test.txt");
		if (file.exists()) {
			file.delete();
			System.out.println("文件删除完毕。");
		}else {
			System.out.println("该文件不存在！");
		}

	}

}
