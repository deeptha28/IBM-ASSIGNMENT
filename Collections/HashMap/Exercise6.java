import java.util.*;
public class Main
{
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1,"Radha");
		map.put(2,"Sara");
		map.put(3,"Deepika");
		System.out.println("Map: "+map);
		HashMap<Integer,String> map1=new HashMap<>();
		map1=(HashMap)map.clone();
		System.out.println("Map1: "+map1);
	}
}