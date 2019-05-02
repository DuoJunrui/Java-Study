package com.syh.ex130;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Student {
	// �����ʦ�Ļ�������
	/** ѧ������ */
	private String name;
	/** ѧ���༶ */
	private String studentClass;
	/** ѧ������ */
	private int solve = 0;
	/** ���ڴ洢������ */
	private String[] asks;
	/** �±꣬�����ж��Ƿ񻹴�����һ�� */
	private int index = 0;

	public Student(String name, String studentClass) {
		this.name = name;
		this.studentClass = studentClass;
	}

	/**
	 * ���ڷ���ѧ��������
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * ��������ѧ��������
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * ���ڷ���ѧ���İ༶
	 * 
	 * @return
	 */
	public String getStudentClass() {
		return studentClass;
	}

	/**
	 * ��������ѧ���İ༶
	 * 
	 * @param studentClass
	 */
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	/**
	 * ���ڷ���ѧ���Ŀ��Գɼ�
	 * 
	 * @return
	 */
	public int getSolve() {
		return solve;
	}

	/**
	 * ���ڻ�ȡ��ʦ������
	 * 
	 * @throws IOException
	 */
	public void startzAnswer() throws IOException {
		// ���ڴ洢��ȡ������Ŀ
		StringBuilder sb = new StringBuilder("");
		// ���ڶ�ȡ����
		BufferedReader br = new BufferedReader(new FileReader(Config.ASK_PATH));

		String s = "";
		// ��ȡ�ļ�
		while ((s = br.readLine()) != null) {
			sb.append(s);
			sb.append("\r\n");
		}

		// ����ȡ������Ŀ����*���зֳ��ַ������飬����ÿһ��Ԫ�ؾ���һ��
		asks = sb.toString().split("\\*");
		br.close();

		// �ٶ�ȡѧ����������
		br = new BufferedReader(new FileReader(Config.STUDENT_ANSWER_PATH));
		// ���sb�е�����
		sb.delete(0, sb.length());
		// ��ȡ�ļ�
		s = "";
		while ((s = br.readLine()) != null) {
			sb.append(s);
			sb.append("\r\n");
		}
		br.close();

		// �жϵ�ǰѧ���Ƿ�������ļ��У����ڣ��򽫸���ɾ���������¶��壬��д���ļ���
		if (sb.indexOf(name + "=" + studentClass) > -1) {
			// ɾ����ǰ�У������Ϊ���ҵ���λ�ü�����Ŀ�����������������ټ�3��ɾ�����ںź�\r\n��
			// С��=����=AABDC\r\n
			sb.delete(sb.indexOf(name + "=" + studentClass),
					sb.indexOf(name + "=" + studentClass)
							+ (name + "=" + studentClass).length() + asks.length + 2);
		}

		// �ٽ�����Ϣƴ�����
		sb.append(name + "=" + studentClass + "=");
		
		// д���ļ���
		BufferedWriter bw = new BufferedWriter(
				new FileWriter(Config.STUDENT_ANSWER_PATH));
		bw.write(sb.toString());
		bw.close();
	}

	/**
	 * �����ж��Ƿ������һ��
	 * 
	 * @return �Ƿ������һ��
	 */
	public boolean hasNextAsk() {
		//�����з�ʱ����п����Ǹ����ַ��������Է���ʱ����ֱ�ӷ��س��ȣ����ǳ��ȼ�һ
		if (index == asks.length - 1) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * ���ڷ�����һ����Ŀ
	 * 
	 * @return ��һ����Ŀ
	 */
	public String nextAsk() {
		// �����±��Ӧ�����⣬�����±����1
		return asks[index++];
	}

	/**
	 * ����д��ѧ���Ĵ���
	 * 
	 * @param solve
	 *            ѧ���Ĵ���
	 * @throws IOException
	 */
	public void writeSolve(String choose) throws IOException {
		BufferedWriter bw = new BufferedWriter(
				new FileWriter(Config.STUDENT_ANSWER_PATH, true));
		bw.write(choose);
		bw.close();
	}
	
	/**
	 * ���ڲ鿴�ɼ��ķ�������һ��10��Ϊ����
	 * @return
	 * @throws IOException 
	 */
	public int showGraden() throws IOException {
		//���ڴ洢����
		int graden = 0;
		
		//���ڴ洢��ʦ��ѧ���Ĵ�
		String stuSb = "";
		String teaSb = "";
		
		// ���ڶ�ȡ��ȷ��
		BufferedReader br = new BufferedReader(new FileReader(Config.RIGHT_ANSWER_PATH));
		String s = "";
		// ��ȡ�ļ�
		while ((s = br.readLine()) != null) {
			teaSb = s;
		}
		br.close();
		
		//���ڶ�ȡѧ���Ĵ�
		br = new BufferedReader(new FileReader(Config.STUDENT_ANSWER_PATH));
		// ��ȡ�ļ�
		while ((s = br.readLine()) != null) {
			//�жϵ�ǰ��ȡ���ַ��Ƿ�����Ӧ��ѧ�����ǣ���洢�����򣬼������¶�
			if ( s.indexOf(name + "=" + studentClass) > -1 ) {
				stuSb = s;
			}
		}
		br.close();
		
		//���ڻ�ȡ����Ԫ�ذ�����ѧ����Ϣ�����䰴�չ���=���з�
		//С��=���꼶=BBBD
		stuSb = stuSb.split("=")[2];
		//ѭ������ѧ���Ĵ�����ʦ�Ĵ𰸶Աȣ��鿴����ȷ��������
		for (int i = 0; i < stuSb.toCharArray().length; i++) {
			if ( stuSb.toCharArray()[i] == teaSb.toCharArray()[i] ) {
				graden += 10;
			} 
		}
		
		//���ڴ洢��ȡ������Ϣ
		StringBuilder sb = new StringBuilder("");
		// �ٶ�ȡѧ����������
		br = new BufferedReader(new FileReader(Config.STUDENT_SOLVE_PATH));
		// ���sb�е�����
		sb.delete(0, sb.length());
		// ��ȡ�ļ�
		s = "";
		while ((s = br.readLine()) != null) {
			sb.append(s);
			sb.append("\r\n");
		}
		br.close();

		// �жϵ�ǰѧ���Ƿ�������ļ��У����ڣ��򽫸���ɾ���������¶��壬��д���ļ���
		if (sb.indexOf(name + "=" + studentClass) > -1) {
			// ɾ����ǰ�У������Ϊ���ҵ���λ�ü�����Ŀ�����������������ټ�3��ɾ�����ںź�\r\n��
			// С��=����=AABDC\r\n
			sb.delete(sb.indexOf(name + "=" + studentClass),
					sb.indexOf(name + "=" + studentClass)
							+ (name + "=" + studentClass).length() + asks.length + 2);
		}

		// �ٽ�����Ϣƴ�����
		sb.append(name + "=" + studentClass + "=" + graden);
		
		// д���ļ���
		BufferedWriter bw = new BufferedWriter(
				new FileWriter(Config.STUDENT_SOLVE_PATH));
		bw.write(sb.toString());
		bw.close();
		
		return graden;
	}
}
