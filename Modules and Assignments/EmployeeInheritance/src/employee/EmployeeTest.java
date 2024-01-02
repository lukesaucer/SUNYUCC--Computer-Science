package employee;

// Assignment # 7 - Lucas Saucer
// Fred, Wilma, Barney and Betty were characters on the Flintstones.
// Their pet dinosaur was named, "Dino".

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee fred = new HourlyEmployee("Fred", "Salesperson", 1, 10);
		System.out.printf("Name: %s \t Compensation for 2017: $%.2f \t Compensation for 2018: $%.2f %n", fred.getName(), fred.getCompensation2017(), fred.getRaise());
		
		Employee wilma = new AnnualEmployee("Wilma", "General Manager", 3, 50000);
		System.out.printf("Name: %s \t Compensation for 2017: $%.2f \t Compensation for 2018: $%.2f %n", wilma.getName(), wilma.getCompensation2017(), wilma.getRaise());
		
		Employee barney = new CommissionedEmployee("Barney", "Salesperson", 2, .10, 500000);
		System.out.printf("Name: %s \t Compensation for 2017: $%.2f \t Compensation for 2018: $%.2f %n", barney.getName(), barney.getCompensation2017(), barney.getRaise());
		
		
		Employee betty = new CommissionedPlusBaseEmployee("Betty", "Sales Leader", 4, .05, 200000, 40000);
		System.out.printf("Name: %s \t Compensation for 2017: $%.2f \t Compensation for 2018: $%.2f %n", betty.getName(), betty.getCompensation2017(), betty.getRaise());
	}

}
