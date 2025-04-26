package allprograms;

public class Integerprogram {

	public static void main(String[] args) { 
		/*
		 * int a=10; int b=20; System.out.println(a+b);
		 */
		
		
		//Valid positive integer range
		int a=2147483647;
		int c=2147483645;
		System.out.println("integer range: "+ a);
		System.out.println("integer range: "+ c);
		
		//invalid range
		/*
		 * int b=2147483648; System.out.println("integer range: "+ b);
		 */


		//Valid negative integer range
		int f=-2147483648; // valid
		//int g=-2147483649; //invalid - out of range
		//int h=-2147483642; 
		int i=-1147483648;
		System.out.println("integer range: "+ f);
		//System.out.println("integer range: "+ g);
		System.out.println("integer range: "+ f);
		System.out.println("integer range: "+ i);
		
		
	}

}
