package part1.basic.day04;

import java.util.Scanner;
/**
 * 
 * @author: 多俊睿
 * @data: 2019年3月1日 下午11:27:30
 * @Description: TODO
 */
public class CommandBySwitch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请选择功能：1、显示全部记录； 2、查询登录记录； 0、退出");
		int command = scan.nextInt();
		
		// switch...case ... break    一般和break（中断）搭配使用
		System.out.println("----------用switch...case ... break实现---------------");
		switch (command) {
		case 1:
			System.out.println("显示全部记录。");
			break;
		case 2:
			System.out.println("查询登录记录。");
			break;
		case 0:
			System.out.println("退出。");
			break;
		default:
			System.out.println("对不起，您输入错误！");
		}
		
		//用if...else if...实现
		System.out.println("----------用if...else if...实现--------------");
		if (command==1) {
			System.out.println("显示全部记录。");
		}else if (command==2) {
			System.out.println("查询登录记录。");
		}else if (command==0) {
			System.out.println("退出。");
		}else {
			System.out.println("对不起，您输入错误！");
		}
		
		scan.close();
	}

}
