package day1.exercise;

import java.util.Scanner;

//Ҫ���û�¼��3�������ֱ��ӦһԪ���η��̵Ķ�Ԫ����ϵ����һԪ����ϵ���Լ�������֮�������һԪ���β���ʽ�ĸ���
public class Ex0108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������a,b,c��ֵ��");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        double x1,x2,t;
       
        t = b*b - 4*a*c;

        System.out.println("����" + a + "x*x+" + b + "x+" + c + "<0�Ľ⣺");

        if(t < 0){

            System.out.println("�˷����޽�");

        }else{

            x1 = ((-b)+Math.pow(t,1/2))/(2*a);

            x2 = ((-b)-Math.pow(t,1/2))/(2*a);

            System.out.print("x1<" + x1 +" , " + "x2<" + x2);

        }
	}

}
