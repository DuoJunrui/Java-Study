package day3.exercise.randomchars;

/**
 * 
 * @author 多俊睿
 * @date 2018年7月23日 下午12:42:35 
 *
 */

public class TestRandom {

	public static void main(String[] args) throws Exception {
		
		RandomChars rc = new RandomChars(10, Enumerate.NUMBER);
		
		System.out.println("默认字符串长度："+rc.getLenght());
		System.out.println("默认字符串类型："+rc.getArea());
		System.out.println("生成的随机字符串："+rc.getChars());
		
		System.out.println("");
		
		rc.setArea(false, "AFRXC");//用户设置字符串
		//rc.setArea(true, "ADJ");
		rc.setLength(20);
		rc.creatChars();
		System.out.println("用户定义的字符串长度："+rc.getLenght());
		System.out.println("用户定义的字符串类型："+rc.getArea());
		System.out.println("生成的随机字符串："+rc.getChars());
		
		rc.deleteChar("XC");
		System.out.println("删除自定义字符后的字符串："+rc.getArea());
	
	}
}
