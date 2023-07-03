import java.util.*;
public class Main
{
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Red"); 
		ll.add("Black");
		ll.add("White");
		String l=ll.getFirst(); //First Occurence
		System.out.println(l); //Last Occurence
		String ln=ll.getLast();
		System.out.println(ln);
	}
}

