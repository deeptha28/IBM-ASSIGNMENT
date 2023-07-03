package exceptionproject;

import java.io.IOException;

public class App {

	public static void main(String args[]) {
		EmployeeFactory factory = new EmployeeFactory();
		try {
			factory.createEmployee();
		} catch (NumberFormatException e) {
			System.err.println("error occured...!"+e.getMessage());
		} catch (SalaryCheckException e) {
			System.err.println(e.getErrorMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

	}

}