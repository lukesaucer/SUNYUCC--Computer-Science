package employee;

public class CommissionedPlusBaseEmployee extends Employee {
	double commissionRate;
	double annualSales;
	double baseSalary;
	
	
	public CommissionedPlusBaseEmployee(String name, String title, int id, double commissionRate, 
			double annualSales,double baseSalary) {
		super(name, title, id);
		this.commissionRate = commissionRate;
		this.annualSales = annualSales;	
		this.baseSalary = baseSalary;
	}
	
	public double getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	
	public double getCompensation() {
		return (baseSalary + (commissionRate * annualSales));
	}
	
	public double getCompensation2017() {
		return (commissionRate * annualSales) + baseSalary;
	}
	
	public double getRaise() {
		this.commissionRate = commissionRate * 1.1;
		this.baseSalary = baseSalary * 1.1;
		return ((commissionRate * annualSales) + baseSalary);
	}
}

