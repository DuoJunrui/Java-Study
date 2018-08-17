package com.syh.ex123;

import java.util.Random;

/**
 * 定义一个学生类，类中包含学生的姓名及学习成绩，并提供get和set方法，之后通过随机方法对学生的成绩进行赋值（0~100分），之后对学生成绩排序，
 * 并输出学生的信息（名次、姓名及分数）
 */
public class StudentSort {
	public static void main(String[] args) {
		//定义五个学生
		Student[] s = new Student[5];
		
		System.out.println("排序前，学生的信息为：");
		for ( int i = 0; i < s.length; i++ ) {
			Random r = new Random();
			s[i] = new Student("学生" + (i + 1), r.nextInt(101));
			System.out.println(s[i].getName() + "，分数为：" + s[i].getGrade());
		}
		
		System.out.println("排序后，学生的信息为：");
		s = sort(s);
		for ( int i = 0; i < s.length; i++ ) {
			System.out.println("第" + (i + 1) + "名：" + s[i].getName() + "，分数为：" + s[i].getGrade());
		}
	}
	
	private static Student[] sort(Student[] s) {
		//冒泡排序
		for ( int i = 0; i < s.length - 1; i++ ) {
			for ( int j = 0; j < s.length - 1 - i; j++ ) {
				//判断当前学生的成绩是否小于下一个学生的成绩，小于，则将其交换
				if ( s[j].getGrade() < s[j + 1].getGrade() ) {
					Student st = s[j];
					s[j] = s[j + 1];
					s[j + 1] = st;
				}
			}
		}
		
		return s;
	}
}
