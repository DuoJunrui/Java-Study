package part3.se.day02.string;
/**
 * @author: 多俊睿
 * @data: 2019年3月12日 下午1:56:20
 * @Description: 字符串支持正则表达式的方法之一：
 * boolean matches(String regex)
 * 使用给定的正则表达式验证当前字符串是否满足格式要求，
 * 满足则返回true
 */
public class MatchesDemo {

	public static void main(String[] args) {
		
		String email = "duojunrui@163.com";
		/*
		 * Email的正则表达式
		 * [a-zA-Z0-9_]+@[a-zA-Z0-9]+(\.[a-zA-Z]+)+
		 */

		            //   duojunrui   @   163         .com
		String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
		
		//matches方法中正则表达式不写边界符（^ $）也是全匹配
		boolean match = email.matches(regex);
		if (match) {
			System.out.println("是邮箱。");
		}else {
			System.out.println("不符合邮箱格式！");
		}
	}

}
