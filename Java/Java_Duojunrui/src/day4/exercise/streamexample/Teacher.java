package day4.exercise.streamexample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Teacher {
	// 定义教师的基本属性
	/** 教师姓名 */
	private String name;
	/** 教师年龄 */
	private int age;
	/** 教师职称 */
	private String Title;
	/**用于定义自增的序号*/
	private int count = 1;

	public Teacher(String name, int age, String title) {
		super();
		this.name = name;
		this.age = age;
		Title = title;
	}

	/**
	 * 用于返回教师的姓名
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 用于设置教师的姓名
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 用于返回教师的年龄
	 * 
	 * @return
	 */
	public int getAge() {
		return age;
	}

	/**
	 * 用于设置教师的年龄
	 * 
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * 用于返回教师的职称
	 * 
	 * @return
	 */
	public String getTitle() {
		return Title;
	}

	/**
	 * 用于设置教师的职称
	 * 
	 * @param title
	 */
	public void setTitle(String title) {
		Title = title;
	}

	/**
	 * 用于表示教师开始录题的标志
	 * @throws IOException 
	 */
	public void startWriteAsk() throws IOException {
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
		count = sb.toString().split("\\*").length;
		br.close();
	}
	
	/**
	 * 用于将试题的标题写入文件中
	 * 
	 * @param title
	 *            试题的标题
	 * @throws IOException
	 */
	public void writeAskTitle(String title) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(Config.ASK_PATH, true));
		bw.write(count++ + ")" + title);
		bw.newLine();
		bw.close();
	}

	/**
	 * 用于将试题的选项写入文件中
	 * 
	 * @param a
	 *            A选项
	 * @param b
	 *            B选项
	 * @param c
	 *            C选项
	 * @param d
	 *            D选项
	 * @throws IOException
	 */
	public void writeAskOption(String a, String b, String c, String d)
			throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(Config.ASK_PATH, true));
		bw.write("A." + a);
		bw.newLine();
		bw.write("B." + b);
		bw.newLine();
		bw.write("C." + c);
		bw.newLine();
		bw.write("D." + d);
		bw.newLine();
		bw.write("*");
		bw.newLine();
		bw.close();
	}

	/**
	 * 用于编写试题的答案
	 * @param answer 试题的答案
	 * @throws IOException
	 */
	public void writeAskAnswer(String answer) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(
				Config.RIGHT_ANSWER_PATH, true));
		bw.write(answer);
		bw.close();
	}
	
	/**
	 * 用于返回学生排序后的信息
	 * @return 学生排序后的信息
	 * @throws IOException 
	 */
	public String[][] showSort() throws IOException {
		//用于存储学生的信息
		String[][] ss = null;
		//存储读取到的学生成绩信息
		StringBuilder sb = new StringBuilder("");
		
		// 用于读取正确答案
		BufferedReader br = new BufferedReader(new FileReader(Config.STUDENT_SOLVE_PATH));
		String s = "";
		// 读取文件
		while ((s = br.readLine()) != null) {
			sb.append(s);
			sb.append("\r\n");
		}
		br.close();
		
		//存储学生的信息
		String[] tem = sb.toString().split("\r\n");
		ss = new String[tem.length][3];
		//循环，存储所有的学生信息，注意，由于最后一位包含换行，故最后一个元素不读
		for ( int i = 0; i < tem.length; i++ ) {
			//读取学生姓名
			ss[i][0] = tem[i].split("=")[0];
			//读取学生班级
			ss[i][1] = tem[i].split("=")[1];
			//读取学生成绩
			ss[i][2] = tem[i].split("=")[2];
		}
		
		return sort(ss);
	}
	
	/**
	 * 用于实现冒泡排序
	 * @param stu
	 * @return
	 */
	private String[][] sort(String[][] stu) {
		for ( int i = 0; i < stu.length - 1; i++ ) {
			for ( int j = 0; j < stu.length - i - 1; j++ ) {
				if ( Integer.valueOf(stu[j][2]) < Integer.valueOf(stu[j + 1][2]) ) {
					String[] tem = stu[j];
					stu[j] = stu[j + 1];
					stu[j + 1] = tem;
				}
			}
		}
		
		return stu;
	}
}
