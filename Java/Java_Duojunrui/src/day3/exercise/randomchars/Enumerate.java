package day3.exercise.randomchars;

/**
 * 
 * @author 多俊睿
 * @date 2018年7月21日 下午10:18:03 
 *
 */

public enum Enumerate {
	
	//大写字母
	CAP("QWERTYUIOPASDFGHJKLZXCVBNM"), 
	
	//小写字母
	LOW("qwertyuiopasdfghjklzxcvbnm"), 
	
	//数字
	NUMBER("0123456789");

	
	private String name;

	//构造方法
	private Enumerate(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}

}

