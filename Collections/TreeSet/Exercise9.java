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
		ts.add(8);
		ts.add(9); 
		System.out.println(ts);
		System.out.println(ts.headSet(7));
		for(int i: ts.headSet(7)){
		    System.out.println(i);
		}
	    
	}
}