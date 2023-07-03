import java.util.*;
public class Main
{
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Grey");
		colors.add(0,"Orange");
		if(colors.contains("Grey")){ //search for an element
		    System.out.println("Element found");
		}
		else{
		    System.out.println("Element not found");
		}
	}
}