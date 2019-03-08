package part1.basic.day06;
/**
 * 
 * @author: 多俊睿
 * @data: 2019年3月3日 下午3:37:44
 * @Description: 方法的嵌套调用
 */
public class MethodNest {

	public static void main(String[] args) {
		
		aaa(); //456, 789, www, abc, 123

	}
	
	public static void aaa() {
		bbb(); //嵌套调用方法
		System.out.println(123);
	}
	
	public static void bbb() {
		System.out.println(456);
		ccc();
	}

	private static void ccc() {
		// TODO Auto-generated method stub
		System.out.println(789);
		ddd();
		System.out.println("abc");
	}

	private static void ddd() {
		// TODO Auto-generated method stub
		System.out.println("www");
	}

}
