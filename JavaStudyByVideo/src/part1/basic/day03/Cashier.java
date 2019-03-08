package part1.basic.day03;

import java.util.Scanner;

public class Cashier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入商品单价：");
		double price = scan.nextDouble();
		
		System.out.println("请输入商品数量：");
		int amount = scan.nextInt();
		
		System.out.println("请输入收取金额：");
		double input = scan.nextDouble();
		
		double sum = price*amount; 
		
		//满500打8折
		if (sum>=500) {
			sum = sum*0.8;
		}
		if (sum>=input) {
			System.out.println("对不起，您给的钱不够，还差："+(sum-input)+"元");
		}else {
			double change = input-sum;
			System.out.println("应收金额为：￥" + sum + ",找零为：￥" + change );
		}
	
		scan.close();
	}

}
