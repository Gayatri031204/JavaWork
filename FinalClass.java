package Program;
// final class cannot be inherited
 final class Car_5 {
}

public class FinalClass extends Car_5 {  // final class cannot be inherited hence we getting error
	void run() {
		System.out.println("Car is running");
	}

	public static void main(String[] args) {
		FinalClass c = new FinalClass();
		c.run();
	}
}
