package part3.se.day01.string;
/**
 * @author: 多俊睿
 * @data: 2019年3月11日 下午7:35:14
 * @Description: String substring(int s, int e)
 * 截取当前字符串中指定范围内的子字符串
 */
public class SubstringDemo {

	public static void main(String[] args) {
		//            0123456789012345
		String str = "thinking in java";
		
		//截取[5,8)的字符串，包含5，不包含8
		String sub = str.substring(5,8); //ing
		System.out.println(sub);
		
		//截取包含指定位置及后面的字符串内容
		sub = str.substring(9);
		System.out.println(sub); //in java
	}

}
