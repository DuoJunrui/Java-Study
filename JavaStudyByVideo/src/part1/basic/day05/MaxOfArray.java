package part1.basic.day05;
/**
 * 
 * @author: 多俊睿
 * @data: 2019年3月2日 下午9:15:18
 * @Description: 数组的遍历
 */
public class MaxOfArray {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100);
			System.out.println("arr[" +i+ "]"+"="+arr[i]);
		}

		//求该数组元素中的最大值
		int max =arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("该数组的元素中，最大值为："+max);
		
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

	}

}
