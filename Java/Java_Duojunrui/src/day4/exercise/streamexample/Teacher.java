package day4.exercise.streamexample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Teacher {
	// �����ʦ�Ļ�������
	/** ��ʦ���� */
	private String name;
	/** ��ʦ���� */
	private int age;
	/** ��ʦְ�� */
	private String Title;
	/**���ڶ������������*/
	private int count = 1;

	public Teacher(String name, int age, String title) {
		super();
		this.name = name;
		this.age = age;
		Title = title;
	}

	/**
	 * ���ڷ��ؽ�ʦ������
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * �������ý�ʦ������
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * ���ڷ��ؽ�ʦ������
	 * 
	 * @return
	 */
	public int getAge() {
		return age;
	}

	/**
	 * �������ý�ʦ������
	 * 
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * ���ڷ��ؽ�ʦ��ְ��
	 * 
	 * @return
	 */
	public String getTitle() {
		return Title;
	}

	/**
	 * �������ý�ʦ��ְ��
	 * 
	 * @param title
	 */
	public void setTitle(String title) {
		Title = title;
	}

	/**
	 * ���ڱ�ʾ��ʦ��ʼ¼��ı�־
	 * @throws IOException 
	 */
	public void startWriteAsk() throws IOException {
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
		count = sb.toString().split("\\*").length;
		br.close();
	}
	
	/**
	 * ���ڽ�����ı���д���ļ���
	 * 
	 * @param title
	 *            ����ı���
	 * @throws IOException
	 */
	public void writeAskTitle(String title) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(Config.ASK_PATH, true));
		bw.write(count++ + ")" + title);
		bw.newLine();
		bw.close();
	}

	/**
	 * ���ڽ������ѡ��д���ļ���
	 * 
	 * @param a
	 *            Aѡ��
	 * @param b
	 *            Bѡ��
	 * @param c
	 *            Cѡ��
	 * @param d
	 *            Dѡ��
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
	 * ���ڱ�д����Ĵ�
	 * @param answer ����Ĵ�
	 * @throws IOException
	 */
	public void writeAskAnswer(String answer) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(
				Config.RIGHT_ANSWER_PATH, true));
		bw.write(answer);
		bw.close();
	}
	
	/**
	 * ���ڷ���ѧ����������Ϣ
	 * @return ѧ����������Ϣ
	 * @throws IOException 
	 */
	public String[][] showSort() throws IOException {
		//���ڴ洢ѧ������Ϣ
		String[][] ss = null;
		//�洢��ȡ����ѧ���ɼ���Ϣ
		StringBuilder sb = new StringBuilder("");
		
		// ���ڶ�ȡ��ȷ��
		BufferedReader br = new BufferedReader(new FileReader(Config.STUDENT_SOLVE_PATH));
		String s = "";
		// ��ȡ�ļ�
		while ((s = br.readLine()) != null) {
			sb.append(s);
			sb.append("\r\n");
		}
		br.close();
		
		//�洢ѧ������Ϣ
		String[] tem = sb.toString().split("\r\n");
		ss = new String[tem.length][3];
		//ѭ�����洢���е�ѧ����Ϣ��ע�⣬�������һλ�������У������һ��Ԫ�ز���
		for ( int i = 0; i < tem.length; i++ ) {
			//��ȡѧ������
			ss[i][0] = tem[i].split("=")[0];
			//��ȡѧ���༶
			ss[i][1] = tem[i].split("=")[1];
			//��ȡѧ���ɼ�
			ss[i][2] = tem[i].split("=")[2];
		}
		
		return sort(ss);
	}
	
	/**
	 * ����ʵ��ð������
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
