package employee;

public class HourlyEmployee extends Employee {
	private double hourlySalary;
	
	public HourlyEmployee(String name, String title, int id, double hourlySalary) {
		super(name, title, id); // call parent's constructor
		this.hourlySalary = hourlySalary;
	}

	public double getHourlySalary() {
		return hourlySalary;
	}

	public void setHourlySalary(double hourlySalary) {
		this.hourlySalary = hourlySalary;
	}
	
	public double getCompensation2017() {
		return ((((hourlySalary * 8) * 5) * 52));
	}
	
	public double getRaise() {
		this.hourlySalary = ((((hourlySalary * 1.1) * 8) * 5) * 52);
		return hourlySalary;
	}
}

