package com.syh.ex131;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

import com.syh.tool.PresetStr;

/**
 * 定义一个学生类，类中包含学生的姓名及学习成绩，并提供get和set方法，之后通过随机方法对学生的成绩进行赋值（0~100分），之后对学生成绩排序，
 * 并输出学生的信息（名次、姓名及分数）
 */
public class StudentSort {
	public static void main(String[] args) {
		//showListSort();
		showMapSort();
	}
	
	public static void showListSort() {
		List<Student> l = new ArrayList<Student>();
		
		System.out.println("排序前，学生的信息为：");
		for ( int i = 0; i < 10; i++ ) {
			Random r = new Random();
			l.add(new Student(PresetStr.name(), r.nextInt(101)));
			System.out.println(l.get(i).getName() + "，分数为：" + l.get(i).getGrade());
		}
		
		System.out.println("排序后，学生的信息为：");
		l = sort(l);
		for ( int i = 0; i < l.size(); i++ ) {
			System.out.println("第" + (i + 1) + "名：" + l.get(i).getName() + "，分数为：" + l.get(i).getGrade());
		}
	}
	
	public static void showMapSort() {
		Map<Integer, Student> m = new HashMap<Integer, Student>();
		
		System.out.println("排序前，学生的信息为：");
		for ( int i = 0; i < 10; i++ ) {
			Random r = new Random();
			m.put(i + 1, new Student(PresetStr.name(), r.nextInt(101)));
			System.out.println(m.get(i + 1).getName() + "，分数为：" + m.get(i + 1).getGrade());
		}
		
		m = sort(m);
		System.out.println("排序后，学生的信息为：");
		Set<Entry<Integer, Student>> s = m.entrySet();
		for ( Entry<Integer, Student> stu : s ) {
			System.out.println("第" + (stu.getKey()) + "名：" + stu.getValue().getName() + "，分数为：" + stu.getValue().getGrade());
		}
	}
	
	private static Map<Integer, Student> sort(Map<Integer, Student> m) {
		//冒泡排序
		for ( int i = 0; i < m.size() - 1; i++ ) {
			for ( int j = 0; j < m.size() - 1 - i; j++ ) {
				//判断当前学生的成绩是否小于下一个学生的成绩，小于，则将其交换
				if ( m.get(j + 1).getGrade() < m.get(j + 2).getGrade() ) {
					Student st = m.get(j + 1);
					m.put(j + 1, m.get(j + 2));
					m.put(j + 2, st);
				}
			}
		}
		
		return m;
	}
	
	private static List<Student> sort(List<Student> l) {
		//冒泡排序
		for ( int i = 0; i < l.size() - 1; i++ ) {
			for ( int j = 0; j < l.size() - 1 - i; j++ ) {
				//判断当前学生的成绩是否小于下一个学生的成绩，小于，则将其交换
				if ( l.get(j).getGrade() < l.get(j + 1).getGrade() ) {
					Student st = l.get(j);
					l.set(j, l.get(j + 1));
					l.set(j + 1, st);
				}
			}
		}
		
		return l;
	}
}
