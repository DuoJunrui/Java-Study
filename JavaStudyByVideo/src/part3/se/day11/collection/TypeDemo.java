package part3.se.day11.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author: 多俊睿
 * @data: 2019年3月21日 下午1:35:00
 * @Description: JDK 1.5 之后推出一个新特性： 泛型
 * 泛型又称为参数化类型，允许调用者在调用某个类的功能时
 * 传入一个或多个类型来定义该类的属性，方法的参数以及返回值
 * 的类型。这大大的提高了代码的灵活度。
 * 
 * 泛型应用最广泛的地方就是集合，用来指定集合中的元素类型。
 * 
 * 泛型也是编译器认可，jvm不认可   jvm认为泛型的原型就是Object
 * 泛型只是编译器约束，jvm没有泛型的
 */
public class TypeDemo {

	public static void main(String[] args) {
		
		//泛型的原型就是Object
		Collection<String> c = new ArrayList<String>();
		//编译器检测实参类型是否符合泛型要求
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		c.add("six");
//		c.add(1); //编译不通过，集合泛型指定类型 String
		
		Iterator<String> iterator = c.iterator();
		while (iterator.hasNext()) {
			
			//获取元素时无需再造型，编译器会自动添加造型代码
			String string = iterator.next();
			System.out.println(string);
		}
		
		System.out.println("-------for新循环 - - - - - - - - - - ");
		for (String string : c) {
			System.out.println(string);
		}
		
	}

}
