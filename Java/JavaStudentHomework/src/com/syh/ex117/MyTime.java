package com.syh.ex117;

/**
 * ������ΪMyTime���࣬����
 * Ӧ���������ͳ�Ա��ʱ���֣��룬Ϊ�˱�֤���ݵİ�ȫ�ԣ���������Ա����Ӧ����Ϊ˽�С�ΪMyTime�ඨ�幹�췽�����Է��洴������ʱ��ʼ����Ա������
 * �ٶ���display���������ڽ�ʱ����Ϣ��ӡ������ <br/>
 * ΪMyTime���һ�·�����addSecond addMinute
 * 
 */
public class MyTime {
	//����ʱ����
	private int h = 0;
	private int m = 0;
	private int s = 0;

	/**
	 * ���췽������ʼ��ʱ����
	 * @param h 
	 * @param m
	 * @param s
	 */
	public MyTime(int h, int m, int s) {
		//��ʼ��ʱ��ʱ���ܻ�ʹ�÷��볬����Χ����ʱ��Ӧ�õ������еķ�������Сʱ����ֱ�Ӽ��ϴ����Сʱ��
		addSecond(s);
		addMinute(m);
		this.h += h;
	}

	public int getH() {
		return h;
	}

	public int getM() {
		return m;
	}

	public int getS() {
		return s;
	}
	
	/**
	 * ���ڷ���ʱ����ַ�������ʽΪh:m:s
	 * @return ʱ��
	 */
	public String display() {
		return h + ":" + m + ":" + s;
	}
	
	public void addSecond(int s) {
		this.s += s;
		
		if ( this.s >= 60 ) {
			addMinute(this.s / 60);
			this.s %= 60;
		}
	}
	
	public void addMinute(int m) {
		this.m += m;
		
		if ( this.m >= 60 ) {
			h += this.m / 60;
			this.m %= 60;
		}
	}
}
