package part3.se.day07.exception;
/**
 * @author: 多俊睿
 * @data: 2019年3月17日 下午11:10:40
 * @Description: 
	处理异常常用API方法
 */
public class ExceptionApiDemo {

	public static void main(String[] args) {
		System.out.println("程序开始。");
		try {
			String str = "a";
			System.out.println(Integer.parseInt(str));
		} catch (Exception e) {
			//输出错误堆栈信息，有助于定位错误并解决
			e.printStackTrace();
			
			//第二种输出异常信息的方式
			String message = e.getMessage();
			System.out.println(message);
		}
		System.out.println("程序结束");

	}

}
