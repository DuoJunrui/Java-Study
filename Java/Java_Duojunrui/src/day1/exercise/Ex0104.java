package day1.exercise;

import java.util.Scanner;

//从键盘上输入两个整数，由用户回答它们的和，差，积，商和取余运算结果，并统计出正确答案的个数。
public class Ex0104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner math=new Scanner(System.in);
		System.out.println("输入第一个数字：");
		num1=Integer.parseInt(math.nextLine());
		System.out.println("输入第二个数字：");
		num2=Integer.parseInt(math.nextLine());
		
		int sum = num1+num2; //和运算	
		int sub = num1-num2; //减运算	
		int mul = num1*num2; //积运算
		int div = num1/num2; //商运算
		int mod = num1%num2; //取余运算
		
		
		int i=0;
		System.out.println("请依次输入两个数的和、差、积、商、取余的结果：");
		int answer1=Integer.parseInt(math.nextLine());
		if(answer1==sum) {
			i++;
		}
		
		int answer2=Integer.parseInt(math.nextLine());
		if(answer2==sub) {
			i++;
		}
		
		int answer3=Integer.parseInt(math.nextLine());
		if(answer3==mul) {
			i++;
		}
		
		int answer4=Integer.parseInt(math.nextLine());
		if(answer4==div) {
			i++;
		}
		
		int answer5=Integer.parseInt(math.nextLine());
		if(answer5==mod) {
			i++;
		}
		
		System.out.println("恭喜您，您一共回答正确了"+i+"次！");
		System.out.println("两数之和为："+sum);
		System.out.println("两数相减为："+sub);
		System.out.println("两数相乘为："+mul);
		System.out.println("两数相除为："+div);
		System.out.println("两数取余为："+mod);
		
		
	}

}
