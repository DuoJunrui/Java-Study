package part3.se.day06.exception;

import java.io.FileInputStream;

/**
 * @author: 多俊睿
 * @data: 2019年3月15日 下午10:25:33
 * @Description: JDK 1.7 之后推出一个新特性：自动关闭
 */
public class FinallyDemo3 {

	public static void main(String[] args) {

		/**
		 * 实现了AutoCloseable接口的可以定义在括号里面
		 * 该特性是编译器认可，最终编译器还是会将代码改为在
		 * finally中关闭该流。
		 */
		try ( FileInputStream fis = new FileInputStream("fos.txt") ) {
			int d = fis.read();
			System.out.println(d);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
