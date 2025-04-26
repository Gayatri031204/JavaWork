package Program;

public class StaticBinding {
	private void method() {
		System.out.println("Method");
	}

	public static void main(String[] args) {
		StaticBinding a = new StaticBinding();
		a.method();
	}
}