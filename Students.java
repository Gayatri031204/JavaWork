package Program;

public class Students {
	int rollno;
	String name, course;
	float fee;

	

	Students(int rollno, String name,String course, float fee) {
		this.rollno = rollno; // parameters and variable name are same
		this.name = name;
		this.fee = fee;
		this.course=course;
	}

	public void display() {
		System.out.println(rollno + " " + name + " "+ course +" " + fee);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1 = new Students(10, "Darshal","CA", 5000f);
		Students s2 = new Students(11, "Gayatri","AC", 6000f);
		s1.display();
		s2.display();
	}
}
