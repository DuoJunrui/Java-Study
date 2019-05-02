package com.syh.ex102;

/**
 * 基础题：创建一个数组，向数组添加数字，并用for循环遍历出数组的数字并求和，打印求和结果。<br/>
 * 提升题：求出数组[1,2,3,4,6,10,33,5,9,22,0,-1]最小和最大的值
 */
public class ErgodicArray {
	public static void main(String[] args) {
		show1();
		show2();
	}
	
	//遍历数组
	static void show1() {
		int[] is1 = new int[]{5, 3, 9, 7, 8};
		System.out.println("遍历数组is1：");
		for ( int i : is1 ) {
			System.out.println(i);
		}
	}
	
	//求最大最小值
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
		
		System.out.println("最大值为：" + max);
		System.out.println("最小值为：" + min);
	}
}
