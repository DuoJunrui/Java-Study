package com.syh.ex121;

import java.util.Scanner;

/**
 * ����һ���ַ������ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ���
 */
public class StatisticsChar {
	public static void main(String[] args) {
		//���ڴ洢�û�������ַ���
		String s = "";
		
		//��ʾ�û���������
		System.out.println("������һ���ַ�����");
		s = new Scanner(System.in).nextLine();
		
		//����ͳ�Ƶı������˴��Ҽ�дΪֻͳ���ַ��Լ����֣�������������һ��
		//ͳ���ַ�
		int charCount = 0;
		//ͳ������
		int numCount = 0;
		
		//ѭ�������ַ����з�
		for (int i = 0; i < s.length(); i++) {
			if ( s.charAt(i) > '0' && s.charAt(i) < '9' ) {
				numCount++;
			} else {
				charCount++;
			}
		}
		
		System.out.println("�����У�" + numCount);
		System.out.println("�����ַ��У�" + charCount);
	}
}
