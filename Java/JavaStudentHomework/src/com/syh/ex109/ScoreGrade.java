package com.syh.ex109;

import java.util.Scanner;

/**
 * ��дһ�γ�������ʱ���û����ʡ��㿼�˶��ٷ֣���0~100����������������ж���ȼ�����ʾ������
 * �ж����ݣ��� ��90~100�֣����� ��80~89�֣����� ��60~79�֣����� ��0~59�֣���
 */
public class ScoreGrade {
	public static void main(String[] args) {
		System.out.print("�㿼�˶��ٷ֣���0~100����");
		//���ڴ洢�û�����ķ���
		int i = new Scanner(System.in).nextInt();
		
		if ( i <= 100 && i >= 90 ) {
			System.out.println("��");
		} else if ( i < 90 && i >= 80 ) {
			System.out.println("��");
		} else if ( i < 80 && i >= 60 ) {
			System.out.println("��");
		} else if ( i < 60 && i >= 0 )  {
			System.out.println("��");
		} else {
			System.out.println("��ĳɼ���������");
		}
	} 
}
