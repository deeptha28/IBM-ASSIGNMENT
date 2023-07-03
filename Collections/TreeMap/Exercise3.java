import java.util.*;
public class Main
{
	public static void main(String[] args) {
		TreeMap<Integer,String> tmap=new TreeMap<>();
		tmap.put(1,"Radha");
		tmap.put(2,"Sara");
		tmap.put(3,"Deepika");
		if(tmap.containsKey(1)){
		    System.out.println("Key is there");
		}
		else{
		    System.out.println("Key is not there");
		}
		if(tmap.containsKey(4)){
		    System.out.println("Key is there");
		}
		else{
		    System.out.println("Key is not there");
		}
	}
}