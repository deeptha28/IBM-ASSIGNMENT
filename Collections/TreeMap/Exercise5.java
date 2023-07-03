import java.util.*;
public class Main
{
	public static void main(String[] args) {
		TreeMap<Integer,String> tmap=new TreeMap<>();
		tmap.put(1,"Radha");
		tmap.put(2,"Sara");
		tmap.put(3,"Deepika");
		Set<Integer> key=tmap.keySet();
		for(int s: key){
		    System.out.println(s);
		}
	}
}
