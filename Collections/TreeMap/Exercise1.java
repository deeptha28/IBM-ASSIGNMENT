import java.util.*;
public class Main
{
	public static void main(String[] args) {
		TreeMap<Integer,String> tmap=new TreeMap<>();
		tmap.put(1,"Radha");
		tmap.put(2,"Sara");
		tmap.put(3,"Deepika");
		System.out.println("TreeMap: "+tmap);
		for(Map.Entry x: tmap.entrySet()){
		    System.out.println(x.getKey()+" "+x.getValue());
		}
	}
}
