package Program;

abstract class Car_7 {
	public void race() {

	}

	abstract void race1();

}

class Car_8 extends Car_7 {
	void race1() {
		System.out.println("Car_8 is race");
	}

}

public class NewAbstract {
	public static void main(String[] args) {
		Car_7 a = new Car_8(); // upcasting
		// Car_8 a = new Car_8();
		a.race1();
	}
}
