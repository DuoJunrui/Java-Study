package part1.basic.day04;

import java.util.Scanner;
/**
 * 
 * @author: 多俊睿
 * @data: 2019年3月2日 下午1:55:42
 * @Description: TODO
 */
public class Guessing {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Java生成随机数的办法
		//random的范围是 0.0~0.9999999999999999...
		
		int num = (int)(Math.random()*1000+1);
		
		System.out.println("请开始你的猜数字游戏：");
		int guess= scan.nextInt();
		while (guess!=num) {
			
			if (guess==0) {
				break;
			}
			
			if (guess<num) {
				System.out.println("对不起，您猜小了。请继续猜");
			}else {
				System.out.println("对不起，您猜大了，请继续猜：");
			}
			
			guess = scan.nextInt();
		}
		if (guess==num) {
			System.out.println("恭喜你，猜对了。");
		} else {
			System.out.println("退出。");
		}
		
		//Resource leak: 'scan' is never closed 资源泄漏:“扫描”从不关闭
		//内存资源浪费，用完后关闭输入（System.in）的监控
		scan.close();
		

	}

}
