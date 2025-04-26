package Program;
class Dog3{
}

class Dog2 {

}

public class InstanceOfNull {
	public static void main(String args[]) {
		//Dog2 d = null;
		Dog2 d1 = new Dog2();
		Dog3 d2 = new Dog3();
		
		System.out.println(d2 instanceof Dog3);
		System.out.println(d1 instanceof Dog2);
	}
}