package employee;

// Annual Salaried Employee
public class AnnualEmployee extends Employee {
	private double annualSalary;
	
	public AnnualEmployee(String name, String title, int id, double annualSalary) {
		super(name, title, id); // call parent's constructor
		this.annualSalary = annualSalary;
	}

	// Getters and Setters
	
	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	public double getCompensation2017() {
		return annualSalary;
	}
	
	public double getRaise() {
		this.annualSalary = annualSalary * 1.1;
		return annualSalary;
	}
	
}
