package com.syh.ex102;

/**
 * �����⣺����һ�����飬������������֣�����forѭ����������������ֲ���ͣ���ӡ��ͽ����<br/>
 * �����⣺�������[1,2,3,4,6,10,33,5,9,22,0,-1]��С������ֵ
 */
public class ErgodicArray {
	public static void main(String[] args) {
		show1();
		show2();
	}
	
	//��������
	static void show1() {
		int[] is1 = new int[]{5, 3, 9, 7, 8};
		System.out.println("��������is1��");
		for ( int i : is1 ) {
			System.out.println(i);
		}
	}
	
	//�������Сֵ
	static void show2() {
		int max = 0;
		int min = 0;
		int[] is1 = new int[]{1, 2, 3, 4, 6, 10, 33, 5, 9, 22, 0, -1};
		for ( int i : is1 ) {
			if ( i > max ) {
				max = i;
				continue;
			}
			
			if ( i < min ) {
				min = i;
				continue;
			}
		}
		
		System.out.println("���ֵΪ��" + max);
		System.out.println("��СֵΪ��" + min);
	}
}
