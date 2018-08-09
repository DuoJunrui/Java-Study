package day1.exercise;

import java.util.Scanner;

//编写一段程序，运行时向用户提问“你考了多少分？（0~100）”，接受输入后判断其等级并显示出来。判断依据：等级={优 （90~100分）；良 （80~89分）；中 （60~79分）；差 （0~59分）；}
public class Ex0109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("你考了多少分？（0~100）?");
		Scanner in = new Scanner(System.in);
		double score = in.nextDouble();
		
		if(score>=90 && score<=100) {
			System.out.println("你的成绩等级为：优。");
		}else if(score>=80 && score<=89) {
			System.out.println("你的成绩等级为：良。");
		}else if(score>=60 && score<=79) {
			System.out.println("你的成绩等级为：中。");
		}else if(score>=0 && score<=59) {
			System.out.println("你的成绩等级为：差。");
		}else System.out.println("您输入有误，成绩范围为0~100.");
}

}
