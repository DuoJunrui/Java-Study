package day1.exercise;

import java.util.Scanner;

//要求用户录入3个数，分别对应一元二次方程的二元变量系数、一元变量系数以及常数，之后，输出该一元二次不等式的根。
public class Ex0108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入a,b,c的值：");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        double x1,x2,t;
       
        t = b*b - 4*a*c;

        System.out.println("方程" + a + "x*x+" + b + "x+" + c + "<0的解：");

        if(t < 0){

            System.out.println("此方程无解");

        }else{

            x1 = ((-b)+Math.pow(t,1/2))/(2*a);

            x2 = ((-b)-Math.pow(t,1/2))/(2*a);

            System.out.print("x1<" + x1 +" , " + "x2<" + x2);

        }
	}

}
