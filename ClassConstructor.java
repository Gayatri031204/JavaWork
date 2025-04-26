package Program;

public class ClassConstructor {

	ClassConstructor() {
		System.out.println("hello a");

	}

	ClassConstructor(String x) {
		this();
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassConstructor a = new ClassConstructor("Pravin");

	}

}
