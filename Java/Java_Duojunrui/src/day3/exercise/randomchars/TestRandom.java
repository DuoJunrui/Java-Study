package day3.exercise.randomchars;

/**
 * 
 * @author �࿡�
 * @date 2018��7��23�� ����12:42:35 
 *
 */

public class TestRandom {

	public static void main(String[] args) throws Exception {
		
		RandomChars rc = new RandomChars(10, Enumerate.NUMBER);
		
		System.out.println("Ĭ���ַ������ȣ�"+rc.getLenght());
		System.out.println("Ĭ���ַ������ͣ�"+rc.getArea());
		System.out.println("���ɵ�����ַ�����"+rc.getChars());
		
		System.out.println("");
		
		rc.setArea(false, "AFRXC");//�û������ַ���
		//rc.setArea(true, "ADJ");
		rc.setLength(20);
		rc.creatChars();
		System.out.println("�û�������ַ������ȣ�"+rc.getLenght());
		System.out.println("�û�������ַ������ͣ�"+rc.getArea());
		System.out.println("���ɵ�����ַ�����"+rc.getChars());
		
		rc.deleteChar("XC");
		System.out.println("ɾ���Զ����ַ�����ַ�����"+rc.getArea());
	
	}
}
