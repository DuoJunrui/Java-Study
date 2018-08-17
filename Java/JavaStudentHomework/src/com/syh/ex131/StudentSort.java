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
 * ����һ��ѧ���࣬���а���ѧ����������ѧϰ�ɼ������ṩget��set������֮��ͨ�����������ѧ���ĳɼ����и�ֵ��0~100�֣���֮���ѧ���ɼ�����
 * �����ѧ������Ϣ�����Ρ�������������
 */
public class StudentSort {
	public static void main(String[] args) {
		//showListSort();
		showMapSort();
	}
	
	public static void showListSort() {
		List<Student> l = new ArrayList<Student>();
		
		System.out.println("����ǰ��ѧ������ϢΪ��");
		for ( int i = 0; i < 10; i++ ) {
			Random r = new Random();
			l.add(new Student(PresetStr.name(), r.nextInt(101)));
			System.out.println(l.get(i).getName() + "������Ϊ��" + l.get(i).getGrade());
		}
		
		System.out.println("�����ѧ������ϢΪ��");
		l = sort(l);
		for ( int i = 0; i < l.size(); i++ ) {
			System.out.println("��" + (i + 1) + "����" + l.get(i).getName() + "������Ϊ��" + l.get(i).getGrade());
		}
	}
	
	public static void showMapSort() {
		Map<Integer, Student> m = new HashMap<Integer, Student>();
		
		System.out.println("����ǰ��ѧ������ϢΪ��");
		for ( int i = 0; i < 10; i++ ) {
			Random r = new Random();
			m.put(i + 1, new Student(PresetStr.name(), r.nextInt(101)));
			System.out.println(m.get(i + 1).getName() + "������Ϊ��" + m.get(i + 1).getGrade());
		}
		
		m = sort(m);
		System.out.println("�����ѧ������ϢΪ��");
		Set<Entry<Integer, Student>> s = m.entrySet();
		for ( Entry<Integer, Student> stu : s ) {
			System.out.println("��" + (stu.getKey()) + "����" + stu.getValue().getName() + "������Ϊ��" + stu.getValue().getGrade());
		}
	}
	
	private static Map<Integer, Student> sort(Map<Integer, Student> m) {
		//ð������
		for ( int i = 0; i < m.size() - 1; i++ ) {
			for ( int j = 0; j < m.size() - 1 - i; j++ ) {
				//�жϵ�ǰѧ���ĳɼ��Ƿ�С����һ��ѧ���ĳɼ���С�ڣ����佻��
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
		//ð������
		for ( int i = 0; i < l.size() - 1; i++ ) {
			for ( int j = 0; j < l.size() - 1 - i; j++ ) {
				//�жϵ�ǰѧ���ĳɼ��Ƿ�С����һ��ѧ���ĳɼ���С�ڣ����佻��
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
