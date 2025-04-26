package Program;
//Dynamic Binding
class Dog_2 {
	void eat() {
		System.out.println("Dog_2 is eating");
	}
}

class BabyDog_3 extends Dog_2 {
	void eat() {
		System.out.println("BabyDog_3 is eating");
	}
}

public class DynamicBinding {
	public static void main(String[] args) {
		Dog_2 b = new BabyDog_3();//upcasting
		b.eat();
	}
}
