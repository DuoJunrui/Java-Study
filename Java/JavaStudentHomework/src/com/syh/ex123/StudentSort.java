package com.syh.ex123;

import java.util.Random;

/**
 * ����һ��ѧ���࣬���а���ѧ����������ѧϰ�ɼ������ṩget��set������֮��ͨ�����������ѧ���ĳɼ����и�ֵ��0~100�֣���֮���ѧ���ɼ�����
 * �����ѧ������Ϣ�����Ρ�������������
 */
public class StudentSort {
	public static void main(String[] args) {
		//�������ѧ��
		Student[] s = new Student[5];
		
		System.out.println("����ǰ��ѧ������ϢΪ��");
		for ( int i = 0; i < s.length; i++ ) {
			Random r = new Random();
			s[i] = new Student("ѧ��" + (i + 1), r.nextInt(101));
			System.out.println(s[i].getName() + "������Ϊ��" + s[i].getGrade());
		}
		
		System.out.println("�����ѧ������ϢΪ��");
		s = sort(s);
		for ( int i = 0; i < s.length; i++ ) {
			System.out.println("��" + (i + 1) + "����" + s[i].getName() + "������Ϊ��" + s[i].getGrade());
		}
	}
	
	private static Student[] sort(Student[] s) {
		//ð������
		for ( int i = 0; i < s.length - 1; i++ ) {
			for ( int j = 0; j < s.length - 1 - i; j++ ) {
				//�жϵ�ǰѧ���ĳɼ��Ƿ�С����һ��ѧ���ĳɼ���С�ڣ����佻��
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
