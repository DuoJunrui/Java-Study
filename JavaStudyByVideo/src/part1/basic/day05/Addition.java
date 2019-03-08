package part1.basic.day05;

import java.util.Scanner;

/**
 * 
 * @author: 多俊睿
 * @data: 2019年3月2日 下午6:51:24
 * @Description: 随机加法运算器
 */
public class Addition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = 0; //得分初始化
		for (int i = 1; i <=10; i++) { //出10道题
			int a = (int)(Math.random()*100); //随机产生0~99之间的数
			int b = (int)(Math.random()*100);
			int result = a+b; //计算两数之和的结果，存到result里面
			System.out.println("("+i+")" + a + "+" + b + "=?");
			System.out.println("请输入您的答案：");
			int answer = scan.nextInt();
			
			if (answer==-1) {
				System.out.print("提前结束做题。");
				break;
			}
			if (answer==result) {
				System.out.println("恭喜你答对了，加10分。");
				score = score + 10;
			}else {
				System.out.println("对不起，您的答案错误！");
			}
		}
		System.out.println("您最终得分："+score);
		
		scan.close();
	}

}
