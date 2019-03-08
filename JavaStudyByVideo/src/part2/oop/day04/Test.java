package part2.oop.day04;

public class Test {
	public static void main(String[] args) {

		Person[] ps = new Person[4];
		ps[0] = new Student("多俊睿", 23, "甘肃武威", 1551200124);
		ps[1] = new Student("黄虎林", 21, "河北石家庄", 1551200125);
		ps[2] = new Teacher("王老师", 22, "天津", 1000);
		ps[3] = new Doctor("裴医生", 22, "安徽安庆", "副主任医师");
		for (int i = 0; i < ps.length; i++) {
			//System.out.println(ps[i].name+","+ps[i].age+","+ps[i].address);
			ps[i].sayHai();
		}
		
		System.out.println("----------------------");
		//重写方法被调用时，看对象的类型
		Person p1 = new Student("ssss", 26, "zhongguo", 1008611); //向上造型
		Student p2 = new Student("你试试", 25, "shishi", 1230611);
		p1.sayHai();  //调Student类的
		p2.sayHai();  //调Student类的
		
	}

}
