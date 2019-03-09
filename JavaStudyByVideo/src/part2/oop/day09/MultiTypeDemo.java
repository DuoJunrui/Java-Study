package part2.oop.day09;
/**
 * @author: 多俊睿
 * @data: 2019年3月9日 下午6:42:13
 * @Description: 多态的演示
 */
public class MultiTypeDemo {

	public static void main(String[] args) {
		Moo o = new Noo(); //向上造型（自动类型转换）
		Noo o1 = (Noo)o;   //o指向的对象就是Noo
		Inter8 o2 = (Inter8)o; //o指向的对象实现了
		//Poo o3 = (Poo)o; //ClassCastException 类转换异常
		if (o instanceof Poo) { //false
			Poo o4 = (Poo)o;
		}
	}
}

interface Inter8{
	
}

class Moo{
	
}

class Noo extends Moo implements Inter8{
	
}

class Poo extends Moo{
	
}