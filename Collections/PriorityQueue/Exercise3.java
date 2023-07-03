import java.util.*;
public class Main
{
	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("Blue");
		pq.add("Black");
		pq.add("Red");
		System.out.println("PriorityQueue1: "+pq);
		PriorityQueue<String> pq1=new PriorityQueue<>();
		pq1.addAll(pq);
		System.out.println("PriorityQueue2: "+pq1);
	}
}