package Program;
// same method name declared in parent class
class Bird{
	void sound() {
		System.out.println("Bird make a sound"); 
	}
}
class Sparrow extends Bird{
	//method override
	void sound(){
		System.out.println("Sparrow make a sound"); // replace the method
		
	}
}
public class OverridenMethod {
public static void main(String [] args) {
	Sparrow s= new Sparrow();
	s.sound();
}
}
