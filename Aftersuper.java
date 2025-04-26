package Program;

class A1 {
	
	  A1() { 
	  
	  }
	 
	A1(int a) {
		System.out.println("parameterised  Constructor");

	}
}

class B1 extends A1 {
	B1() {
		//super();
		//System.out.println("child class constructor");
	}

	{
		System.out.println("Instant Initialize");
	}
}

	public class Aftersuper {
		public static void main(String[] args) {
			B1 S = new B1();
		}
		

	}
