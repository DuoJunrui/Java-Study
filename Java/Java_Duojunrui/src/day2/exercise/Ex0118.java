package day2.exercise;

class Number{
	private int n1;
	private int n2;
	
	Number(int n1, int n2) {
		this.n1=n1;
		this.n2=n2;	
	}
	
	void add(){
		System.out.println("n1+n2="+ (n1+n2));
	}
	
	void sub(){
		System.out.println("n1+n2="+ (n1-n2));
	}
	
	void mul(){
		System.out.println("n1+n2="+ (n1*n2));
	}
	
	void div(){
		System.out.println("n1+n2="+ (n1/n2));
	}
	
}




public class Ex0118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number num = new Number(2, 8);
		//num.getNum(2, 8);
		num.add();
		num.sub();
		num.mul();
		num.div();
	}

}
