package part3.se.day01.string;
/**
 * @author: 多俊睿
 * @data: 2019年3月11日 下午8:01:02
 * @Description: String trim()
 * 去除当前字符串两边的空白字符,只去除两边的空白字符
 */
public class TrimDemo {

	public static void main(String[] args) {

		String str = "  Hello		";
		System.out.println(str);
		String trim = str.trim();
		System.out.println(trim);
	}

}
