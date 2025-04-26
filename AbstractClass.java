package Program;

abstract class BBBB {
	BBBB(){//Abstract class can have constructor
	}
	
	abstract void run();
}

class DDD extends BBBB {
	@Override
	void run() {
		System.out.println("Child class method");
	}
}

public class AbstractClass {
	public static void main(String args[]) {
		BBBB obj = new DDD(); // upcasting
		//BBBB obj2 = new BBBB();
		obj.run();

	}

}
