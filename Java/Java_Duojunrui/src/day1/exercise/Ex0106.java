package day1.exercise;

import java.util.Scanner;

/*���������ֵ���ж������ڼ���(�ֱ���if����switch���ʵ��)
	���磺���룺1	 
	      ���������1
*/
public class Ex0106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������������ţ�");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		
		if(a==1){
			System.out.println("����һ");
		}
		if(a==2){
			System.out.println("���ڶ�");
		}
		if(a==3){
			System.out.println("������");
		}
		if(a==4){
			System.out.println("������");
		}
		if(a==5){
			System.out.println("������");
		}
		if(a==6){
			System.out.println("������");
		}
		if(a==7){
			System.out.println("������");
		}
		
		
		switch (a) {
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		case 7:
			System.out.println("������");
			break;
		default:
			System.out.println("������Χ��������1~7�����֣�");
			break;
		}
	}

}
