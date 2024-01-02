package employee;

public class CommissionedEmployee extends Employee {
	double commissionRate;
	double annualSales;
	
	public CommissionedEmployee(String name, String title, int id, double commissionRate, 
			double annualSales) {
		super(name, title, id);
		this.commissionRate = commissionRate;
		this.annualSales = annualSales;	
	}
	
	public double getCommissionRate() {
		return commissionRate;
	}
	
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	
	public double getCompensation2017() {
		return commissionRate * annualSales;
	}
	
	public double getRaise() {
		this.commissionRate = commissionRate * 1.1;
		return commissionRate * annualSales;
	}
}
