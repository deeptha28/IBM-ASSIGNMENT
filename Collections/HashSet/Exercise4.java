import java.util.*;
public class Main
{
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		hs.add("Blue"); 
		hs.add("Grey");
		hs.add("Purple");
		hs.add("Pink");
		hs.removeAll(hs); //Empty the HashSet
		System.out.println(hs);
	}
}
