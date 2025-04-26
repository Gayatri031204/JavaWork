package Program;

public class Test {
	String color;
	int speed;
	void show() {
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
Car_Child mycar = new Car_Child();
Car_Parent p = new Car_Parent ();
mycar.color = "Pink";
p.speed = 100;

System.out.println("Color :" + mycar.color);
System.out.println("speed :" + p.speed);
System.out.println(p.mytest());
	}
} 

