package Program;

public class Constructor {
	int id;
	String name;
     int value;
	Constructor() {
		this(11, "Darshal",99);
		System.out.println("nonparameterized constuctor");

	}

	Constructor(int i, String n) {
		id = i;
		name = n;
	}
	Constructor(int i,String n,int d){
		id=i;
		name=n;
	    value=d;
	}
	private void Constructor() {
		// TODO Auto-generated method stub

	}

	public void display() {
		System.out.println(id + " " + name +" "+value);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor b1 = new Constructor();
//Constructor b2 = new Constructor(17,"Aarya");
		b1.display();
//b2.display();
	}

}
