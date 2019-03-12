package part3.se.day02.object;
/**
 * 测试Point重写的Object方法
 * 重写toString()方法 和 equals()方法
 */
public class TestPoint {

	public static void main(String[] args) {

		Point p = new Point(1,2);
		/**
		 * Object定义的toString方法返回的是该对象的地址信息。
		 * 实际开发中意义不大，所以若我们要用，通常会重写这个方法。
		 * 注意：Java提供给我们的类妥善重写过该方法。
		 * 只有我们自己定义的类通常要重写
		 */
		String str = p.toString();
		
		System.out.println(str); 
		//part3.se.day02.object.Point@15db9742
		//所在的包名.对象名 所在内存的地址
		
		/**
		 * System.out.println(Object o)
		 * 该方法会将给定对象toString方法返回的
		 * 字符串输出到控制台
		 * 系统自己调toString()方法
		 */
		System.out.println(p);
		
		
		System.out.println("--------我是华丽的分割线-------------");
		Point p2 = new Point(1,2);
		System.out.println(p==p2); //false
		
		/**
		 * Object提供的equals内部就是 "==" 比较的
		 * 所以不重写没有实际意义。
		 */
		System.out.println(p.equals(p2)); //false
	}

}
