import java.util.*;
public class Assignment1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Salary: ");
		int salary=sc.nextInt();
		int tax=0;
		if(salary<=50000) {
			tax=0;
		}
		else if(salary>50000 && salary <=60000) {
		    tax=(salary-50000)*10/100;
		}
		else if(salary>60000 && salary <=150000) {
			tax=(salary-60000)*20/100;
		}
		else if(salary>150000) {
			tax=(salary)*30/100;
		}
		System.out.println("Income tax is "+tax);
	}
}