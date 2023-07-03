import java.util.*;
public class Main
{
	public static void main(String[] args) {
		TreeMap<Integer,String> tmap=new TreeMap<>();
		tmap.put(1,"Radha");
		tmap.put(2,"Sara");
		tmap.put(3,"Deepika");
		if(tmap.containsValue("Radha")){
		    System.out.println("Value is there");
		}
		else{
		    System.out.println("Value is not there");
		}
		if(tmap.containsValue("Ziva")){
		    System.out.println("Value is there");
		}
		else{
		    System.out.println("Value is not there");
		}
	}
}