package Program;

class Bike7 {
	//global variable
	int speed=15;
	int a;
	int c=12;

	Bike7() {
		System.out.println("Bike7 speed is " +speed);
		System.out.println("my display method " + a);
		System.out.println("my display method " + c);
	}
	
	void display() {
		int b=10;
		System.out.println("my display method " + speed);
		System.out.println("my display method " + a);
		System.out.println("my display method " + b);
		System.out.println("my display method " + c);
	}
	/*
	 * void display_2() {
	 * 
	 * System.out.println("my display method " + b); }
	 */

	{
		speed = 16; // instant initialize
		a=10;
	}
}

public class InstantInitialize {
	public static void main(String[] args) {
		Bike7 b1 = new Bike7();
		b1.display();
		/*
		 * Bike7 b2 = new Bike7(); b2.display();
		 */
	}
}
