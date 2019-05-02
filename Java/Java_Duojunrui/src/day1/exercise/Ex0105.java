package day1.exercise;

import java.util.Scanner;

//键盘数据三个数，判断并获取三个数中较大的值，在后台打印出结果
public class Ex0105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入第一个数据:");
		int a = sc.nextInt();

		System.out.println("请输入第二个数据:");
		int b = sc.nextInt();

		System.out.println("请输入第三个数据:");
		int c = sc.nextInt();
		
		int max = a;
		if(max<b) {
			max=b;
			}
		if(max<c) {
			max=c;
		}
		System.out.println("三个数据中的最大值是："+ max);
		
		}


}
