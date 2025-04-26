package Program;

class Teacher {
	void teach() {
		System.out.println("teaching");
	}
}

class Student extends Teacher {
	void read() {
		System.out.println("reading");
	}
}

class Student_1 extends Teacher {
	void write() {
		System.out.println("writing");
	}

}

public class HierarchicalInheritance {
	public static void main(String[] args) {
		Student_1 S = new Student_1();
		Student P = new Student();
		S.teach();
		S.write();
		P.teach();
		P.read();

	}
}
