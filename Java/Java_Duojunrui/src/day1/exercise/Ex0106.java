package day1.exercise;

import java.util.Scanner;

/*根据输入的值，判断是星期几。(分别用if语句和switch语句实现)
	例如：输入：1	 
	      输出：星期1
*/
public class Ex0106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入星期序号：");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		
		if(a==1){
			System.out.println("星期一");
		}
		if(a==2){
			System.out.println("星期二");
		}
		if(a==3){
			System.out.println("星期三");
		}
		if(a==4){
			System.out.println("星期四");
		}
		if(a==5){
			System.out.println("星期五");
		}
		if(a==6){
			System.out.println("星期六");
		}
		if(a==7){
			System.out.println("星期日");
		}
		
		
		switch (a) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期日");
			break;
		default:
			System.out.println("超出范围，请输入1~7的数字！");
			break;
		}
	}

}
