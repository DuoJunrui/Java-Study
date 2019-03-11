package part3.se.day01.string;
/**
 * @author: 多俊睿
 * @data: 2019年3月11日 下午8:37:28
 * @Description: String提供了一组重载的静态方法：valueOf
 * 作用是将java中其他类型转换为字符串。
 * 常见的是将基本类型转换为字符串
 */
public class ValueOfDemo {

	public static void main(String[] args) {

		//类型转换  int -> String
		int a = 123456;
		String str = String.valueOf(a); //性能好一些
		System.out.println(str);
		
		int d = 100;
		str = d + ""; //效果和String.valueOf()一样，但是性能差一点
		System.out.println(d);
	}

}
