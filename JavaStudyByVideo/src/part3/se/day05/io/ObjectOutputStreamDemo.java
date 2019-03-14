package part3.se.day05.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author: 多俊睿
 * @data: 2019年3月14日 下午9:41:40
 * @Description: 对象流
 * 对象流是一对高级流，可以方便我们读写java中的任何对象。
 * 对象输出流： 可以将指定的对象转换为一组字节后写出
 * 对象输入流：可以将一组字节还原为对应的对象，
 * 			前提是这组字节应当是对象输出流将一个对象转换的字节
 */
public class ObjectOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		
		String[] other =  {"是学生","爱好毛笔字"};
		Person p = new Person("多俊睿", 23, "男", other) ;
		
		FileOutputStream fos = new FileOutputStream("person.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		/*
		 * 对象输出流提供的方法
		 * void writeObject(Object o)
		 * 可以将给定的对象转换为一组字节后写出
		 * 
		 * 下面的代码实际上做了两件事
		 * 一、p对象先流经对象输出流，而对象输出流将该对象转换为了一组字节，
		 * 	这个过程称为序列化
		 * 
		 * 二、转换的这组字节再流经文件输出流，然后写入了文件保存（写入磁盘），
		 * 	将数据写入磁盘做长久保存的过程称为数据持久化
		 */
		oos.writeObject(p);
		System.out.println("写出完成！");
		
		oos.close();
	}

}
