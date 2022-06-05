

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {

	public static void main(String[] args) {

		  List<Employee> getEmployees=
			        Stream.of(new Employee(101,"john","A",60000),
			              new Employee(109,"peter","B",30000),
			              new Employee(102,"mak","A",80000),
			              new Employee(103,"kim","B",90000),
			              new Employee(104,"john","C",35000))
			              .collect(Collectors.toList());
			     
		  //System.out.println(getEmployees);
		  
		 List<Employee> list = getEmployees.stream().map(a->{
			  if(a.getGrade()=="A") {
				  a.setSalary(a.getSalary()*1.10);
			  }
			  return a;
		  }).collect(Collectors.toList());
		  
	
		  
		  Stream<Employee> sort = getEmployees.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary));
		
		sort.forEach(x->System.out.println(x));
	}

}
