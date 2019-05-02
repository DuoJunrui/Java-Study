package day1.exercise;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

//基础题：创建一个数组，向数组添加数字，并用for循环遍历出数组的数字并求和，打印求和结果。
public class Ex0102 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int [] i=new int[5];
		i[0]=5;
		i[1]=3;
		i[2]=1;
		i[3]=0;
		i[4]=9;

//		for(int j:i) {
//			 System.out.println( j );	
//		}
		
		int sum=0 ;
		for(int y=0; y<5 ;y++) {
			sum=sum+i[y];
			System.out.println("i[" + y +"]=" + i[y]);
		}
		System.out.println("该数组的和是："+sum);
	
//提升题：求出数组[1,2,3,4,6,10,33,5,9,22,0,-1]最小和最大的值
		int a[] = {1,2,3,4,6,10,33,5,9,22,0,-1};
		int min=a[0];
		int max=a[0];
		
		for(int z=0; z<a.length; z++) {
			
			if(max<a[z]) {
				max=a[z];
			}
			if(min>a[z]) {
				min=a[z];
			}		
		}		
		System.out.println("该数组的最大值为：" + max);	
		System.out.println("该数组的最小值为：" + min);	
	}
	
	
}
	






