import java.util.*;
public class Main
{
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		hs.add("Blue"); 
		hs.add("Grey");
		hs.add("Purple");
		hs.add("Pink");
		System.out.println(hs);
		TreeSet<String> ts=new TreeSet<>(hs); //Convert HashSet to TreeSet
		for(String n: ts){
		    System.out.println(n);
		}
	}
}

