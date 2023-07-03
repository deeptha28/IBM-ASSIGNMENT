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
		System.out.println(ll);
		ll.add(0,"Purple"); //Element added to the front of the list
		/* ll.offerFirst("Purple"); */
		System.out.println(ll); 
	    
	}
}
