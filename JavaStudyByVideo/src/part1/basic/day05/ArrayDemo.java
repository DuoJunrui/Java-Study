package part1.basic.day05;
/**
 * 
 * @author: 多俊睿
 * @data: 2019年3月2日 下午8:17:01
 * @Description: 数组
 */
public class ArrayDemo {

	public static void main(String[] args) {
		
		//数组的申明
		int[] arr1 = new int[20]; 
		
		//数组初始化
		int[] arr5 = new int[3];//0,0,0  //方法一  默认值
		int[] arr2 = {2,5,8}; // 2,5,8  //方法二
		int[] arr3 = new int[] {2,5,9};// 2,5,9  //方法三
		int[] arr6;
		//arr6 = {2,5,8}; //这样不可以
		arr6 = new int[] {5,5,0}; //这样可以  //5,5,0  //方法四
		
		//数组的访问
		int[] arr4 = new int[3];
		arr4[0]=100;
		arr4[1]=200;
		arr4[2]=300;
		//arr4[3]=400;//数组下标越界，运行异常 
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
		
		System.out.println("arr4的长度为"+(arr4.length));
		System.out.println("arr4最后一个元素的值为："+arr4[arr4.length-1]);
		
		
	}

}
