package Program;

public class ParameterizedConstructor {
	int id;
	String name;
	ParameterizedConstructor(){ // Non Parameterised constructor
		
	}

	ParameterizedConstructor(int i, String n) {   //Parameterised constructor
		id = i;
		name = n;
	}

	public void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedConstructor obj = new ParameterizedConstructor(10, "karan");
		ParameterizedConstructor obj_2 = new ParameterizedConstructor();
		obj.display();
		obj_2.display();

	}

}
