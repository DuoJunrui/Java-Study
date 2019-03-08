package part1.basic.day06;

//import java.util.Random;
/**
 * @author: 多俊睿
 * @data: 2019年3月3日 下午7:38:01
 * @Description: day06作业
 */
public class Homework {

	public static void main(String[] args) {
		
		//topicNum1();
		
		int[] arr = generateArray(10, 100);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	
	/**
	 * 3.随机生成数组
	 * 封装一个方法generateArray，
	 * 该方法实现生成指定长度的int数组，
	 * 该数组的元素为0到指定范围内的随机数(包含指定数)，
	 * 并将该数组返回。
	 * @return
	 */
	public static int[] generateArray(int length , int scope) {
		int[] arr = new int[length];
		//Random ran = new Random();
		for (int i = 0; i < arr.length; i++) {
			//arr[i] = ran.nextInt(scope+1);// 通过系统Random()方法
			arr[i] = (int)(Math.random()*scope+1);// 通过Math.random()方法
		}
		return arr;
	}
	
	
	
	/**
	 * 1.查询数组最小值，并将其放在第一位
	 */
	public static void topicNum1() {
		
		//创建一个长度为10的数组
		int[] arr = new int[10];
		
		//给数组中的元素随机赋值
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100);
		}
		
		//按格式 将数组中的值展示出来
		System.out.print("数组中的数据为：[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i==arr.length-1) {
				break;
			}else {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		
		//查询数组的最小值
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("数组的最小值为："+min);
		
		//拓展原数组arr的长度,定义一个新的数组
		int[] newArr = new int[arr.length+1];
		
		//将原数组中的元素后移一位
		System.arraycopy(arr, 0, newArr, 1, 10);
		
		//将最小值赋值给newArr[0]
		newArr[0] = min;
		
		//展示新数组的数据
		System.out.print("新数组中的数据为：[");
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i]);
			if (i==newArr.length-1) {
				break;
			}else {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

}
