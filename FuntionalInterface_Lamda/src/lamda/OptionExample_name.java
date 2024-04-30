package lamda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class OptionExample_name {
public static void main(String[] args) {
		
		Employee e1 = new Employee(101,"Nayana",50000);
		Employee e2 = new Employee(102,"Dheeksha",50000);
		Employee e3 = new Employee(103,"Ani",50000);
		
		//List <Employee> employees = new ArrayList<>(List.of(e1,e2,e3));
		
		Map<Integer,Employee>employees = new HashMap<>();
		
		employees.put(e1.getId(),e1);
		employees.put(e2.getId(),e2);
		employees.put(e3.getId(),e3);
		
		String name = "Nayana";
		
		 Optional<Employee> emps = employees.values().stream()
                                               .filter(emp -> emp.getName().equals(name))
                                               .findFirst();
		 
		 emps.ifPresent(emp -> {
	            System.out.println("Employee found:"+emp.getName());
         });
}
}
