package com.syh.ex130;

import java.io.IOException;

public class TeacherWriteAsk {
	public static void main(String[] args) throws IOException {
		Teacher t = new Teacher("˾��Ǩ", 10, "����");
		
		t.startWriteAsk();
		t.writeAskTitle("�����ĸ����Ҳ��������ޣ�");
		t.writeAskOption("ɳ��", "ӡ��", "����", "Խ��");
		t.writeAskAnswer("C");
		
		t.writeAskTitle("�������ֶ�������è�ƶ��");
		t.writeAskOption("�๷", "Ϭţ", "����", "ʨ��");
		t.writeAskAnswer("D");
	}
}
