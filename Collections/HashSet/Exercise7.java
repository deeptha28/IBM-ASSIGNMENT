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
		String arr[]=new String[hs.size()];
		hs.toArray(arr); //Convert HashSet to Array
		for(String n: arr){
		    System.out.println(n);
		}
	}
}

