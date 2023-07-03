import java.util.*;
public class Main
{
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Red"); //
		ll.add("Black");
		ll.add("Grey");
		ll.add("Orange");
		ll.add("White");
		/*for(int i=2;i<ll.size();i++){
		    System.out.println(ll.get(i));
		}*/
		Iterator p = ll.listIterator(2); //Iterate starting at specified position
		while(p.hasNext()){
		    System.out.println(p.next());
		}
	    
	}
}