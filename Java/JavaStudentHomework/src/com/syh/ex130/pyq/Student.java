package com.syh.ex130;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Student {
	// 定义教师的基本属性
	/** 学生姓名 */
	private String name;
	/** 学生班级 */
	private String studentClass;
	/** 学生分数 */
	private int solve = 0;
	/** 用于存储问题组 */
	private String[] asks;
	/** 下标，用于判断是否还存在下一题 */
	private int index = 0;

	public Student(String name, String studentClass) {
		this.name = name;
		this.studentClass = studentClass;
	}

	/**
	 * 用于返回学生的姓名
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 用于设置学生的姓名
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 用于返回学生的班级
	 * 
	 * @return
	 */
	public String getStudentClass() {
		return studentClass;
	}

	/**
	 * 用于设置学生的班级
	 * 
	 * @param studentClass
	 */
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	/**
	 * 用于返回学生的考试成绩
	 * 
	 * @return
	 */
	public int getSolve() {
		return solve;
	}

	/**
	 * 用于获取老师的问题
	 * 
	 * @throws IOException
	 */
	public void startzAnswer() throws IOException {
		// 用于存储读取到的题目
		StringBuilder sb = new StringBuilder("");
		// 用于读取问题
		BufferedReader br = new BufferedReader(new FileReader(Config.ASK_PATH));

		String s = "";
		// 读取文件
		while ((s = br.readLine()) != null) {
			sb.append(s);
			sb.append("\r\n");
		}

		// 将获取到的题目按照*号切分成字符串数组，数组每一个元素就是一题
		asks = sb.toString().split("\\*");
		br.close();

		// 再读取学生答题的情况
		br = new BufferedReader(new FileReader(Config.STUDENT_ANSWER_PATH));
		// 清空sb中的内容
		sb.delete(0, sb.length());
		// 读取文件
		s = "";
		while ((s = br.readLine()) != null) {
			sb.append(s);
			sb.append("\r\n");
		}
		br.close();

		// 判断当前学生是否存在于文件中，存在，则将该行删掉，并重新定义，再写入文件中
		if (sb.indexOf(name + "=" + studentClass) > -1) {
			// 删除当前行，其规则为，找到的位置加上题目数量（即答案数量）再加3（删除等于号和\r\n）
			// 小红=三班=AABDC\r\n
			sb.delete(sb.indexOf(name + "=" + studentClass),
					sb.indexOf(name + "=" + studentClass)
							+ (name + "=" + studentClass).length() + asks.length + 2);
		}

		// 再将该信息拼到最后
		sb.append(name + "=" + studentClass + "=");
		
		// 写入文件中
		BufferedWriter bw = new BufferedWriter(
				new FileWriter(Config.STUDENT_ANSWER_PATH));
		bw.write(sb.toString());
		bw.close();
	}

	/**
	 * 用于判断是否存在下一题
	 * 
	 * @return 是否存在下一题
	 */
	public boolean hasNextAsk() {
		//由于切分时最后有可能是个空字符串，所以返回时不是直接返回长度，而是长度减一
		if (index == asks.length - 1) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * 用于返回下一题题目
	 * 
	 * @return 下一题题目
	 */
	public String nextAsk() {
		// 返回下标对应的问题，并将下标加上1
		return asks[index++];
	}

	/**
	 * 用于写入学生的答题
	 * 
	 * @param solve
	 *            学生的答题
	 * @throws IOException
	 */
	public void writeSolve(String choose) throws IOException {
		BufferedWriter bw = new BufferedWriter(
				new FileWriter(Config.STUDENT_ANSWER_PATH, true));
		bw.write(choose);
		bw.close();
	}
	
	/**
	 * 用于查看成绩的方法，以一题10分为计算
	 * @return
	 * @throws IOException 
	 */
	public int showGraden() throws IOException {
		//用于存储分数
		int graden = 0;
		
		//用于存储老师与学生的答案
		String stuSb = "";
		String teaSb = "";
		
		// 用于读取正确答案
		BufferedReader br = new BufferedReader(new FileReader(Config.RIGHT_ANSWER_PATH));
		String s = "";
		// 读取文件
		while ((s = br.readLine()) != null) {
			teaSb = s;
		}
		br.close();
		
		//用于读取学生的答案
		br = new BufferedReader(new FileReader(Config.STUDENT_ANSWER_PATH));
		// 读取文件
		while ((s = br.readLine()) != null) {
			//判断当前获取的字符是否是相应的学生，是，则存储，否则，继续向下读
			if ( s.indexOf(name + "=" + studentClass) > -1 ) {
				stuSb = s;
			}
		}
		br.close();
		
		//由于获取到的元素包含了学生信息，则将其按照规则（=）切分
		//小明=三年级=BBBD
		stuSb = stuSb.split("=")[2];
		//循环，将学生的答案与老师的答案对比，查看其正确，并评分
		for (int i = 0; i < stuSb.toCharArray().length; i++) {
			if ( stuSb.toCharArray()[i] == teaSb.toCharArray()[i] ) {
				graden += 10;
			} 
		}
		
		//用于存储读取到的信息
		StringBuilder sb = new StringBuilder("");
		// 再读取学生答题的情况
		br = new BufferedReader(new FileReader(Config.STUDENT_SOLVE_PATH));
		// 清空sb中的内容
		sb.delete(0, sb.length());
		// 读取文件
		s = "";
		while ((s = br.readLine()) != null) {
			sb.append(s);
			sb.append("\r\n");
		}
		br.close();

		// 判断当前学生是否存在于文件中，存在，则将该行删掉，并重新定义，再写入文件中
		if (sb.indexOf(name + "=" + studentClass) > -1) {
			// 删除当前行，其规则为，找到的位置加上题目数量（即答案数量）再加3（删除等于号和\r\n）
			// 小红=三班=AABDC\r\n
			sb.delete(sb.indexOf(name + "=" + studentClass),
					sb.indexOf(name + "=" + studentClass)
							+ (name + "=" + studentClass).length() + asks.length + 2);
		}

		// 再将该信息拼到最后
		sb.append(name + "=" + studentClass + "=" + graden);
		
		// 写入文件中
		BufferedWriter bw = new BufferedWriter(
				new FileWriter(Config.STUDENT_SOLVE_PATH));
		bw.write(sb.toString());
		bw.close();
		
		return graden;
	}
}
