package day2.exercise;

//���������࣬���� NumberHolder����дһЩ������ʵ���Ĵ��룬��ʼ����������Ա������Ȼ����ʾÿ����Ա������ֵ��

		class NumberHolder{
			String massages="NumberHolder����ʲô��˼�أ�";
			String put="Holder�ǳ����˵���˼������NumberHolder�ҾͲ�֪���ˡ�";
			
			void output() {
				System.out.println(massages);
				System.out.println(put);
			}
		}
	
		class Student{
		int num=1551200124;
		String name = "�࿡�";
		String sex = "��";
		
		void work() {
			
			System.out.println(name+ "�����ô��룡");
		}
	}
	
	class Computer{
		int comid = 25; //����ID
		String brand = "��˶";
		
		void work() {
			System.out.println("���ɵ��ǣ���" +comid+"��"+brand+ "���Գ��������ˣ�");
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
