import java.util.*;
public class Main
{
	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<>();
		map.put("Radha",1);
		map.put("Sara",2);
		map.put("Deepika",3);
		System.out.println("Map: "+map);
		HashMap<String,Integer> map1=new HashMap<>();
		map1.put("Rekha",4);
		map1.put("Shravan",5);
		map1.put("Pranay",6);
		System.out.println("Map1: "+map1);
		map1.putAll(map);
		System.out.println(map1);
		
	}
}