package com.syh.ex104;

import java.util.Scanner;

/**
 * �Ӽ����������������������û��ش����ǵĺͣ�������̺�ȡ������������ͳ�Ƴ���ȷ�𰸵ĸ�����
 */
public class AnswerResult {
	public static void main(String[] args) {
		//���������û��ڿ���̨��������
		Scanner sc = new Scanner(System.in);
		//�洢�������ڼ���ı���
		int i = 0;
		int j = 0;
		
		//�洢��ȷ��Ŀ�ĸ���
		int count = 0;
		
		//��ʾ�û�����
		System.out.print("������һ��������");
		i = sc.nextInt();
		System.out.print("��������һ��������");
		j = sc.nextInt();
		
		System.out.print("�����:" + i + " + " + j + " = ");
		//�ж��û������Ƿ���ȷ������ȷ������ȷ������1
		count += (sc.nextInt() == (i + j) ? 1 : 0);
		
		System.out.print("�����:" + i + " - " + j + " = ");
		//�ж��û������Ƿ���ȷ������ȷ������ȷ������1
		count += (sc.nextInt() == (i - j) ? 1 : 0);
		
		System.out.print("�����:" + i + " * " + j + " = ");
		//�ж��û������Ƿ���ȷ������ȷ������ȷ������1
		count += (sc.nextInt() == (i * j) ? 1 : 0);
		
		System.out.print("�����:������������" + i + " / " + j + " = ");
		//�ж��û������Ƿ���ȷ������ȷ������ȷ������1
		count += (sc.nextInt() == (i / j) ? 1 : 0);
		
		System.out.print("�����:" + i + " % " + j + " = ");
		//�ж��û������Ƿ���ȷ������ȷ������ȷ������1
		count += (sc.nextInt() == (i % j) ? 1 : 0);
		
		//������
		System.out.println("�������Ŀ�ĸ���Ϊ��" + count);
	}
}
