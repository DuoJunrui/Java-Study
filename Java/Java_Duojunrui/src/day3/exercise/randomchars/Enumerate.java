package day3.exercise.randomchars;

/**
 * 
 * @author �࿡�
 * @date 2018��7��21�� ����10:18:03 
 *
 */

public enum Enumerate {
	
	//��д��ĸ
	CAP("QWERTYUIOPASDFGHJKLZXCVBNM"), 
	
	//Сд��ĸ
	LOW("qwertyuiopasdfghjklzxcvbnm"), 
	
	//����
	NUMBER("0123456789");

	
	private String name;

	//���췽��
	private Enumerate(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}

}

