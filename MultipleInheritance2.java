package Program;

class AAA {
	void msg() {
		System.out.println("Hello");
	}

}


class BBB {
	void msg() {
		System.out.println("Hello");
	}

}

public class MultipleInheritance2 extends BBB,AAA{
	MultipleInheritance2 m= new MultipleInheritance2();
	m.msg();
}