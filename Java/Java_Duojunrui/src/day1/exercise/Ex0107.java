package day1.exercise;

import java.util.Scanner;

//дһ��for��䣬Ҫ��Ӽ���¼��������������m��n��֮�����n~m�ĺ͡������磬����1��4����ô���Ϊ1+2+3+4=10��
public class Ex0107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("����������������ֵm��n��");
		int m = in.nextInt();
		int n = in.nextInt();
		int sum=0,temp=0;
		
		if(m>n) {
			temp=m;
			m=n;
			n=temp;
		}
		
		for(int x=m;x<=n;x++) {
			sum=sum+x;
		}
		System.out.println("m�ǣ�" +m+ "\nn�ǣ�" +n+ "\n����֮�����������ĺ��ǣ�" +sum);
	}

}
