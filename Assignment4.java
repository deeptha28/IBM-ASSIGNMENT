package project1;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class Date {
	
	private int year;
	private int month;
	private int day;
	
	public Date(int year,int month,int day) {
		this.year=year;
		this.month=month;
		this.day=day;
	}
	
	public boolean validMonth() {
		return month>=1 && month<=12;
	}
	
	public boolean validDay() {
		YearMonth yearMonth= YearMonth.of(year, month);
		int daysInMonth = yearMonth.lengthOfMonth();
		return day>=1 && day<=daysInMonth;
	}
	
	public void printNextDay() {
		LocalDate currentDate = LocalDate.of(year, month, day);
		LocalDate nextDay = currentDate.plusDays(1);
		System.out.println("Next day is: "+nextDay);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Year: ");
		int tempYear = sc.nextInt();
		System.out.println("Month: ");
		int tempMonth = sc.nextInt();
		System.out.println("Day: ");
		int tempDay = sc.nextInt();
		Date date = new Date(tempYear,tempMonth,tempDay);
		
		if (!date.validMonth()) {
			System.out.println("Invalid Month!");
		}
		else if(!date.validDay()) {
			System.out.println("Invalid Day!");
		}
		else {
			date.printNextDay();
		}

	}

}