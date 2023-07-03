import java.util.*;
public class Main
{
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		System.out.println("ArrayList1 before copying: "+colors);
		ArrayList<String> colors1 = new ArrayList<>();
		colors1.add("gold");
		colors1.add("silver");
		colors1.add("bronze");
		System.out.println("ArrayList2 before copying: "+colors1);
		Collections.copy(colors,colors1); //copy colors1 to colors
		System.out.println("ArrayList1 after copying: "+colors);
		System.out.println("ArrayList1 after copying: "+colors);
		
	}
}