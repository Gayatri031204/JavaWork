package Program;

public class WithoutStaticKeyword {
	int count = 0;

	WithoutStaticKeyword() {
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithoutStaticKeyword c1 = new WithoutStaticKeyword();
		WithoutStaticKeyword c2 = new WithoutStaticKeyword();
		WithoutStaticKeyword c3 = new WithoutStaticKeyword();

	}

}
