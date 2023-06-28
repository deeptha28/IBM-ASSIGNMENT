package project1;
public class Enum2
{
    public enum Weekend {
        SATURDAY,
        SUNDAY
    }
	public static void main(String[] args) {
	    Weekend firstweekend = Weekend.SATURDAY;
	    Weekend secondweekend = Weekend.SUNDAY;
	    System.out.println("The first day of the weekend is "+firstweekend);
	    System.out.println("The second day of the weekend is "+secondweekend);
		
	}
}