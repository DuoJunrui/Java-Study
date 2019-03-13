package part3.se.day03.file;

import java.io.File;
import java.io.FileFilter;

/**
 * @author: 多俊睿
 * @data: 2019年3月13日 下午1:31:59
 * @Description: 获取一个目录中的所有子项
 */
public class ListFilesDemo {

	public static void main(String[] args) {
		
		/**
		 * 获取当前目录（项目目录）中的所有子项
		 */
		File dir = new File(".");
		/**
		 * boolean isFile()
		 * boolean isDirectory()
		 * 排断当前File表示的是文件还是目录
		 */
		
		if (dir.isDirectory()) {
			//获取所有子项
			File[] subs = dir.listFiles();
			for (int i = 0; i < subs.length; i++) {
				System.out.println(subs[i].getName());
			}
		}
		
		
		System.out.println("----------------------");
		/**
		 * File提供了一个重载listFiles方法，可以指定一个文件过滤器，
		 * 然后将一个目录中满足过滤器要求的子项返回，不满足则忽略
		 */
		File dirs = new File(".");
		//File[] subs = dirs.listFiles(new MyFilter());
		
		//使用匿名内部类形式创建(匿名内部类适合只用一次的情况下使用)
		File[] subs = dirs.listFiles( new FileFilter() {
			
			@Override
			public boolean accept(File file) {
				return file.getName().endsWith(".txt");
			}
		} );
		
		/*上面的分开就是下面这样，将 filter 替换了
		  FileFilter filter = new FileFilter() {
				
				@Override
				public boolean accept(File file) {
					return file.getName().endsWith(".txt");
				}
			};
			File[] subs = dirs.listFiles(filter);
		 */
		
		
		/*
		 同样也可以用lamdba表达式来写
		  File[] subs = dirs.listFiles( 
		 		(file) -> file.getName().endsWith(".txt")
 			);
		 */
		
		System.out.println("length:" + subs.length);
		for (int i = 0; i < subs.length; i++) {
			System.out.println(subs[i].getName());
		}
	}

}

//重写过滤器规则
class MyFilter implements FileFilter{

	@Override
	public boolean accept(File file) {
		String name = file.getName();
		System.out.println("正在过滤："+name);
		//return name.endsWith(".txt"); //获取.txt结尾的文件
		return file.isFile(); //获取所有文件
	}
	
}
