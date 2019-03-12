package part3.se.day02.integer;
/**
 * @author: 多俊睿
 * @data: 2019年3月12日 下午7:18:52
 * @Description: 
 * 由于基本类型不能直接参与面向对象的开发，所以Java提供了8个基本类型所对应的包装类，
 * 从而可以将基本类型转换为“对象”，这样就可以参与面向对象的模式进行开发了。
 * 
 * 6个数字类型的包装类继承自java.lang.Number
 * Number是一个抽象类，定义了可以让数字类型之间进行互转的方法。
 */
public class IntegerDemo {

	public static void main(String[] args) {
		int d = 128;
		//Integer i1 = new Integer(d);
		//Integer i2 = new Integer(d);
		
		//推荐使用valueOf方法将基本类型转换为包装类
		Integer i1 = Integer.valueOf(d);
		Integer i2 = Integer.valueOf(d);
		
		System.out.println(i1==i2); //flase 
		//通过查看源码，超过127就new一个新对象 对过不超过127就复用相同的对象
		
		System.out.println(i1.equals(i2)); //true
		
		int in = i1.intValue();
		double dou = i1.doubleValue();
		System.out.println(dou);//128.0
		
		byte b = i1.byteValue();
		System.out.println(b); //-128  byte最大值127， 加1，变为最小值

		
		System.out.println("--------分割线----------");
		
		/**
		 * 数字类型的包装类都有两个常量：
		 * MAX_VALUE, MIN_VALUE
		 * 用于表示其对应的基本类型数据的取值范围
		 */
		int intMax = Integer.MAX_VALUE;
		System.out.println("int类型的最大值为："+intMax);
		int intMin = Integer.MIN_VALUE;
		System.out.println("int类型的最小值为："+intMin);
		
		long longMax = Long.MAX_VALUE;
		System.out.println("long类型的最大值为："+longMax);
		long longMin = Long.MIN_VALUE;
		System.out.println("long类型的最小值为："+longMin);
		
		//......其他基本数据类型
		
		
		System.out.println("--------分割线----------");
		/**
		 * 包装类支持一个静态方法：parseXXX(String str)
		 * 可以将给定的字符串解析为对应的基本类型，
		 * 但是前提是该字符串内容必须正确表示基本类型可以保存的值。
		 */
		String str = "123";
		int dd = Integer.parseInt(str);
		System.out.println(dd+1); //123+1=124
		
		double dou1 = Double.parseDouble(str);
		System.out.println(dou1); //123.0
		
		
		System.out.println("--------分割线----------");
		
		/**
		 * JDK1.5之后推出了一个特性：自动拆装箱，该特性是编译器认可，而非JVM认可。
		 * 编译器在编译源代码时会自动补全基本类型与包装类之间的转换，代码完成相互转换工作，
		 * 从而让我们在编写源代码时实现了基本类型与包装类之间相互赋值的操作。
		 */
		
		/**
		 * 触发了编译器  自动拆箱  特性
		 * 编译器会自动补全代码完成  包装类转换为基本类型  的操作，
		 * 下面代码在class文件中会被改为：
		 * int d2 = new Integer(1).intValue();
		 */
		int d2 = new Integer(1);
		// 基本类型 接收 引用类型 JDK1.5 直接这样写是错误的  
		
		
		/**
		 * 触发了编译器  自动装箱  特性
		 * 编译器会自动补全代码完成  基本类型转换为包装类  的操作，
		 * 下面代码在class文件中会被改为：
		 * Integer inn = Integer.valueOf(1);
		 */
		Integer inn = 1;
		
	}

}
