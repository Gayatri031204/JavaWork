package Program;

public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation obj = new Calculation();
		int c =  obj.addition(5, 7);
		int d=0;
		System .out.println(c);
		System .out.println(d);
		// System.out.println(obj.addition(5, 7));
		obj.substraction(0.5f,0.9f);
		//System.out.println(obj.substraction(0.5f,0.9f));
		obj.multiplication( 2, 5);
		
	}

	public int addition(int a, int b) {
		return a + b;

	}
	public float substraction (float c,float d) {
		float sub;
		sub=c-d;
		System.out.println(sub);
		return sub;
	}
	public void multiplication (int s,int p) {
	int g=s*p;
	System.out.println(s*p);
	System.out.print("The maximum number is: " + Math.max(9,7));  
	}  
	}


