import java.util.*;
public class Main
{
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<>();
		ts.add("Blue"); 
		ts.add("Grey");
		ts.add("Green"); 
		ts.add("Orange");
		Iterator p= ts.descendingIterator(); //Reverse order view of elements
		while(p.hasNext()){
		    System.out.println(p.next());
		}
	}
}