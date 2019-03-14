package part3.se.day04.raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * @author: 多俊睿
 * @data: 2019年3月14日 下午12:51:02
 * @Description: 简易记事本
 * 程序启动后，用户在控制台输入的每一行字符串都写入到文件中。
 * 当用户输入“exit”时程序退出。
 */
public class NoteDemo {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("请开始输入内容：");
		RandomAccessFile raf = new RandomAccessFile("note.txt", "rw");
		
		String line = null;
		while (true) {
			line = scan.nextLine();
			if ("exit".equals(line.toLowerCase())) {
				break;
			}
			raf.write(line.getBytes("UTF-8"));
		}
		raf.close();
		System.out.println("再见！");
	}

}
