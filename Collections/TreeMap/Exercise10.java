import java.util.*;
public class Main
{
	public static void main(String[] args) {
		TreeMap<String,String> tmap=new TreeMap<>();
		tmap.put("A1","Radha");
		tmap.put("A2","Sara");
		tmap.put("A3","Deepika");
		System.out.println(tmap);
		System.out.println(tmap.descendingKeySet());
	}
}