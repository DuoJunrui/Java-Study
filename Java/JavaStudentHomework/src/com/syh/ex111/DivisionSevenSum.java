package com.syh.ex111;
/**
 * ���1~1000֮��������ܱ�7�������������㲢���ÿ5���ĺ͡�
 */
public class DivisionSevenSum {
	public static void main(String[] args) {
		int j = 1000;
		int num = 7;
		
		//��������
		int sum = 0;
		//�����ж������
		int count = 0;
		
		//ѭ�����г�1~count���е�����
		for ( int i = 1; i < j; i++ ) {
			//�ж������Ƿ����ܱ�7����
			if ( i % num == 0 ) {
				System.out.print(i);
				//��sum�м��ϸ�����
				sum += i;
				//�����++
				count++;
				
				if( count == 5 ) {
					System.out.println(" = " + sum);
					sum = 0;
					i = i - ((count - 1) * 7);
					count = 0;
					continue;
				} else {
					System.out.print(" + ");
				}
			}
		}
	}
}
