package Program;



class Vehicle {
	void run() {
		System.out.println("Vehicle is running");
	}
}

class BikeVehicle extends Vehicle {
	void run() {
		System.out.println("Bike is running safely");
	}
}



public class MethodOverridingEx {
public static void main(String[] args) {
	BikeVehicle obj = new BikeVehicle();
	obj.run();
}
}
