import java.util.*;
public class Main
{
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Grey");
		colors.add("Orange");
		System.out.println("Before Sorting: "+colors);
		Collections.sort(colors); //Sort a given ArrayList
		System.out.println("After Sorting: "+colors);
		
	}
}