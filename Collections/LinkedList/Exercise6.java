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
		//ll.add(0,"Yellow"); //Insert specified element at the first position
		//ll.add(ll.size(),"Blue"); //Insert specified element at the last position
		ll.addFirst("Yellow"); //Insert specified element at the first position
		ll.addLast("Blue"); //Insert specified element at the last position
		System.out.println(ll);
	    
	}
}
