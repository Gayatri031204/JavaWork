package allprograms;

public class Breakloop {
public static void main(String[] args) {
	for(int i=0;i<5;i++) {
		if(i==3) {
		break;
		}
		
		System.out.println("i " + i);
	}
	System.out.println("Look Complete");

}
}
