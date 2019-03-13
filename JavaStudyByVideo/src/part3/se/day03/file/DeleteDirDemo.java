package part3.se.day03.file;

import java.io.File;

/**
 * @author: 多俊睿
 * @data: 2019年3月13日 下午1:27:10
 * @Description: 删除目录
 */
public class DeleteDirDemo {

	public static void main(String[] args) {

		File dir = new File("./demo/a/b/c");
		if (dir.exists()) {
			/*
			 * 删除目录的前提条件是该目录下没有文件了，是一个空目录
			 */
			dir.delete();
			System.out.println("目录删除完毕!");
		}else {
			System.out.println("目录不存在！");
		}
	}

}
