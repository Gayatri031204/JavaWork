package Program;

	class Bank{
		int getRateOfInterst() {return 0 ;}
	}
class SBI extends Bank{
	int getRateOfInterest() {return 8;}
}
class ICICI extends Bank{
	int getRateOfInterest() {return 7;}
}
 class AXIS extends Bank{
	 int getRateOfInterest() {return 6;}
 }

public class Overriden {
	public static void main (String [] args) {
		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();
		System.out.println("SBi Interest is:" + s.getRateOfInterest());
		System.out.println("ICICI Interest is:" + i.getRateOfInterest());
		System.out.println("AXIS Interst is:" + a.getRateOfInterest());
		 										
		
	}

}
