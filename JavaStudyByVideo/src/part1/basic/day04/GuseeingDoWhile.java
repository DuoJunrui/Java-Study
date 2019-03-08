package part1.basic.day04;

import java.util.Scanner;

public class GuseeingDoWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = (int)(Math.random()*1000+1);
		
		System.out.println("请开始您的才数字游戏V2.0：（数字范围：1~1000）");
		
		//do...while
		int guess;
		do {
			guess = scan.nextInt();
			if(guess==0) { //排断用户是否想退出，如果0 跳出循环
				break;
			}
			if (guess<num) {
				System.out.println("对不起，您猜小了，请继续猜：");
			}else if (guess>num) {
				System.out.println("对不起，您猜大了，请继续猜：");
			}
		} while (guess!=num);
		if (guess==num) {
			System.out.println("恭喜你猜对了！");
		} else {
			System.out.println("退出。");
		}

		scan.close();
	}

}
