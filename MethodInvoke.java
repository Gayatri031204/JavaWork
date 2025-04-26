package Program;

public class MethodInvoke {
	void m() {
		System.out.println("hello m");
	}

	void n() {
		m(); // m(),this.m()
		this.o();
		System.out.println("hello n");

	}
	void o() {
		System.out.println("hello o");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodInvoke a = new MethodInvoke();
		a.n();
	}
}
