package com.syh.ex107;

import java.util.Scanner;

/** 
 *  дһ��for��䣬Ҫ��Ӽ���¼��������������m��n��֮�����n~m�ĺ͡������磬����1��4����ô���Ϊ1+2+3+4=10��
 */
public class NumberSum {
	public static void main(String[] args) {
		//���������û��ڿ���̨��������
		Scanner sc = new Scanner(System.in);
				
		//���ڴ洢�û�����ķ�Χ
		int m = 0;
		int n = 0;
		
		//�������
		int sum = 0;
		
		//��������
		while (true) {
			System.out.println("������m��ֵ");
			m = sc.nextInt();
			System.out.println("������n��ֵ");
			n = sc.nextInt();
			
			//�ж�m�Ƿ�С��n��ע�⣬��ĿҪ��������m��������n�������n~m�ĺ�
			//���������������ʾ��������
			if ( m < n ) {
				System.out.println("����������������������");
				continue;
			}
			
			break;
		}
		
		System.out.print(n + "~" + m + "�ĸ���������ӵĺ�Ϊ��");
		//ѭ�����������������
		while ( n <= m ) {
			sum += n++;
		}
		System.out.println(sum);
	}
}
