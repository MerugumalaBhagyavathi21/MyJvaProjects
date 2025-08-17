package oopsConcepts;

public class Employee1 {

	
		
		    // Instance variables (non-static)
		    private String name;
		    private float salary;

		    // Constructor
		    public Employee1(String name, float salary) {
		        this.name = name;
		        this.salary = salary;
		    }

		    // getters method
		    public String getName() { return name; }
		    public float getSalary() { return salary; }

		    // setters method
		    public void setName(String name) { this.name = name; }
		    public void setSalary(float salary) { this.salary = salary; }

		    // Instance method
		    public void displayDetails() {
		        System.out.println("Employee: " + name);
		        System.out.println("Salary: " + salary);
		    }

		    public static void main(String[] args) {
		        Employee1 emp = new Employee1("Geek", 10000.0f);
		        emp.displayDetails();
		    
		}
	

}
