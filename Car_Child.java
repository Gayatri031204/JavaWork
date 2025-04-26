package Program;

public class Car_Child {
String color;
int speed;
	public static void main(String[] args) {
		Car_Parent pobj= new Car_Parent();
		pobj.color="cc";
		System.out.println(pobj.color);
		System.out.println(pobj.mytest());

	}
	

}
