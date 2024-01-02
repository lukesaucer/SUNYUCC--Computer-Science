package employee;

// Assignment #3 Lucas Saucer

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String [] args) {
		
		Employee employeeJohn = new Employee("John", 1, 1000.00);
		Employee employeeSue = new Employee("Sue", 2, 2000.00);
		
		System.out.printf("Employee: %s%n", employeeJohn.getName());
		System.out.printf("Employee Identification Number: %s%n" , employeeJohn.getEmployeeIdentification());
		System.out.printf("Employee Salary: $%.2f%n", employeeJohn.getAnnualSalary());
	
		System.out.println(" ");
		
		System.out.printf("Employee: %s%n", employeeSue.getName());
		System.out.printf("Employee Identification Number: %s%n" , employeeSue.getEmployeeIdentification());
		System.out.printf("Employee Salary: $%.2f%n", employeeSue.getAnnualSalary());
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		
		employeeJohn.setAnnualSalary(employeeJohn.getAnnualSalary() * 1.1);
		employeeSue.setAnnualSalary(employeeSue.getAnnualSalary() * 1.1);
		
		
		System.out.printf("Employee: %s%n", employeeJohn.getName());
		System.out.printf("Employee Identification Number: %s%n" , employeeJohn.getEmployeeIdentification());
		System.out.printf("Employee Salary: $%.2f%n", employeeJohn.getAnnualSalary());
	
		System.out.println(" ");
		
		System.out.printf("Employee: %s%n", employeeSue.getName());
		System.out.printf("Employee Identification Number: %s%n" , employeeSue.getEmployeeIdentification());
		System.out.printf("Employee Salary: $%.2f%n", employeeSue.getAnnualSalary());
	}	
	
}
