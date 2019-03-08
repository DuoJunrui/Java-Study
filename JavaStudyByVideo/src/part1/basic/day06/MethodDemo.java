package part1.basic.day06;
/**
 * 
 * @author: 多俊睿
 * @data: 2019年3月3日 下午3:26:51
 * @Description: 方法的声明和调用
 */
public class MethodDemo {

	public static void main(String[] args) {
		say();  //无参方法的调用
		sayHello("duojunrui"); //有参方法的调用，参数类型必须匹配
		String student = "huanghulin"; //先给一个变量赋值
		sayHello(student); //调用有参方法，将变量传给该方法
		
		String day = day();  //有返回值的方法，调用后要赋值给另一个值去使用它，成为调用方。
		System.out.println(day);
		
		int sum = plus(12,3);  //声明调用方并接收返回值
		System.out.println("和为："+sum); // 输出调用方所接收方法的返回值
		
		int num1=2, num2=33;
		int sum2 = plus(num1, num2);
		System.out.println("sum2="+sum2);
	}
	
	//声明一个有参，有返回值的方法
	public static int plus(int a, int b) {
		int sum = a+ b;
		return sum;   
	}
	
	//声明一个无参，有返回值的方法
	public static String day() {
		return "今天是坚持学Java的第四天，继续加油！";
	}
	
	//声明一个有参，无返回值的方法 
	public static void sayHello(String name) {
		System.out.println("大家好，我是"+ name);
	}
	
	//声明一个无参，无返回值的方法
	public static void say() {
		System.out.println("大家好，我是DJR。");
	}

}
