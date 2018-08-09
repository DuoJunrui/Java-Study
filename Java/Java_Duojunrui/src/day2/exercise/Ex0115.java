package day2.exercise;

import java.util.Scanner;

class A {
	int v = 100;
	int u;//用户猜的数

	void guess(){
		System.out.println("我们来玩一个猜数字游戏，数值范围在0~200内，请输入你猜的数值：");
		Scanner in = new Scanner(System.in);
		int u = in.nextInt();

			if(v < u) {
				System.out.println("你猜的值偏大。");
				
			}else if(v > u) {
				System.out.println("你猜的值偏小。");
				
			}else{
				System.out.println("恭喜你，猜对了。");
				
			}
	}
}

public class Ex0115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.guess();
	}

}
