package part3.se.day03.file;
import java.io.File;
/**
 * @author: 多俊睿
 * @data: 2019年3月13日 上午10:02:15
 * @Description: java.io.File
 * File的每一个实例可以用于表示文件系统中的一个文件或目录
 * 使用File可以：
 * 1、访问文件或目录的属性（名称、大小、修改时间等）
 * 2、操作文件或目录（创建、删除）
 * 3、访问一个目录的子项，但是不能读写文件数据
 */
public class FileDemo {

	public static void main(String[] args) {
		/**
		 * 路径尽量选取相对路径，不同系统的路径方式不同，
		 * 相对路径可以做到跨平台。
		 * eclipse中当前目录（./）是当前程序所在项目的目录
		 * 例如：
		 * Windows中：D:/workspace/JavaStudy/demo.txt
		 * Linux中：home/soft01/eclipse_workspace/JavaStudy/demo.txt
		 */
		File file = new File("./demo.txt"); //file里面是文件的路径
		
		//获取文件名
		String name = file.getName();
		System.out.println("文件名："+name);
		
		//获取文件大小（字节数）
		long len = file.length();
		System.out.println("文件大小："+len);
		
		//文件是否可读可写
		boolean cr = file.canRead();
		boolean cw = file.canWrite();
		System.out.println("文件可读："+cr);
		System.out.println("文件可写："+cw);
		
		//是否隐藏
		boolean ih = file.isHidden();
		System.out.println("是否隐藏："+ih);
		
		long content = file.lastModified();
		System.out.println(content);
		
	}

}
