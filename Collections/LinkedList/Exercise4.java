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
		/*for(int i=ll.size()-1;i>=0;i--){
		    System.out.println(ll.get(i));
		}*/
		Iterator p= ll.descendingIterator();
		while(p.hasNext()){
		    System.out.println(p.next());
		}
	    
	}
}