package com.syh.ex105;

import java.util.Scanner;

/**
 * �����������������жϲ���ȡ�������нϴ��ֵ���ں�̨��ӡ�����
 */
public class CompareNumber {
	public static void main(String[] args) {
		//���������û��ڿ���̨��������
		Scanner sc = new Scanner(System.in);
		//�ռ����ֵ
		int max = 0;
		//�洢�û�����
		int tem = 0;
		
		//��ʾ����
		System.out.print("�������һ��������");
		max = sc.nextInt();
		System.out.print("������ڶ���������");
		tem = sc.nextInt();
		max = ( tem > max ? tem : max );
		System.out.print("�����������������");
		tem = sc.nextInt();
		max = ( tem > max ? tem : max );
		
		//������ֵ
		System.out.println(max);
	}
}
