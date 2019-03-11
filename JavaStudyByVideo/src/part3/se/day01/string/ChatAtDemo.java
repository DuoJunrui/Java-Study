package part3.se.day01.string;
/**
 * @author: 多俊睿
 * @data: 2019年3月11日 下午8:04:49
 * @Description: char charAt(int index)
 * 获取指定位置对应的字符
 */
public class ChatAtDemo {

	public static void main(String[] args) {

		String str = "thinking in java";
		//查看第5个位置的字符
		char c = str.charAt(4);
		System.out.println(c);
		
		/**
		 * 检测规律：正数位置的字符与倒数位置的字符都是一样的就是回文
		 */
		String info = "上海自来水来自海上";
		for (int i = 0; i < info.length()/2; i++) { //遍历字符串的一半
			if (info.charAt(i) != info.charAt(info.length()-1-i) ) {
				System.out.println("不是回文。");
				/**
				 * 当方法的返回值类型为void时，
				 * return是可以单独使用的，
				 * 作用是结束当前方法
				 */
				return;
			}
		}
		System.out.println("是回文。");
	}

}
