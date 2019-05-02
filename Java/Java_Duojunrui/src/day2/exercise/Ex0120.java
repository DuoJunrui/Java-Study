package day2.exercise;

//基类
class Vehicles{
	String Brand;//车品牌
	String Color;//颜色
	
	public Vehicles(String Brand, String Color) {
		this.Brand=Brand;
		this.Color=Color;	
	}
	
	void run() {
		
	}
	
	void showInfor() {
		System.out.println("品牌:" +Brand+ "\n颜色:"+Color);
	}
	
	
}

//子类Car
 class BigCar extends Vehicles{
	
	 int seats;
	
	public BigCar(String Brand, String Color, int seats) {
		super(Brand, Color);
		this.seats=seats;
	}

	void showCar() {
		super.showInfor();
		System.out.println( "座位："+seats) ;
	}
	
}

//子类Truck
class Truck extends Vehicles{
	
	float load;
	
	public Truck(String Brand, String Color,float load) {
		super(Brand, Color);
		this.load=load;
		
	}

	void showTruck() {
		super.showInfor();
		System.out.println("里程数："+load);
	}
	
}


public class Ex0120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicles veh = new Vehicles("大众", "黑色");
		veh.showInfor();
		
		BigCar car = new BigCar("一汽", "白色", 5);
		car.showCar();
		
		Truck truck = new Truck("吉普", "军绿", 50f);
		truck.showTruck();
	
		
	}

}
