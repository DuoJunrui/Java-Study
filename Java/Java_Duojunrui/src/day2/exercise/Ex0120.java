package day2.exercise;

//����
class Vehicles{
	String Brand;//��Ʒ��
	String Color;//��ɫ
	
	public Vehicles(String Brand, String Color) {
		this.Brand=Brand;
		this.Color=Color;	
	}
	
	void run() {
		
	}
	
	void showInfor() {
		System.out.println("Ʒ��:" +Brand+ "\n��ɫ:"+Color);
	}
	
	
}

//����Car
 class BigCar extends Vehicles{
	
	 int seats;
	
	public BigCar(String Brand, String Color, int seats) {
		super(Brand, Color);
		this.seats=seats;
	}

	void showCar() {
		super.showInfor();
		System.out.println( "��λ��"+seats) ;
	}
	
}

//����Truck
class Truck extends Vehicles{
	
	float load;
	
	public Truck(String Brand, String Color,float load) {
		super(Brand, Color);
		this.load=load;
		
	}

	void showTruck() {
		super.showInfor();
		System.out.println("�������"+load);
	}
	
}


public class Ex0120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicles veh = new Vehicles("����", "��ɫ");
		veh.showInfor();
		
		BigCar car = new BigCar("һ��", "��ɫ", 5);
		car.showCar();
		
		Truck truck = new Truck("����", "����", 50f);
		truck.showTruck();
	
		
	}

}
