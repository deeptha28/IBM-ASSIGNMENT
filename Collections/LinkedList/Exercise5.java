import java.util.*;
public class Main
{
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Red"); 
		ll.add("Black");
		ll.add("Grey");
		ll.add("Orange");
		ll.add("White");
		ll.add(1,"Yellow"); //Insert specified element at specified position
		System.out.println(ll);
	    
	}
}
