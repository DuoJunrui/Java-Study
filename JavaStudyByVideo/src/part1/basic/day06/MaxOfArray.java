package part1.basic.day06;

import java.util.Arrays;

/**
 * 
 * @author: 多俊睿
 * @data: 2019年3月3日 上午11:22:35
 * @Description: TODO
 */
public class MaxOfArray {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100);
			System.out.println("arr[" +i+ "]"+"="+arr[i]);
		}

		//求该数组元素中的最小值
		int min =arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("该数组的元素中，最小值为："+min);
		
		//求该数组中所有元素的平均值
		double average;
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum +arr[i];
		}
		System.out.println("该数组中所有元素的和为："+sum);
		average=(double)sum/arr.length;
		System.out.println("该数组中所有元素的平均值为："+average);
		
		//求该数组元素中的最大值
		int max =arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("数组的元素中，最大值为："+max);
		
		//数组扩容，增长一位
		arr =Arrays.copyOf(arr, arr.length+1); //数组的复制 Arrays.copyOf()  //方法一
		//将最大的值放在数组的最后一个元素上
		arr[arr.length-1] = max;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//数组的复制
		int[] arr2 = new int[15];
		System.arraycopy(arr, 2, arr2, 1, 8); //System.arraycopy()  方法二
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}

	}

}
