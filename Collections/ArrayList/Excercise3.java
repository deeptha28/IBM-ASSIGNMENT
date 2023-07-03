import java.util.*;
public class Main
{
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Grey");
		colors.add(0,"Orange"); //Insert an element
		System.out.println(colors);
	}
}