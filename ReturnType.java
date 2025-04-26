package Program;
class Addition_2{
	public void Addition(int a, int b) {
		int c= a+b;
		//System.out.println(c);
		
	}
	
	public int Addition2(int a, int b) {
		int c= a+b;
		return c;
		
	}
}
	
	
	
	class ReturnType {
		public static void main(String[] args) {
			Addition_2 obj= new Addition_2();
			obj.Addition(11,11);
			int d =obj.Addition2(11, 11);
			System.out.println(d);
		}
}


