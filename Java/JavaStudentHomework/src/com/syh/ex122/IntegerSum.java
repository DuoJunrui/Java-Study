package com.syh.ex122;

import java.util.Scanner;

/**
 * ��s = a + aa + aaa + aaaa + aa...a��ֵ������a��һ�����֡�����2 + 22 + 222 + 2222 + 22222
 * (��ʱ����5�������)������������м��̿���
 */
public class IntegerSum {
	public static void main(String[] args) {
		//����������ӵ�����
		int num = 0;
		//�������ӵ�����
		int count = 0;
		//�������ӵĽ����ע�⣬����������ֹ���ʱ�ᳬ��int�ķ�Χ�����Դ˴����Խ��価���ܶ�Ϊlong����
		long sum = 0;
		//�����û�����¼������
		Scanner sc = new Scanner(System.in);
		
		//��ʾ�û�����
		System.out.print("������������ӵ����֣�");
		num = sc.nextInt();
		System.out.print("���������ӵĴ�����");
		count = sc.nextInt();
		
		//���ڷŴ�һ�����ֵı���
		long j = 1;
		long n = num;
		
		//ѭ������ʼ����
		for ( int i = 0; i < count; i++ ) {
			sum += n;
			j *= 10;
			n = n + num * j;
		}
		
		System.out.println("�������ӵĽ��Ϊ��" + sum);
	}
}
