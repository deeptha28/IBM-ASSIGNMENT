import java.util.*;
public class Main
{
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		hs.add("Blue"); 
		hs.add("Grey");
		hs.add("Purple");
		System.out.println(hs);
		HashSet<String> hs1=new HashSet<>();
		hs1.add("Blue"); 
		hs1.add("Grey");
		hs1.add("Orange");
		for(String s: hs){
		    if(hs1.contains(s)){ //Compare two HashSets
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}
	}
}

