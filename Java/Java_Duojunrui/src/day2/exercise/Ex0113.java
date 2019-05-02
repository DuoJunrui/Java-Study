package day2.exercise;

//给定以下类，调用 NumberHolder，编写一些创建类实例的代码，初始化其两个成员变量，然后显示每个成员变量的值。

		class NumberHolder{
			String massages="NumberHolder代表什么意思呢？";
			String put="Holder是持有人的意思。但是NumberHolder我就不知道了。";
			
			void output() {
				System.out.println(massages);
				System.out.println(put);
			}
		}
	
		class Student{
		int num=1551200124;
		String name = "多俊睿";
		String sex = "男";
		
		void work() {
			
			System.out.println(name+ "正在敲代码！");
		}
	}
	
	class Computer{
		int comid = 25; //电脑ID
		String brand = "华硕";
		
		void work() {
			System.out.println("不巧的是，第" +comid+"号"+brand+ "电脑出现问题了！");
		}
	}
	
	public class Ex0113 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Student stu = new Student();
			Computer com = new Computer();
			NumberHolder num = new NumberHolder();
			stu.work();
			com.work();
			num.output();
		
		}
		
}
