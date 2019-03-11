package part3.se.day01.string;
/**
 * @author: 多俊睿
 * @data: 2019年3月11日 下午8:25:51
 * @Description: 
	boolean startstWith(String str)
	boolean endsWith(String str)
	排断当前字符串是否以给定的字符开始或者结束
 */
public class StartsWithDemo {

	public static void main(String[] args) {

		String string = "thinking in java";
		
		boolean starts = string.startsWith("thi");
		System.out.println("starts:"+starts);
		
		String str = "photo.png";
		boolean ends = str.endsWith("png");
		System.out.println("ends:"+ends);
	}

}
