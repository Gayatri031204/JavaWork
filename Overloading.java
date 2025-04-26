package Program;

class Adder {
	public static int a=10;
	public static float b=100f;
	public static String name = "Car";
	public static double d=1200;
	public static boolean f = true;
	public static boolean h = false;

	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}
	static int add(int a, int b, int c, int k) {
		return a+b+c+k;
	}
	static double add(double a,double b) {
		return a+b;
	}
	static float add(float a,float b) {
		return a+b;
	}
	
}

public class Overloading {
public static void main (String [] args) {
	System.out.println(Adder.add(11, 11));
	System.out.println(Adder.add(11, 11,11));
	System.out.println(Adder.add(11,11,11, 11));
	System.out.println(Adder.add(20, 20));
	System.out.println(Adder.add(22f, 22f));
	System.out.println(Adder.a);
	System.out.println(Adder.b);
	System.out.println(Adder.name);
	System.out.println(Adder.d);
	System.out.println(Adder.f);
	System.out.println(Adder.h);
}
}
