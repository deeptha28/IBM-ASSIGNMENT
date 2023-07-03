import java.util.*;
public class Main
{
	public static void main(String[] args) {
		TreeMap<String,String> tmap=new TreeMap<>();
		tmap.put("Riya","Radha");
		tmap.put("Syra","Sara");
		tmap.put("Dinesh","Deepika");
		System.out.println(tmap);
	}
}
class sort_key implements Comparator<String>{
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
}