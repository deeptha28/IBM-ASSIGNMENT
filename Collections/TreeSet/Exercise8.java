import java.util.*;
public class Main
{
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<>();
		ts.add("Blue"); 
		ts.add("Grey");
		ts.add("Orange"); 
		TreeSet<String> ts1=new TreeSet<>();
		ts1.add("Blue"); 
		ts1.add("Green");
		ts1.add("Orange");
		System.out.println(ts);
		System.out.println(ts1);
	    for(String s: ts){
	        if(ts1.contains(s)){ //Compare two TreeSets
	            System.out.println("Yes");
	        }
	        else{
	            System.out.println("No");
	        }
	    }
	}
}