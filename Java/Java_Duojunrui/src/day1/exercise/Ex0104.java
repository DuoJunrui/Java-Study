package day1.exercise;

import java.util.Scanner;

//�Ӽ����������������������û��ش����ǵĺͣ�������̺�ȡ������������ͳ�Ƴ���ȷ�𰸵ĸ�����
public class Ex0104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner math=new Scanner(System.in);
		System.out.println("�����һ�����֣�");
		num1=Integer.parseInt(math.nextLine());
		System.out.println("����ڶ������֣�");
		num2=Integer.parseInt(math.nextLine());
		
		int sum = num1+num2; //������	
		int sub = num1-num2; //������	
		int mul = num1*num2; //������
		int div = num1/num2; //������
		int mod = num1%num2; //ȡ������
		
		
		int i=0;
		System.out.println("�����������������ĺ͡�������̡�ȡ��Ľ����");
		int answer1=Integer.parseInt(math.nextLine());
		if(answer1==sum) {
			i++;
		}
		
		int answer2=Integer.parseInt(math.nextLine());
		if(answer2==sub) {
			i++;
		}
		
		int answer3=Integer.parseInt(math.nextLine());
		if(answer3==mul) {
			i++;
		}
		
		int answer4=Integer.parseInt(math.nextLine());
		if(answer4==div) {
			i++;
		}
		
		int answer5=Integer.parseInt(math.nextLine());
		if(answer5==mod) {
			i++;
		}
		
		System.out.println("��ϲ������һ���ش���ȷ��"+i+"�Σ�");
		System.out.println("����֮��Ϊ��"+sum);
		System.out.println("�������Ϊ��"+sub);
		System.out.println("�������Ϊ��"+mul);
		System.out.println("�������Ϊ��"+div);
		System.out.println("����ȡ��Ϊ��"+mod);
		
		
	}

}
