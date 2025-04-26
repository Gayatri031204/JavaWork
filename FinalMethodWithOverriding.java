package Program;

class Bike_7 {
	final void overrideMethod() {
		System.out.println("Override Method from parent");
	}
}



public class FinalMethodWithOverriding extends Bike_7 {
	void overrideMethod() { //Cannot override the final method from Bike_7
		System.out.println("Override Method from child");
	}
	public static void main(String[] args) {
		FinalMethodWithOverriding obj = new FinalMethodWithOverriding();
		obj.overrideMethod();
	}

}

