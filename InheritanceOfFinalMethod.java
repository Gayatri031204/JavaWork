package Program;
 //the final method can be inherited, but we cannot override it
class Bike_8 {    
	  final void run() { System.out.println("running...");   }    
	}    
public class InheritanceOfFinalMethod extends Bike_8  {    
	   public static void main(String args[])  {    
		   //  new InheritanceOfFinalMethod().run();   
		   InheritanceOfFinalMethod n = new InheritanceOfFinalMethod();
		   n.run();
	   }    
	}    

 
	


