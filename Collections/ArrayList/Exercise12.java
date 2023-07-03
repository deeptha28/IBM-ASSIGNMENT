import java.util.*;
public class Main
{
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Orange");
		colors.add("Pink");
		System.out.println("Original List: "+colors);
		List<String> sl=colors.subList(0,2); //Extract a portion of an ArrayList
		System.out.println("subList: "+sl);
	    
	}
}
