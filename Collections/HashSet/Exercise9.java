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
		ArrayList<String> al=new ArrayList<>(hs); //Convert HashSet to List/ArrayList
		for(String n: al){
		    System.out.println(n);
		}
	}
}

