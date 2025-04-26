package Program;

abstract class Bank {
	abstract int getRateOfInterest();
}

class Axis extends Bank {
	int getRateOfInterest() {
		return 8;
	}
}

class SBI extends Bank {
	int getRateOfInterest() {
		return 9;
	}
}

public class Abstract {
	public static void main(String[] args) {
		Bank b = new SBI();
		b.getRateOfInterest();
		Bank b1 = new Axis();
		b1.getRateOfInterest();
		System.out.println(b1.getRateOfInterest());
		System.out.println(b.getRateOfInterest());
	}
}
