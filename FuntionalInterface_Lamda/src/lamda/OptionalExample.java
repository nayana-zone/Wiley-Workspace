package lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101,"Nayana",50000);
		Employee e2 = new Employee(102,"Dheeksha",50000);
		Employee e3 = new Employee(103,"Ani",50000);
		
		List <Employee> employees = new ArrayList<>(List.of(e1,e2,e3));
		
		int id = 102;
		
		// Find an employee with the given id
        Optional<Employee> employeeOptional = employees.stream()
                                                        .filter(emp -> emp.getId() == id)
                                                        .findFirst();
        
        employeeOptional.ifPresent(emp -> {
            System.out.println("Found employee: " + emp.getName());

        
            double increasedSalary = emp.getSalary() * 1.20;
            emp.setSalary(increasedSalary);
            System.out.println("Salary increased for employee " + emp.getName() + " to " + emp.getSalary());
        });
    }
	}



class Employee {
   
	private int id;
    private String name;
    private double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	 public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
}
