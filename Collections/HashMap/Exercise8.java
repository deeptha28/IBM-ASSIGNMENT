import java.util.*;
public class Main
{
	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<>();
		map.put("Radha",1);
		map.put("Sara",2);
		map.put("Deepika",3);
		System.out.println("Map: "+map);
		if(map.containsValue(1)){
		    System.out.println("Yes");
		}
		else{
		    System.out.println("No");
		}
	}
}