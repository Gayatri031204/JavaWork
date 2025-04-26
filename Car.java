package Program;

public class Car {
String brand;
int year;


  Car(String carBrand,int carYear){ brand = carBrand; year = carYear; }
 void displayInfo() {
	System.out.println("Brand: " +brand);
	System.out.println("Year:" +year);  
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car mycar = new Car("Toyoto",2020);

mycar.displayInfo();
	}

}
