package part1.basic.day06;

import java.util.Arrays;

public class Exercise {

	public static void main(String[] args) {
		//exerciseNum1();
		Bubble();

	}
	
	/**
	 * 课堂练习
	 * 将数组元素最大值放在数组最后一个元素的下一个位置
	 */
	public static void exerciseNum1() {
		//先初始化一个数组
		int[] arr = new int[10];
		
		//给数组的元素随机赋值
		for (int i = 0; i < arr.length; i++) {
			arr[i]= (int)(Math.random()*100);
			System.out.print("arr["+i+"]="+arr[i] + " ");
		}
		
		//求数组元素中的最大值
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println();
		System.out.println("数组元素中的最大值为："+max);
		
		//进行数组扩容，增长一位
		arr = Arrays.copyOf(arr, arr.length+1);
		
		//将最大值赋值给数组的最后一位
		arr[arr.length-1] = max;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr["+i+"]="+arr[i] + " ");
		}
	}
	
	/**
	 * 冒泡排序
	 */
	public static void Bubble() {
		//先初始化一个数组
		int[] arr = new int[10];
		
		//给数组的元素随机赋值
		for (int i = 0; i < arr.length; i++) {
			arr[i]= (int)(Math.random()*100);
			System.out.println("arr["+i+"]="+arr[i]);
		}
		
		//进行冒泡排序
		for (int i = 0; i < arr.length-1; i++) { //控制需要几轮排序
			for (int j = 0; j < arr.length-1-i; j++) {  //控制每轮排序需要比较多少次
				//每次是该值和后一个进行比较，进行比较并交换值
				if (arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}//冒泡排序结束
		
		//输出排序后的结果
		System.out.println("排序后的结果如下：");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"]="+arr[i]);
		}
		
	}

}
