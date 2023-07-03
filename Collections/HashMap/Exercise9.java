import java.util.*;
public class Main
{
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1,"Radha");
		map.put(2,"Sara");
		map.put(3,"Deepika");
		System.out.println("Map: "+map);
		Set set=map.entrySet();
		System.out.println(set);
	}
}