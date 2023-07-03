import java.util.*;
public class Main
{
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		System.out.println("ArrayList before shuffling: "+colors);
		Collections.shuffle(colors); //Shuffle elements in an ArrayList
		System.out.println("ArrayList after shuffling: "+colors);
		
		
	}
}
