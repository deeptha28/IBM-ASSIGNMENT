import java.util.*;
public class Main
{
	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("Blue");
		pq.add("Black");
		pq.add("Red");
		System.out.println(pq);
		System.out.println("PriorityQueue first element: "+pq.peek());
		
	}
}