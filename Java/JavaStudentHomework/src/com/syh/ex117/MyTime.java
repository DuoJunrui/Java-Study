package com.syh.ex117;

/**
 * 定义名为MyTime的类，其中
 * 应有三个整型成员：时，分，秒，为了保证数据的安全性，这三个成员变量应声明为私有。为MyTime类定义构造方法，以方面创建对象时初始化成员变量。
 * 再定义display方法，用于将时间信息打印出来。 <br/>
 * 为MyTime添加一下方法：addSecond addMinute
 * 
 */
public class MyTime {
	//定义时分秒
	private int h = 0;
	private int m = 0;
	private int s = 0;

	/**
	 * 构造方法，初始化时分秒
	 * @param h 
	 * @param m
	 * @param s
	 */
	public MyTime(int h, int m, int s) {
		//初始化时间时可能会使得分秒超出范围，此时则应该调用类中的方法，且小时数是直接加上传入的小时数
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
	 * 用于返回时间的字符串，格式为h:m:s
	 * @return 时间
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
