import java.util.*;
public class Main
{
	public static void main(String[] args) {
		TreeMap<Integer,String> tmap=new TreeMap<>();
		tmap.put(1,"Radha");
		tmap.put(2,"Sara");
		tmap.put(3,"Deepika");
		System.out.println("TreeMap: "+tmap);
		TreeMap<Integer,String> tmap1=new TreeMap<>();
		tmap1.put(4,"Sriya");
		tmap1.put(4,"Deepthi");
		System.out.println("TreeMap1: "+tmap1);
		tmap1.putAll(tmap);
		System.out.println(tmap1);
	}
}