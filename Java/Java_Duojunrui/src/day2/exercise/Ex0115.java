package day2.exercise;

import java.util.Scanner;

class A {
	int v = 100;
	int u;//�û��µ���

	void guess(){
		System.out.println("��������һ����������Ϸ����ֵ��Χ��0~200�ڣ���������µ���ֵ��");
		Scanner in = new Scanner(System.in);
		int u = in.nextInt();

			if(v < u) {
				System.out.println("��µ�ֵƫ��");
				
			}else if(v > u) {
				System.out.println("��µ�ֵƫС��");
				
			}else{
				System.out.println("��ϲ�㣬�¶��ˡ�");
				
			}
	}
}

public class Ex0115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.guess();
	}

}
