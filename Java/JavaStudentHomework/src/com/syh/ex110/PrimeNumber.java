package com.syh.ex110;

public class PrimeNumber {
	public static void main(String[] args) {
		//�жϸ������Ƿ�Ϊ����
		boolean isPrime = false;
		
		//���ѭ����������е�����
		for ( int i = 2; i < 1001; i++ ) {
			for ( int j = 2; j <= i; j++  ) {
				//��ٵ�ǰ��������֮ǰ���������ȡ�࣬��ȡ���0����i��j����ͬ����ʱ˵����ǰ���ֲ����������������ǰѭ��
				if ( i % j == 0 && i != j ) {
					isPrime = false;
					break;
				}
				
				isPrime = true;
			}
			
			if ( isPrime ) {
				System.out.println(i);
			}
		}
	}
}
