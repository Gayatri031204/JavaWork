package allprograms;

import java.util.Scanner;

public class Inheritance {
	public static void main(String[] args) {
		
		Programmer P = new Programmer();
		System.out.println(" Programmer salary is:" + P.salary);
		System.out.println("Programmer bonus is:" + P.bonus);

	}

}

class Employee {
	public Float salary = 45000f;
}

class Programmer extends Employee {

	int bonus = 10000;
}
