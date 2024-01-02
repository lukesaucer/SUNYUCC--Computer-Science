package employee;

// Assignment # 7 - Lucas Saucer
// Fred, Wilma, Barney and Betty were characters on the Flintstones.
// Their pet dinosaur was named, "Dino".

// Parent Class (What's common for all types of employees)
public abstract class Employee {
	private String name;
	private String title;
	private int id;
	
	// Constructor which is called automatically by Java
	public Employee() {
		name = "Unknown";
	}
	
	// Constructor which can be called when creating subclass objects using super
	public Employee(String name, String title, int id) {
		this.setName(name);
		this.setTitle(title);
		this.setId(id);
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	abstract double getCompensation2017();
	
	abstract double getRaise();
	
	
	//public double getRaise(int salary){
		//return salary + (salary * 0.1);
	//}
	
}
