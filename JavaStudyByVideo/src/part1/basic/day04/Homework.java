package part1.basic.day04;

import java.util.Scanner;

/**
 * 
 * @author: 多俊睿
 * @data: 2019年3月2日 下午3:15:35
 * @Description: TODO
 */
public class Homework {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//1.编写个人所得税计算程序
		System.out.println("--------1.编写个人所得税计算程序-----------");
		System.out.println("请输入你的税前工资金额：");
		double salary = scan.nextDouble(); //税前工资
		double taxSalary = salary - 3500; //全月应纳税所得额=工资薪金所得－扣除数（3500）
		double tax = 0; //应缴纳的个人所得税
		
		if (taxSalary<=1500) {
			tax = taxSalary * 0.03 - 0;
		} else if (taxSalary<=4500) {
			tax = taxSalary * 0.1 - 105;
		} else if (taxSalary<=9000) {
			tax = taxSalary * 0.2 - 555;
		} else if (taxSalary<=35000) {
			tax = taxSalary * 0.25 - 1005;
		} else if (taxSalary<=55000) {
			tax = taxSalary * 0.30 - 2755;
		} else if (taxSalary<=80000) {
			tax = taxSalary * 0.35 - 5505;
		} else if (taxSalary>80000) {
			tax = taxSalary * 0.45 - 13505;
		}
		if (tax<=0) {
			System.out.println("您不用缴纳个人所得说。");
		}else {
			System.out.println("您应该缴纳的个人所得税是：￥"+tax);
		}
		
		//2.输入年份和月份，输出该月的天数（使用switch-case）
		//关注代码优化！！！！！
		System.out.println("------2.输入年份和月份，输出该月的天数（使用switch-case）--------");
		System.out.println("请输入年份（例如：2012）：");
		int year = scan.nextInt();
		System.out.println("请输入月份（例如：1）：");
		int month = scan.nextInt();
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(year+"年"+month+"月有31天。");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(year+"年"+month+"月有30天。");
			break;
		case 2:
			if ( (year%4==0&&year%100!=0) || year%400==0) {
				System.out.println(year+"年"+month+"月有29天。");
			} else {
				System.out.println(year+"年"+month+"月有28天。");
			}
			break;
		default:
			System.out.println("对不起，您的输入有误，请输入1~12月任意一个月份。");
		}
		System.out.println("运行结束，请重新启动。");
		
		
		/*
		//2.输入年份和月份，输出该月的天数（使用switch-case）
		System.out.println("------2.输入年份和月份，输出该月的天数（使用switch-case）--------");
		System.out.println("请输入年份（例如：2012）：");
		int year = scan.nextInt();
		System.out.println("请输入月份（例如：1）：");
		int month = scan.nextInt();
		
		switch (month) {
		case 1:
			System.out.println(year+"年"+month+"月有31天。");
			break;
		case 2:
			if ( (year%4==0&&year%100!=0) || year%400==0) {
				System.out.println(year+"年"+month+"月有29天。");
			} else {
				System.out.println(year+"年"+month+"月有28天。");
			}
			break;
		case 3:
			System.out.println(year+"年"+month+"月有31天。");
			break;
		case 4:
			System.out.println(year+"年"+month+"月有30天。");
			break;
		case 5:
			System.out.println(year+"年"+month+"月有31天。");
			break;
		case 6:
			System.out.println(year+"年"+month+"月有30天。");
			break;
		case 7:
			System.out.println(year+"年"+month+"月有31天。");
			break;
		case 8:
			System.out.println(year+"年"+month+"月有31天。");
			break;
		case 9:
			System.out.println(year+"年"+month+"月有30天。");
			break;
		case 10:
			System.out.println(year+"年"+month+"月有31天。");
			break;
		case 11:
			System.out.println(year+"年"+month+"月有30天。");
			break;
		case 12:
			System.out.println(year+"年"+month+"月有31天。");
			break;
		default:
			System.out.println("对不起，您的输入有误，请输入1~12月任意一个月份。");
		}
		System.out.println("运行结束，请重新启动。");
		*/
		
		scan.close();
	}

}
