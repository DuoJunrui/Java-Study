package day2.exercise;

import java.io.InputStream;
import java.util.Scanner;

class Car{
	int speed,size;
	String color="白色";
	
	void move() {
		
	}
	
	Car(int speed,int vol) {
		this.speed=speed;
		this.size=vol;
		
	}
	
	void speedUP() {
		this.speed++;
		
	}
	
	void speedDown() {
		this.speed--;
	}
}

//class act{
//	int i;
//	Scanner in = Scanner(System.in);
//	int i = in.nextInt();
//	if(i==1) {
//		car.speedUP();
//	}else {
//		car.speedDown();
//	}
	
//}

public class Ex0116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car(100,50);
		
		System.out.println("车的速度为："+ car.speed);
		System.out.println("车的体积为："+ car.size);
		System.out.println("需要加速还是减速？  1为加速,0为减速");
		
		
		
	}

	
}
