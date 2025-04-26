package Program;

abstract class Shape {
	void Drawing() {
		System.out.println("Drawing");
	}

	abstract void draw();
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("Drawing Rectangle");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("Drawing Circle");
	}
}

public class AbstractMethod {
	public static void main(String[] args) {
		Shape s = new Circle();
		s.draw();
		s.Drawing();
	}

}
