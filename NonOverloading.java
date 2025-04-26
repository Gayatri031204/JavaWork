package Program;

class Adder2 {

	int add(int a, int b) {
		return a + b;
	}
	


	
	

	int add(int a, int b, int c) {
		return a + b + c;
	}
	
}
public class NonOverloading {
	public static void main(String[] args) {
		Adder2 obj = new Adder2();
		int c = obj.add(11, 11);
		System.out.println(c);
		
		System.out.println( obj.add(110, 110, 110));
	}
	}

