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
		ll.offerLast("Purple"); //Element added to the end of the list
		System.out.println(ll); 
	    
	}
}
