package com.syh.ex130;

import java.io.IOException;

public class TeacherWriteAsk {
	public static void main(String[] args) throws IOException {
		Teacher t = new Teacher("司马迁", 10, "教授");
		
		t.startWriteAsk();
		t.writeAskTitle("下列哪个国家不属于亚洲？");
		t.writeAskOption("沙特", "印度", "巴西", "越南");
		t.writeAskAnswer("C");
		
		t.writeAskTitle("下列哪种动物属于猫科动物？");
		t.writeAskOption("鬣狗", "犀牛", "大象", "狮子");
		t.writeAskAnswer("D");
	}
}
