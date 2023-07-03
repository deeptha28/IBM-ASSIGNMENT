import java.util.*;
public class Main
{
	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<>();
		map.put("Radha",1);
		map.put("Sara",2);
		map.put("Deepika",3);
		System.out.println(map);
		for(Map.Entry c: map.entrySet()){
		    System.out.println(c.getKey()+" "+c.getValue());
		}
		
	}
}