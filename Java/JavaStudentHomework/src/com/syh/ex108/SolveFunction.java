package com.syh.ex108;

import java.util.Scanner;

/**
 * 要求用户录入3个数，分别对应一元二次方程的二元变量系数、一元变量系数以及常数，之后，输出该一元二次不等式的根。
 */
public class SolveFunction {
	public static void main(String[] args) {
		// 定义方程的三个系数
		double a, b, c;
		// 判别式
		double deta;

		System.out.println("一元二次方程的表达式为：ax^2 + bx + c = 0，请按照提示输入指定的项：");
		System.out.print("请输入二次项系数的值a = ");
		a = new Scanner(System.in).nextDouble();
		System.out.print("请输入一次项系数的值b = ");
		b = new Scanner(System.in).nextDouble();
		System.out.print("请输入常数项的值c = ");
		c = new Scanner(System.in).nextDouble();

		// 判断a是否等于0
		if (a == 0.0) {
			if (b == 0.0) {
				System.out.print("您当前输入的式子为：" + c + " = 0,");
				if (c == 0.0) {
					System.out.println("由于常数项c也等于0，故该式子成立");
				} else {
					System.out.println("由于常数项c也不等于0，故该式子不成立");
				}
			} else {
				System.out.println(
						"您当前输入的式子为：(" + b + ")x + (" + c + ") = 0,当前方程为一元一次方程，故只有一个解，为x = " + ((-c * 1.0) / b));
			}
		} else {
			deta = Math.pow(b, 2) - 4 * a * c;
			System.out.println("您当前输入的式子为：(" + a + ")x^2 + (" + b + ")x + (" + c + ") = 0，方程的判别式值 deta = " + deta);
			if (deta > 0) {
				System.out.println("当前deta值大于0，故方程有两个不等实根，分别为：\nx1 = " + ((-b + Math.sqrt(deta)) / (2.0 * a)));
				System.out.println("x2 = " + ((-b - Math.sqrt(deta)) / (2.0 * a)));
			} else if (deta == 0) {
				System.out.println("当前deta值等于0，故方程有两个相等实根，分别为：");
				System.out.println("x1 = x2 = " + ((-b + Math.sqrt(deta)) / (2.0 * a)));
			} else {
				System.out.println("当前deta值小于0，故方程无实根");
			}
		}
	}

}
