import java.util.*;
public class Main
{
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<>();
		ts.add("Blue"); 
		ts.add("Grey");
		TreeSet<String> ts1=new TreeSet<>();
		ts1.add("Green"); 
		ts1.add("Orange");
		ts.addAll(ts1); //Add elements of one TreeSet to another
		System.out.println(ts);
		
	}
}