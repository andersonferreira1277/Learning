package estudoHibernate;


public class Employee {
	
	private int id;
	
	private String first_name;
	
	private String last_name;
	
	private float salary;
	
	
	public Employee(String fName, String lName, float salary) {
		
		this.first_name = fName;
		this.last_name = lName;
		this.salary = salary;
	}


	public int getId() {
		return id;
	}


	public String getFirst_name() {
		return first_name;
	}


	public String getLast_name() {
		return last_name;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public float getSalary() {
		return salary;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}
