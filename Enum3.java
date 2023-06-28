package project1;
public class Enum3 {
    public enum months {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
        
    }
    public static void main(String[] args){
        months birthday = months.OCTOBER;
        System.out.println("Birthday month: "+birthday);
    }
}