import java.util.*;
public class Main
{
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<>();
		ts.add("Blue"); 
		ts.add("Grey");
		ts.add("Green"); 
		ts.add("Orange");
		TreeSet<String> ts1=new TreeSet<>();
		ts1=(TreeSet<String>)ts.clone(); //Clone a TreeSet list to another TreeSet
		System.out.println(ts1);
		
	}
}