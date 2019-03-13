package part3.se.day03.raf;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author: 多俊睿
 * @data: 2019年3月13日 下午3:15:44
 * @Description: java.io.RandomAccessFile
 * 该类设计用来专门读写文件数据，其基于指针进行读写，
 * 即：总是在指针当前位置进行读写字节
 * 
 * RAF有两种
 * 只读模式：r
 * 读写模式：rw
 */
public class RandomAccessFileDemo {

	public static void main(String[] args) throws IOException {

		/**
		 * RAF常用的构造方法
		 * RandomAccessFile(String path, String mode)
		 * RandomAcessFile(File file, String mode)
		 * mode:操作模式，只读或读写
		 */
		RandomAccessFile raf = new RandomAccessFile("./test.txt", "rw");
		System.out.println("执行完毕！");
		
		/**
		 * void write(int d)
		 * 写出一个字节，将给定的int值对应的2进制的“低八位”写入文件
		 * 							后面这8位就叫做低八位
		 * 00000000 00000000 00000000 00000001
		 */
		raf.write(1); //它写入的并不是眼睛看到的1  二是二进制00000001  不同的编码对该串解析不一样
		raf.write(97); //a  因为97的二进制和a的二进制一样，所以记事本打开显示为a
		System.out.println("写入完毕。");
		raf.close(); //记得进行IO操作后关闭IO操作的方法
	}

}
