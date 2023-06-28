package project1;
public class Enum1
{
    public enum Weekdays {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }
	public static void main(String[] args) {
	    Weekdays wd = Weekdays.TUESDAY;
	    System.out.println("Today is "+wd);
		
	}
}