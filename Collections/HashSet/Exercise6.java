import java.util.*;
public class Main
{
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		hs.add("Blue"); 
		hs.add("Grey");
		hs.add("Purple");
		hs.add("Pink");
		HashSet<String> hs1=new HashSet<>();
		hs1=(HashSet)hs.clone(); //Clone a HashSet to another HashSet
		System.out.println(hs);
		System.out.println(hs1);
	}
}
