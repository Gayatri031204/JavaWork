package Program;

class Employee {

	float salary = 40000;
}

class Gayatri1 extends Employee {
	int bonus = 10000;
}

public class Gayatri {
	public static void main(String args[]) {
		Gayatri1 p = new Gayatri1();
		System.out.println("Programmer salary is:" + p.salary);
		System.out.println("Bonus of Programmer is:" + p.bonus);
	}
}
