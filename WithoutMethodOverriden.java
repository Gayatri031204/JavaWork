package Program;

class vehicle_2 {
	void run() {
		System.out.println("vehicle_2 is running");
	}
}

class Bike_3 extends vehicle_2 {
	void run() {
		System.out.println("Bike_3 is running");
	}
}

public class WithoutMethodOverriden {
	public static void main(String[] args) {
		Bike_3 obj = new Bike_3();
		obj.run();
	}
}
																																																																																																																																																							