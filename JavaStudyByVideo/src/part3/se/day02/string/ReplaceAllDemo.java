package part3.se.day02.string;
/**
 * @author: 多俊睿
 * @data: 2019年3月12日 下午3:11:29
 * @Description: 字符创支持正则表达式方法三：
 * String replaceAll(String regex, String str)
 * 将当前字符串中满足正则表达式的部分替换为给定的字符串。
 */
public class ReplaceAllDemo {

	public static void main(String[] args) {

		String str = "abc123fgg55vvb";
		/**
		 * 将数部分替换为#NUMBER#
		 */
		str = str.replaceAll("[0-9]+", "#NUMBER#");
		System.out.println(str); //abc#NUMBER#fgg#NUMBER#vvb
		
		/**
		 * 将字母串替换为#CHAR#
		 */
		String str2 = "abC123fGg55Vvb";
		str2 = str2.replaceAll("[a-zA-Z]+", "#CHAR#");
		System.out.println(str2); //#CHAR#123#CHAR#55#CHAR#
		
		/**
		 * 和谐用语
		 * 替换一些粗俗骂人的话
		 */
		String rule = "(mmp|nc|mdzz|cnm)";
		String message = "你怎么这么菜，cnm会不会打游戏啊mmp，真的mdzz";
		message = message.replaceAll(rule, "***");
		System.out.println(message);
	}

}
