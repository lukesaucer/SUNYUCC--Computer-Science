package employee;

// Assignment #3 Lucas Saucer

public class Employee {
	private String name;
	private Integer employeeIdentification;
	private Double annualSalary;
	
	// constructor
	
	public Employee (String name, Integer employeeIdentification, Double annualSalary) {
		this.name = name;
		this.employeeIdentification = employeeIdentification;
		this.annualSalary = annualSalary;
	}
	
	public void raise (double annualSalary) {
		if (annualSalary > 0.0)
			annualSalary = annualSalary * 1.1;
	}
	
	// getters and setters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getEmployeeIdentification() {
		return employeeIdentification;
	}
	public void setEmployeeIdentification(Integer employeeIdentification) {
		this.employeeIdentification = employeeIdentification;
	}
	public Double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(Double annualSalary) {
		if (annualSalary < 0.0)
			this.annualSalary = 0.0;
		else
			this.annualSalary = annualSalary;
	}
	
	

}
