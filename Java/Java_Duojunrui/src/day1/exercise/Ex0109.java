package day1.exercise;

import java.util.Scanner;

//��дһ�γ�������ʱ���û����ʡ��㿼�˶��ٷ֣���0~100����������������ж���ȼ�����ʾ�������ж����ݣ��ȼ�={�� ��90~100�֣����� ��80~89�֣����� ��60~79�֣����� ��0~59�֣���}
public class Ex0109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�㿼�˶��ٷ֣���0~100��?");
		Scanner in = new Scanner(System.in);
		double score = in.nextDouble();
		
		if(score>=90 && score<=100) {
			System.out.println("��ĳɼ��ȼ�Ϊ���š�");
		}else if(score>=80 && score<=89) {
			System.out.println("��ĳɼ��ȼ�Ϊ������");
		}else if(score>=60 && score<=79) {
			System.out.println("��ĳɼ��ȼ�Ϊ���С�");
		}else if(score>=0 && score<=59) {
			System.out.println("��ĳɼ��ȼ�Ϊ���");
		}else System.out.println("���������󣬳ɼ���ΧΪ0~100.");
}

}
