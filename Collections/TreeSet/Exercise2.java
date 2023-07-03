import java.util.*;
public class Main
{
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<>();
		ts.add("Blue"); 
		ts.add("Grey");
		ts.add("Purple");
		ts.add("Green"); 
		ts.add("Orange");
		System.out.println(ts); 
		for(String n: ts){ //Iterate through the elements and print
		    System.out.println(n);
		}
		
	}
}