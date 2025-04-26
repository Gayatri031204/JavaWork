package Program;
//If you declare any parameter as final, we cannot change its value of.
public class FinalParameter {

public void value(final int num){  
    System.out.println(num); 
    
	  
	   }  
	   public static void main(String args[]){  
	      FinalParameter obj = new  FinalParameter ();  
	      obj.value(400);  
	   }    
	}  

//final value can't be change
//final method can't be override but final method can be inherited
//final class can't be inherited


