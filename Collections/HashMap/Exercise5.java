import java.util.*;
public class Main
{
	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<>();
		map.put("Radha",1);
		System.out.println("Map: "+map);
		for(Map.Entry x: map.entrySet()){
		    if(map.isEmpty()){
		        System.out.println("Empty");
		    }
		    else{
		        System.out.println("Not Empty");
		    }
		}
	}
}