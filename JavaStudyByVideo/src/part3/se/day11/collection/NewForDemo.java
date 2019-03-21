package part3.se.day11.collection;
/**
 * @author: 多俊睿
 * @data: 2019年3月21日 下午12:59:05
 * @Description: 增强for循环
 * @since: JDK 1.5
 * 新循环是用来遍历集合或数组使用的。
 * 新循环又称为：增强for循环， for each
 */
public class NewForDemo {

	public static void main(String[] args) {
		
		String[] array = {"one","two","three","five","six"};
		
		for (int i = 0; i < array.length; i++) {
			String str = array[i];
			System.out.println(str);
		}
		
		System.out.println("--------------------");
		//新for循环是编译器认可，而不是jvm认可，
		//编译器会将新循环遍历数组改为普通for循环遍历
		for (String str : array) {
			System.out.println(str);
		}
	}
}
