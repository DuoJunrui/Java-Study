package part2.oop.day04;

public class Doctor extends Person{
	String level;
	public Doctor(String name, int age, String address, String level) {
		super(name, age, address);
		this.level = level;
	}
}
