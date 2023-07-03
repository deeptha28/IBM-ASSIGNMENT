import java.util.*;
public class Main
{
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<>();
		ts.add("Blue"); 
		ts.add("Grey");
		ts.add("Green"); 
		ts.add("Orange");
		String f= ts.first(); //First Element
		System.out.println("First Element: "+f);
		String l=ts.last(); //Last Element
		System.out.println("Last Element: "+l);
	}
}