package part2.oop.day07;

/**
 * @author: 多俊睿
 * @data: 2019年3月8日 上午10:13:48
 * @Description: 成员内部类演示
 */
public class InnerClassDemo {

	public static void main(String[] args) {
		
		Mama mama = new Mama();
		//Baby baby = new Baby(); //编译错误，内部类对外不可见
	}
}

class Mama{ //外部类
	
	private String name;
	
	void createBaby(){
		Baby baby = new Baby();//正确，内部类只有自己的外部类可以访问
	}
	
	class Baby{ //内部类
		void showMamaName(){
			System.out.println(name);//内部类可以访问外部类的私有成员name 隐式Mama.this.name
			System.out.println(Mama.this.name); //和上面的结构一样
		//	System.out.println(this.name); //错的，这的this 指Baby{} 类中的成员，Baby{}中没有name
		}
	}
}