package part3.se.day01.string;
/**
 * @author: 多俊睿
 * @data: 2019年3月11日 下午8:32:12
 * @Description: 
	String toUpperCase()
	String toLowerCase()
	将当前字符串中的英文部分转换为全大写或者全小写
 */
public class ToUpperCaseDemo {

	public static void main(String[] args) {

		String str1 = "英文字母：AbCdefGh";
		String upper = str1.toUpperCase();
		String lower = str1.toLowerCase();
		System.out.println("全部转换为大写->"+upper);
		System.out.println("全部转换为小写->"+lower);
	}

}
