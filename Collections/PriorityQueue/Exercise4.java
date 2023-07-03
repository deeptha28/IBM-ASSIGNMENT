import java.util.*;
public class Main
{
	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("Blue");
		pq.add("Black");
		pq.add("Red");
		pq.offer("White");
		System.out.println("PriorityQueue1: "+pq);
		
	}
}