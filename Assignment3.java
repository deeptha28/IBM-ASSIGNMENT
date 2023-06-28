import java.util.*;
class clock{
    int hours;
    int minutes;
    int seconds;
    
    clock(int h,int m,int s){
        hours=h;
        minutes=m;
        seconds=s;
    }
    void timevalidity(){
        if(hours>=0 && hours<=24 && minutes>0 && minutes <60 && seconds >0 && seconds < 60){
            System.out.println("Time is Valid");
        }
        else{
            System.out.println("Time is Invalid");
        }
    }
    void timemode(){
        if(hours<12){
            System.out.println("Time is "+hours+ ":" +minutes+ ":" +seconds+ "AM");
        }
    else{
        hours=hours-12;
        System.out.println("Time is "+hours+ ":" +minutes+ ":" +seconds+ "PM");
        
    }
    }
}

public class Assignment3
{
	public static void main(String[] args) {
		clock cl = new clock(16,20,54);
		cl.timevalidity();
		cl.timemode();
		
	}
}
