package day1.exercise;

//声明两个整型变量a,b,同时给a,b赋值，用三目运算比较a,b的大小，返回较大数，并在后台打印出来
public class Ex0103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=100;
		int y=212;
		
		int max=(x>y?x:y);
		System.out.println("最大值为："+max);
	}

}
