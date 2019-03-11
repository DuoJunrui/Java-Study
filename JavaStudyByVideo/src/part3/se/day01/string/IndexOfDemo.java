package part3.se.day01.string;
/**
 * 
 * @author: 多俊睿
 * @data: 2019年3月11日 下午7:28:15
 * @Description: int indexOf(String str)
 * 查看给定字符串在当前字符串中第一次出现的位置，
 * 若当前字符串不含有该内容则返回值为-1。
 */
public class IndexOfDemo {

	public static void main(String[] args) {
		//            0123456789012345
		String str = "thinking in java";
		int i = str.indexOf("in");
		System.out.println("index1:" + i); //2
		
		//从指定位置开始找
		i = str.indexOf("in", 3);
		System.out.println("index2:" + i); //5
		
		//查找最后一次出现给定字符串的位置
		i = str.lastIndexOf("in");
		System.out.println("index3:" + i); //9
		
		//查找不存在的字符或字符串，返回值为-1
		i = str.indexOf("m");
		System.out.println("index4" + i); //-1
 	}

}
