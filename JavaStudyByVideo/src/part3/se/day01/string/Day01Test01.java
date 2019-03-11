package part3.se.day01.string;
/**
 * @author: 多俊睿
 * @data: 2019年3月11日 下午7:49:07
 * @Description: 小练习，截取域名中企业的名称
 */
public class Day01Test01 {

	public static void main(String[] args) {
		
		String str = "www.souhu.com.cn";
		//String str = "www.baidu.com";
		String name = getHostName(str);
		System.out.println("name:"+name);
	}
	
	public static String getHostName(String str) {
		int firstIndex = str.indexOf("."); //找到第一个.的位置
		int secondIndex = str.indexOf(".",firstIndex+1); //找到第二个.的位置
		String name = str.substring(firstIndex+1, secondIndex);  //截取两点之间的名称
		return name;
	}
}


