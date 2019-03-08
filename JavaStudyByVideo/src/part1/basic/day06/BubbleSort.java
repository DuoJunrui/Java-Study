package part1.basic.day06;
/**
 * 
 * @author: 多俊睿
 * @data: 2019年3月3日 下午1:17:34
 * @Description: 冒泡排序
 */
public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = new int[10]; //声明整型数组，包含10个元素
		
		System.out.println("随机生成的数组如下：");
		for (int i = 0; i < arr.length; i++) { //每个元素为0~99之间的随机数
			arr[i] = (int)(Math.random()*100);
			System.out.print(arr[i] + " "); //输出每个元素
		}
		
		//冒泡对arr进行升序排列
		for (int i = 0; i < arr.length-1; i++) { //先控制要排几轮
			for (int j = 0; j < arr.length-1-i; j++) {  //再控制每轮要对比的次数
				if (arr[j]>arr[j+1]) { //每次 前一个和后一个元素进行比较 并进行交换
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}//排序结束
		System.out.println();
		System.out.println("排序结束。冒泡升序排列后的结果如下：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
