package com.syh.ex106;

import java.util.Scanner;

/**
 * ���������ֵ���ж������ڼ���(�ֱ���if����switch���ʵ��)�����磺<br/>
 * ���룺1<br/>
 * ���������1
 */
public class PrintWeek {
	public static void main(String[] args) {
		System.out.print("�������������֣�1~12����");
		
		switch (new Scanner(System.in).nextInt()) {
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
			System.out.println("������������");
			break;
		}
	}
}
