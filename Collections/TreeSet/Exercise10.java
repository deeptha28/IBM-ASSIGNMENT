import java.util.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(1); 
		ts.add(2); 
		ts.add(3); 
		ts.add(4); 
		ts.add(5); 
		ts.add(6);
		ts.add(7); 
		ts.add(9); 
		System.out.println(ts);
		System.out.println("Greater than or equal to 8: "+ts.ceiling(8)); //Greater than or equal to given element
	    
	}
}