package day2.exercise;

import java.util.Scanner;

public class Ex0122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
	    System.out.print("������1~9��һ�����֣�");
	    int x=in.nextInt();
	    System.out.print("��������Ӵ�����");
	    int y=in.nextInt();
	    
	    int a=0,sum=0;
	       for(int n=1;n<=y;n++){
	    	   a=(a*10)+x;
	           sum+=a;
	           }
	            System.out.print("���ĺ�Ϊ��"+sum); 
	       }
}


