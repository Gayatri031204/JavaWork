package Program;
class Car_2{
	String color = "Yellow";
}
class Car_1 extends Car_2{
	String color = "Black";
void color() {
		System.out.println("Car_1 class method");
	}
}

class Car_vehicle extends Car_1{
	String color = "Blue";
	void color() {
		System.out.println("Car_vehicle class method");
	}

	void printcolor() {
		String color="Red";
		System.out.println(color);
		System.out.println(super.color);
		super.color();
	}
}

public class MethodScope {
	public static void main(String[] args) {
		Car_vehicle c = new Car_vehicle();
		
		c.printcolor();
		
	}
}
