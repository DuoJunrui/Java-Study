package day3.exercise.other;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Ex0126 {

	public static void main(String[] args) throws ParseException {

		// ���ַ���תΪ����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dstr = "2018-08-15 00:00:00 ";
		java.util.Date date = sdf.parse(dstr);
		long s1 = date.getTime();// ��ʱ��תΪ����
		long s2 = System.currentTimeMillis();// �õ���ǰ�ĺ���
		int day = (int) ((s1 - s2) / 1000 / 60 / 60 / 24);
		System.out.println("���������ʮ���ջ���" + day + "�죬���������ӣ���ż٣�");

	}

}
