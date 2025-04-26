package Program;

public class WithStaticKeyword {
	static int count = 0;

	WithStaticKeyword() {
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithStaticKeyword c1 = new WithStaticKeyword();
		WithStaticKeyword c2 = new WithStaticKeyword();
		WithStaticKeyword c3 = new WithStaticKeyword();

	}

}
