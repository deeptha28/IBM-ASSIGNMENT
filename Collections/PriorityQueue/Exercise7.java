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
		pq1.add("Yellow");
		pq1.add("Black");
		pq1.add("Red");
		System.out.println("PriorityQueue2: "+pq1);
		for(String s : pq){
		    System.out.println(pq1.contains(s) ? "Yes" : "No");
		     
		}
		
	}
}
