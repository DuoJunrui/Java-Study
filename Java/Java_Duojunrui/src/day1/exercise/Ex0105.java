package day1.exercise;

import java.util.Scanner;

//�����������������жϲ���ȡ�������нϴ��ֵ���ں�̨��ӡ�����
public class Ex0105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("�������һ������:");
		int a = sc.nextInt();

		System.out.println("������ڶ�������:");
		int b = sc.nextInt();

		System.out.println("���������������:");
		int c = sc.nextInt();
		
		int max = a;
		if(max<b) {
			max=b;
			}
		if(max<c) {
			max=c;
		}
		System.out.println("���������е����ֵ�ǣ�"+ max);
		
		}


}
