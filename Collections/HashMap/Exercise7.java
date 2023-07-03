import java.util.*;
public class Main
{
	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<>();
		map.put("Radha",1);
		map.put("Sara",2);
		map.put("Deepika",3);
		System.out.println("Map: "+map);
		if(map.containsKey("Radha")){
		    System.out.println("Yes "+map.get("Radha"));
		}
		else{
		    System.out.println("No");
		}
	}
}
