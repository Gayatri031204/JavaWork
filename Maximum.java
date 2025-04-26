package allprograms;

public class Maximum {
public static void main(String[] args) {
	// Java Program to find maximum in an array
	// Using for-each loop
	
	        int[] mark = {125, 132, 95, 116, 110};

	        int max = findMax(mark);
	        System.out.println("" + max);
	    }

	    public static int findMax(int[] n) {
	        int maximum = n[0];

	        // Iterates through the array
	        for (int n1: n) {        
	            if (n1 > maximum) {
	                maximum = n1;
	            }
	        }
	        return maximum;
	    }
	

}

