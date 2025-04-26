package Program;

public class ConstructorWiththis {
	int age;
	String name;

	ConstructorWiththis() {
		System.out.println("non parameterized constructor");

	}

	ConstructorWiththis(int i, String n) {
		this();

		age = i;
		name = n;
	}

	public void display() {
		System.out.println(age + "  " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorWiththis a1 = new ConstructorWiththis(20, "Pranali");
		// ConstructorWiththis a2 = new ConstructorWiththis();
		a1.display();
		// a2.display();
	}

}
