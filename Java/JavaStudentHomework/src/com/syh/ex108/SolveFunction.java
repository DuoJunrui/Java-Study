package com.syh.ex108;

import java.util.Scanner;

/**
 * Ҫ���û�¼��3�������ֱ��ӦһԪ���η��̵Ķ�Ԫ����ϵ����һԪ����ϵ���Լ�������֮�������һԪ���β���ʽ�ĸ���
 */
public class SolveFunction {
	public static void main(String[] args) {
		// ���巽�̵�����ϵ��
		double a, b, c;
		// �б�ʽ
		double deta;

		System.out.println("һԪ���η��̵ı��ʽΪ��ax^2 + bx + c = 0���밴����ʾ����ָ�����");
		System.out.print("�����������ϵ����ֵa = ");
		a = new Scanner(System.in).nextDouble();
		System.out.print("������һ����ϵ����ֵb = ");
		b = new Scanner(System.in).nextDouble();
		System.out.print("�����볣�����ֵc = ");
		c = new Scanner(System.in).nextDouble();

		// �ж�a�Ƿ����0
		if (a == 0.0) {
			if (b == 0.0) {
				System.out.print("����ǰ�����ʽ��Ϊ��" + c + " = 0,");
				if (c == 0.0) {
					System.out.println("���ڳ�����cҲ����0���ʸ�ʽ�ӳ���");
				} else {
					System.out.println("���ڳ�����cҲ������0���ʸ�ʽ�Ӳ�����");
				}
			} else {
				System.out.println(
						"����ǰ�����ʽ��Ϊ��(" + b + ")x + (" + c + ") = 0,��ǰ����ΪһԪһ�η��̣���ֻ��һ���⣬Ϊx = " + ((-c * 1.0) / b));
			}
		} else {
			deta = Math.pow(b, 2) - 4 * a * c;
			System.out.println("����ǰ�����ʽ��Ϊ��(" + a + ")x^2 + (" + b + ")x + (" + c + ") = 0�����̵��б�ʽֵ deta = " + deta);
			if (deta > 0) {
				System.out.println("��ǰdetaֵ����0���ʷ�������������ʵ�����ֱ�Ϊ��\nx1 = " + ((-b + Math.sqrt(deta)) / (2.0 * a)));
				System.out.println("x2 = " + ((-b - Math.sqrt(deta)) / (2.0 * a)));
			} else if (deta == 0) {
				System.out.println("��ǰdetaֵ����0���ʷ������������ʵ�����ֱ�Ϊ��");
				System.out.println("x1 = x2 = " + ((-b + Math.sqrt(deta)) / (2.0 * a)));
			} else {
				System.out.println("��ǰdetaֵС��0���ʷ�����ʵ��");
			}
		}
	}

}
