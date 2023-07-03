import java.util.*;
public class Main
{
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Red"); 
		ll.add("Black");
		ll.add("White");
		System.out.println(ll);
		LinkedList<String> ll1=new LinkedList<>();
		ll1.add("Grey");
		ll1.add("Orange");
		ll.addAll(1,ll1); //Insert some elements at specified positions
	    System.out.println(ll);
	}
}

